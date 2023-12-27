package com.kaizenvpn.vpn.presentation.main.tab;

/**
 * Created by Furuichi on 25/09/2023
 */
@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0002R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\u00028VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/tab/LocationFragment;", "Lcom/kaizenvpn/vpn/core/base/BaseFragment;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel;", "Lcom/kaizenvpn/vpn/databinding/FragmentLocationBinding;", "()V", "locationAdapter", "Lcom/kaizenvpn/vpn/presentation/main/adapter/LocationAdapter;", "getLocationAdapter", "()Lcom/kaizenvpn/vpn/presentation/main/adapter/LocationAdapter;", "viewModel", "getViewModel", "()Lcom/kaizenvpn/vpn/presentation/main/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindState", "", "handleError", "error", "Lcom/kaizenvpn/vpn/core/base/IndicatorState$Error;", "onFragmentCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "app_release"})
public final class LocationFragment extends com.kaizenvpn.vpn.core.base.BaseFragment<com.kaizenvpn.vpn.presentation.main.MainViewModel, com.kaizenvpn.vpn.databinding.FragmentLocationBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    
    public LocationFragment() {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.kaizenvpn.vpn.presentation.main.MainViewModel getViewModel() {
        return null;
    }
    
    private final com.kaizenvpn.vpn.presentation.main.adapter.LocationAdapter getLocationAdapter() {
        return null;
    }
    
    @java.lang.Override
    public void onFragmentCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void handleError(@org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.core.base.IndicatorState.Error error) {
    }
    
    /**
     * SETUP VIEWS
     */
    private final void setupViews() {
    }
    
    /**
     * STATE
     */
    private final void bindState() {
    }
}