package com.kaizenvpn.vpn.presentation;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/MainActivity;", "Lcom/kaizenvpn/vpn/core/base/BaseActivity;", "Lcom/kaizenvpn/vpn/databinding/ActivityMainBinding;", "()V", "isFlagLight", "", "()Z", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "app_release"})
public final class MainActivity extends com.kaizenvpn.vpn.core.base.BaseActivity<com.kaizenvpn.vpn.databinding.ActivityMainBinding> {
    
    public MainActivity() {
        super(null);
    }
    
    @java.lang.Override
    public void onActivityCreated(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public boolean isFlagLight() {
        return false;
    }
}