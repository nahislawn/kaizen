package com.kaizenvpn.vpn

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class NavMainGraphDirections private constructor() {
  public companion object {
    public fun actionToPrivatePolicyFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_to_privatePolicyFragment)
  }
}
