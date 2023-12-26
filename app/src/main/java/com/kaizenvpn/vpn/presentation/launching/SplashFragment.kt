package com.kaizenvpn.vpn.presentation.launching

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.kaizenvpn.vpn.R
import com.kaizenvpn.vpn.core.base.BaseFragment
import com.kaizenvpn.vpn.core.base.BaseViewModel
import com.kaizenvpn.vpn.core.util.PrefManager
import com.kaizenvpn.vpn.databinding.FragmentSplashBinding
import com.kaizenvpn.vpn.presentation.IntroActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


/**
 * Created by Furuichi on 25/09/2023
 */
@AndroidEntryPoint
class SplashFragment : BaseFragment<BaseViewModel, FragmentSplashBinding>(FragmentSplashBinding::inflate) {

    override val viewModel: BaseViewModel by viewModels()

    private var prf: PrefManager? = null

    override fun onFragmentCreated(view: View, savedInstanceState: Bundle?) {

        prf = PrefManager(context);

        uiScope.launch {

            if (!prf!!.getString("first").equals("true")) {
                val intent = Intent(context, IntroActivity::class.java)
                startActivity(intent)
                requireActivity().finish()
                prf!!.setString("first", "true")
            }else{
                delay(5000)
                findNavController().navigate(R.id.action_splashFragment_to_nav_main_graph)
            }


        }
    }
}