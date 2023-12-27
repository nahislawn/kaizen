package com.kaizenvpn.vpn.presentation.main.tab;

/**
 * Created by Furuichi on 25/09/2023
 */
@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000bH\u0002R\u001b\u0010\u0005\u001a\u00020\u00028VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u001b"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/tab/AccountFragment;", "Lcom/kaizenvpn/vpn/core/base/BaseFragment;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel;", "Lcom/kaizenvpn/vpn/databinding/FragmentAccountBinding;", "()V", "viewModel", "getViewModel", "()Lcom/kaizenvpn/vpn/presentation/main/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindPurchaseInfo", "", "purchaseInfo", "Lcom/limerse/iap/DataWrappers$PurchaseInfo;", "bindState", "bindUserInfo", "userInfo", "Lcom/kaizenvpn/vpn/data/model/UserInfo;", "handleError", "error", "Lcom/kaizenvpn/vpn/core/base/IndicatorState$Error;", "onFragmentCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "app_release"})
public final class AccountFragment extends com.kaizenvpn.vpn.core.base.BaseFragment<com.kaizenvpn.vpn.presentation.main.MainViewModel, com.kaizenvpn.vpn.databinding.FragmentAccountBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    
    public AccountFragment() {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.kaizenvpn.vpn.presentation.main.MainViewModel getViewModel() {
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
    
    private final void bindUserInfo(com.kaizenvpn.vpn.data.model.UserInfo userInfo) {
    }
    
    private final void bindPurchaseInfo(com.limerse.iap.DataWrappers.PurchaseInfo purchaseInfo) {
    }
}