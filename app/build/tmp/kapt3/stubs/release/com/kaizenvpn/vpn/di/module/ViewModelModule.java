package com.kaizenvpn.vpn.di.module;

/**
 * Created by Furuichi on 26/09/2023
 */
@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/kaizenvpn/vpn/di/module/ViewModelModule;", "", "()V", "provideIapConnector", "Lcom/limerse/iap/IapConnector;", "app_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
public final class ViewModelModule {
    
    public ViewModelModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.limerse.iap.IapConnector provideIapConnector() {
        return null;
    }
}