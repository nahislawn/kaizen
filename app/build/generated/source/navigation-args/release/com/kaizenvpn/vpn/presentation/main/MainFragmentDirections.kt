package com.kaizenvpn.vpn.presentation.main

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.kaizenvpn.vpn.NavMainGraphDirections
import com.kaizenvpn.vpn.R

public class MainFragmentDirections private constructor() {
  public companion object {
    public fun actionMainFragmentToNavAuthGraph(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_nav_auth_graph)

    public fun actionToPrivatePolicyFragment(): NavDirections =
        NavMainGraphDirections.actionToPrivatePolicyFragment()
  }
}
