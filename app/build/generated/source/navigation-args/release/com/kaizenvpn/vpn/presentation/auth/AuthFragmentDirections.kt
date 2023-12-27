package com.kaizenvpn.vpn.presentation.auth

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.kaizenvpn.vpn.R

public class AuthFragmentDirections private constructor() {
  public companion object {
    public fun actionAuthFragmentToForgotPasswordFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_authFragment_to_forgotPasswordFragment)
  }
}
