package com.kaizenvpn.vpn.presentation.main

import androidx.navigation.NavDirections
import com.kaizenvpn.vpn.NavMainGraphDirections

public class PrivatePolicyFragmentDirections private constructor() {
  public companion object {
    public fun actionToPrivatePolicyFragment(): NavDirections =
        NavMainGraphDirections.actionToPrivatePolicyFragment()
  }
}
