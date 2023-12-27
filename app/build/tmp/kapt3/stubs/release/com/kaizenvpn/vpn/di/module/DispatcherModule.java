package com.kaizenvpn.vpn.di.module;

/**
 * Created by Furuichi on 07/09/2023
 */
@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/kaizenvpn/vpn/di/module/DispatcherModule;", "", "()V", "provideDefaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideFixedThreadPool", "providesCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatcher", "providesIoDispatcher", "providesMainDispatcher", "providesMainImmediateDispatcher", "app_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DispatcherModule {
    
    public DispatcherModule() {
        super();
    }
    
    @javax.inject.Singleton
    @com.kaizenvpn.vpn.di.qualifier.ApplicationScope
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineScope providesCoroutineScope(@com.kaizenvpn.vpn.di.qualifier.DefaultDispatcher
    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        return null;
    }
    
    @com.kaizenvpn.vpn.di.qualifier.DefaultDispatcher
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineDispatcher provideDefaultDispatcher() {
        return null;
    }
    
    @com.kaizenvpn.vpn.di.qualifier.IoDispatcher
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineDispatcher providesIoDispatcher() {
        return null;
    }
    
    @com.kaizenvpn.vpn.di.qualifier.FixedThreadPool
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineDispatcher provideFixedThreadPool() {
        return null;
    }
    
    @com.kaizenvpn.vpn.di.qualifier.MainDispatcher
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineDispatcher providesMainDispatcher() {
        return null;
    }
    
    @dagger.Provides
    @com.kaizenvpn.vpn.di.qualifier.MainImmediateDispatcher
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineDispatcher providesMainImmediateDispatcher() {
        return null;
    }
}