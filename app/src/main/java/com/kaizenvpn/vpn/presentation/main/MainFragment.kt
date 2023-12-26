package com.kaizenvpn.vpn.presentation.main

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.drawerlayout.widget.DrawerLayout.LOCK_MODE_LOCKED_CLOSED
import androidx.fragment.app.Fragment
import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import androidx.navigation.findNavController
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.kaizenvpn.vpn.R
import com.kaizenvpn.vpn.core.base.BaseFragment
import com.kaizenvpn.vpn.core.base.updateLightStatusBar
import com.kaizenvpn.vpn.core.extension.hide
import com.kaizenvpn.vpn.core.extension.mapToProperty
import com.kaizenvpn.vpn.core.extension.show
import com.kaizenvpn.vpn.databinding.FragmentMainBinding
import com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction
import com.kaizenvpn.vpn.presentation.main.MainViewModel.UIState
import com.kaizenvpn.vpn.presentation.main.adapter.MainAdapter
import com.kaizenvpn.vpn.presentation.main.adapter.MenuAdapter
import com.kaizenvpn.vpn.presentation.main.tab.AccountFragment
import com.kaizenvpn.vpn.presentation.main.tab.HomeFragment
import com.kaizenvpn.vpn.presentation.main.tab.LocationFragment
import com.kaizenvpn.vpn.presentation.main.tab.SettingFragment
import com.kaizenvpn.vpn.presentation.main.tab.UpgradeFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.json.JSONException


/**
 * Created by Furuichi on 25/09/2023
 */
@AndroidEntryPoint
class MainFragment : BaseFragment<MainViewModel, FragmentMainBinding>(FragmentMainBinding::inflate) {

    override val viewModel: MainViewModel by hiltNavGraphViewModels(R.id.nav_main_graph)

    enum class Tab {
        Home,
        Upgrade,
        Account,
        Location,
        Setting
        ;

        val fragment: Fragment
            get() = when (this) {
                Home -> HomeFragment()
                Upgrade -> UpgradeFragment()
                Account -> AccountFragment()
                Location -> LocationFragment()
                Setting -> SettingFragment()
            }

        val title: String
            get() = when (this) {
                Home -> "Home"
                Upgrade -> "Upgrade to VIP"
                Account -> "Account"
                Location -> "Select a Location"
                Setting -> "Setting"
            }

        val iconRes: Int
            get() = when (this) {
                Home -> R.drawable.ic_home
                Upgrade -> R.drawable.ic_vip
                Account -> R.drawable.ic_user_shield
                else -> 0
            }
    }

    private val drawerToggle = object : DrawerLayout.DrawerListener {

        override fun onDrawerOpened(drawerView: View) {
            activity?.updateLightStatusBar(false)
        }

        override fun onDrawerClosed(drawerView: View) {
            activity?.updateLightStatusBar(viewBinding.viewPager.currentItem == Tab.Upgrade.ordinal)
        }

        override fun onDrawerSlide(drawerView: View, slideOffset: Float) {}
        override fun onDrawerStateChanged(newState: Int) {}
    }
    private val menuAdapter: MenuAdapter
        get() = viewBinding.rvMenu.adapter as MenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.accept(UIAction.FetchData)
    }

    override fun onFragmentCreated(view: View, savedInstanceState: Bundle?) {
        setupViews()
        bindState()
        bindCommand()
    }

    override fun onResume() {
        super.onResume()
        viewBinding.drawerLayout.addDrawerListener(drawerToggle)
    }

    override fun onPause() {
        super.onPause()
        viewBinding.drawerLayout.removeDrawerListener(drawerToggle)
    }

    /**
     * SETUP VIEWS
     */
    private fun setupViews() {
        viewBinding.viewPager.apply {
            isUserInputEnabled = false
            adapter = MainAdapter(childFragmentManager, viewLifecycleOwner.lifecycle)
        }

        viewBinding.drawerLayout.apply {
            setDrawerLockMode(LOCK_MODE_LOCKED_CLOSED)
        }

        viewBinding.btnMenu.setOnClickListener {
            if (viewBinding.viewPager.currentItem == Tab.Location.ordinal) {
                viewModel.accept(UIAction.SetCurrentTab(Tab.Home))
                return@setOnClickListener
            }
            if (viewBinding.viewPager.currentItem == Tab.Upgrade.ordinal) {
                viewModel.accept(UIAction.SetCurrentTab(Tab.Home))
                return@setOnClickListener
            }
            if (viewBinding.viewPager.currentItem == Tab.Home.ordinal) {
                viewModel.accept(UIAction.SetCurrentTab(Tab.Upgrade))
                return@setOnClickListener
            }
            if (viewBinding.viewPager.currentItem == Tab.Setting.ordinal) {
                viewModel.accept(UIAction.SetCurrentTab(Tab.Home))
                return@setOnClickListener
            }
            //viewBinding.drawerLayout.openDrawer(GravityCompat.START)
        }

        viewBinding.btnSetting.setOnClickListener {
            if (viewBinding.viewPager.currentItem == Tab.Home.ordinal) {
                viewModel.accept(UIAction.SetCurrentTab(Tab.Setting))
                return@setOnClickListener
            }

        }




        viewBinding.btnClose.setOnClickListener {
            viewBinding.drawerLayout.closeDrawer(GravityCompat.START)
        }

        viewBinding.rvMenu.apply {
            setHasFixedSize(true)
            adapter = MenuAdapter {
                viewBinding.drawerLayout.closeDrawer(GravityCompat.START)
                when (it) {
                    Tab.Home -> {
                        viewModel.accept(UIAction.SetCurrentTab(Tab.Home))
                    }

                    Tab.Upgrade -> {
                        viewModel.accept(UIAction.SetCurrentTab(Tab.Upgrade))
                    }

                    Tab.Account -> {
                        if (viewModel.uiState.value.userInfo == null) {
                            findNavController().navigate(R.id.action_mainFragment_to_nav_auth_graph)
                            return@MenuAdapter
                        }

                        viewModel.accept(UIAction.SetCurrentTab(Tab.Account))
                    }
                    Tab.Setting -> {
                        viewModel.accept(UIAction.SetCurrentTab(Tab.Setting))
                    }

                    else -> {}
                }
            }
        }
    }


    /**
     * STATE
     */
    private fun bindState() {
        Tab.values()
            .filter { it.iconRes != 0 }
            .toList()
            .also(menuAdapter::submitList)

        viewModel.uiState
            .mapToProperty(UIState::tab)
            .onEach(::setCurrentItem)
            .launchIn(uiScope)

        viewModel.uiState
            .mapToProperty(UIState::tab)
            .filter { it != Tab.Location }
            .onEach(menuAdapter::setCurrentTab)
            .launchIn(uiScope)

    }


    private var url = "http://www.ip-api.com/json"

    /**
     * COMMAND
     */
    private fun bindCommand() {
        val queue: RequestQueue = Volley.newRequestQueue(context)
        val jsonObjectRequest =
            JsonObjectRequest(Request.Method.GET, url, null,
                { response ->
                    try {

                        val country = response!!.getString("country")
                        val ip_address = response!!.getString("query")

//                        Toast.makeText(context,""+ip_address,Toast.LENGTH_SHORT).show()

                        val db = Firebase.firestore

                        val tsLong = System.currentTimeMillis() / 1000
                        val ts = tsLong.toString()

                        val ipModel = hashMapOf(
                            "country" to ""+country,
                            "ip_address" to ""+ip_address,
                            "id" to ""+ts,
                        )


                        db.collection("user_ip_address")
                            .document(ts) // <== Specify the Doc ID here
                            .set(ipModel)
                            .addOnSuccessListener {
//                                Toast.makeText(context,"Data Added Successfully",Toast.LENGTH_SHORT).show()
                                Log.d(
                                    "TAG",
                                    "DocumentSnapshot successfully written!"
                                )
                            }
                            .addOnFailureListener { e -> Log.w("TAG", "Error writing document", e)
//                                Toast.makeText(context,"Failed Data Added"+e.message,Toast.LENGTH_SHORT).show()
                            }


                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }) { error ->
                Toast.makeText(context, "Fail to get data.." + error!!.message, Toast.LENGTH_SHORT)
                    .show()
            }

        queue.add(jsonObjectRequest);
    }

    private fun setCurrentItem(tab: Tab) {
        viewBinding.viewPager.setCurrentItem(tab.ordinal, false)
        when (tab) {
            Tab.Home -> updateHomeUI()
            Tab.Upgrade -> updateUpgradeUI()
            Tab.Account -> updateAccountUI()
            Tab.Location -> updateLocationUI()
            Tab.Setting -> updateSettingUI()
        }
    }

    private fun updateHomeUI() {
        activity?.updateLightStatusBar(false)
        viewBinding.container.setBackgroundResource(R.color.primary)
        viewBinding.btnMenu.setImageResource(R.drawable.ads)
//        viewBinding.btnMenu.setColorFilter(ContextCompat.getColor(requireContext(), R.color.white));

        viewBinding.tvTitle.apply {
            show()
            setText(R.string.app_name)
        }
        viewBinding.tvUpgrade.hide()
        viewBinding.btnSetting.show()
    }

    private fun updateUpgradeUI() {
        activity?.updateLightStatusBar(false)
        viewBinding.container.setBackgroundResource(R.color.color_upgrade_background)
        viewBinding.btnMenu.setImageResource(R.drawable.ic_close)
        viewBinding.tvTitle.hide()
        viewBinding.tvUpgrade.show()
        viewBinding.btnSetting.hide()
    }


    private fun updateAccountUI() {
        activity?.updateLightStatusBar(false)
        viewBinding.container.setBackgroundResource(R.color.primary)
        viewBinding.btnMenu.setImageResource(R.drawable.ads)
        viewBinding.tvTitle.apply {
            show()
            setText(R.string.account)
        }
        viewBinding.tvUpgrade.hide()
        viewBinding.btnSetting.hide()
    }
    private fun updateSettingUI() {
        activity?.updateLightStatusBar(false)
        viewBinding.container.setBackgroundResource(R.color.primary)
        viewBinding.btnMenu.setImageResource(R.drawable.ic_close)
        viewBinding.tvTitle.apply {
            show()
            text = "Setting"
        }
        viewBinding.btnSetting.hide()
        viewBinding.tvUpgrade.hide()
    }
    private fun updateLocationUI() {
        activity?.updateLightStatusBar(false)
        viewBinding.container.setBackgroundResource(R.color.primary)
        viewBinding.btnMenu.setImageResource(R.drawable.ic_close)
        viewBinding.tvTitle.apply {
            show()
            text = Tab.Location.title
        }
        viewBinding.tvUpgrade.hide()
        viewBinding.btnSetting.hide()
    }




}