package com.kaizenvpn.vpn.presentation.launching

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.kaizenvpn.vpn.R

public class SplashFragmentDirections private constructor() {
  public companion object {
    public fun actionSplashFragmentToNavMainGraph(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashFragment_to_nav_main_graph)
  }
}
