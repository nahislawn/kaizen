package com.kaizenvpn.vpn.di.module;

/**
 * Created by Furuichi on 07/09/2023
 */
@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/kaizenvpn/vpn/di/module/LocalModule;", "", "()V", "provideDataStoreManager", "Lcom/kaizenvpn/vpn/data/preferences/DataStoreManager;", "dataStoreManagerImpl", "Lcom/kaizenvpn/vpn/data/preferences/DataStoreManagerImpl;", "app_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class LocalModule {
    @org.jetbrains.annotations.NotNull
    public static final com.kaizenvpn.vpn.di.module.LocalModule INSTANCE = null;
    
    private LocalModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.kaizenvpn.vpn.data.preferences.DataStoreManager provideDataStoreManager(@org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.data.preferences.DataStoreManagerImpl dataStoreManagerImpl) {
        return null;
    }
}