package com.kaizenvpn.vpn.presentation.main.tab

import android.os.Bundle
import android.view.View
import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import com.kaizenvpn.vpn.R
import com.kaizenvpn.vpn.core.base.BaseFragment
import com.kaizenvpn.vpn.core.base.IndicatorState
import com.kaizenvpn.vpn.core.extension.mapToProperty
import com.kaizenvpn.vpn.databinding.FragmentLocationBinding
import com.kaizenvpn.vpn.presentation.main.MainViewModel
import com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction
import com.kaizenvpn.vpn.presentation.main.MainViewModel.UIState
import com.kaizenvpn.vpn.presentation.main.adapter.LocationAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Created by Furuichi on 25/09/2023
 */
@AndroidEntryPoint
class LocationFragment : BaseFragment<MainViewModel, FragmentLocationBinding>(FragmentLocationBinding::inflate) {

    override val viewModel: MainViewModel by hiltNavGraphViewModels(R.id.nav_main_graph)

    private val locationAdapter: LocationAdapter
        get() = viewBinding.rvLocation.adapter as LocationAdapter

    override fun onFragmentCreated(view: View, savedInstanceState: Bundle?) {
        setupViews()
        bindState()
    }

    override fun handleError(error: IndicatorState.Error) {}

    /**
     * SETUP VIEWS
     */
    private fun setupViews() {
        viewBinding.rvLocation.apply {
            setHasFixedSize(true)
            adapter = LocationAdapter {
                viewModel.accept(UIAction.SetCurrentVPNServer(vpnServer = it))
            }
        }


    }

    /**
     * STATE
     */
    private fun bindState() {
        viewModel.uiState
            .mapToProperty(UIState::servers)
            .onEach(locationAdapter::submitList)
            .launchIn(uiScope)

        viewModel.uiState
            .mapToProperty(UIState::currentServer)
            .onEach(locationAdapter::setCurrentServer)
            .launchIn(uiScope)

    }


}