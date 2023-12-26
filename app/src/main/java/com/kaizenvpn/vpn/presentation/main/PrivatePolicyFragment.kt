package com.kaizenvpn.vpn.presentation.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.kaizenvpn.vpn.core.base.BaseDialogFragment
import com.kaizenvpn.vpn.core.base.BaseViewModel
import com.kaizenvpn.vpn.databinding.FragmentPrivatePolicyBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by Furuichi on 25/09/2023
 */
@AndroidEntryPoint
class PrivatePolicyFragment : BaseDialogFragment<BaseViewModel, FragmentPrivatePolicyBinding>(FragmentPrivatePolicyBinding::inflate) {

    override val viewModel: BaseViewModel by viewModels()

    override fun onFragmentCreated(view: View, savedInstanceState: Bundle?) {
        setupViews()
        bindState()
    }

    /**
     * SETUP VIEWS
     */
    private fun setupViews() {
        viewBinding.btnClose.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    /**
     * STATE
     */
    private fun bindState() {

    }

}