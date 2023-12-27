package com.kaizenvpn.vpn.di.module;

/**
 * Created by Furuichi on 25/09/2023
 */
@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lcom/kaizenvpn/vpn/di/module/RepositoryModule;", "", "()V", "provideCommonRepository", "Lcom/kaizenvpn/vpn/data/repository/CommonRepository;", "impl", "Lcom/kaizenvpn/vpn/data/repository/CommonRepositoryImpl;", "provideServerRepository", "Lcom/kaizenvpn/vpn/data/repository/ServerRepository;", "Lcom/kaizenvpn/vpn/data/repository/ServerRepositoryImpl;", "provideUserRepository", "Lcom/kaizenvpn/vpn/data/repository/UserRepository;", "Lcom/kaizenvpn/vpn/data/repository/UserRepositoryImpl;", "app_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract com.kaizenvpn.vpn.data.repository.UserRepository provideUserRepository(@org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.data.repository.UserRepositoryImpl impl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract com.kaizenvpn.vpn.data.repository.CommonRepository provideCommonRepository(@org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.data.repository.CommonRepositoryImpl impl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract com.kaizenvpn.vpn.data.repository.ServerRepository provideServerRepository(@org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.data.repository.ServerRepositoryImpl impl);
}