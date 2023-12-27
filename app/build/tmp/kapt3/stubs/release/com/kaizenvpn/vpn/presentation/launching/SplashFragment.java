package com.kaizenvpn.vpn.presentation.launching;

/**
 * Created by Furuichi on 25/09/2023
 */
@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/launching/SplashFragment;", "Lcom/kaizenvpn/vpn/core/base/BaseFragment;", "Lcom/kaizenvpn/vpn/core/base/BaseViewModel;", "Lcom/kaizenvpn/vpn/databinding/FragmentSplashBinding;", "()V", "prf", "Lcom/kaizenvpn/vpn/core/util/PrefManager;", "viewModel", "getViewModel", "()Lcom/kaizenvpn/vpn/core/base/BaseViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onFragmentCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_release"})
public final class SplashFragment extends com.kaizenvpn.vpn.core.base.BaseFragment<com.kaizenvpn.vpn.core.base.BaseViewModel, com.kaizenvpn.vpn.databinding.FragmentSplashBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable
    private com.kaizenvpn.vpn.core.util.PrefManager prf;
    
    public SplashFragment() {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.kaizenvpn.vpn.core.base.BaseViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onFragmentCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}