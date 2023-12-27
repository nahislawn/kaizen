package com.kaizenvpn.vpn.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0016R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/kaizenvpn/vpn/data/repository/CommonRepositoryImpl;", "Lcom/kaizenvpn/vpn/data/repository/CommonRepository;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "firebaseService", "Lcom/kaizenvpn/vpn/data/remote/FirebaseService;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/kaizenvpn/vpn/data/remote/FirebaseService;)V", "_configState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/kaizenvpn/vpn/data/model/Config;", "configState", "Lkotlinx/coroutines/flow/StateFlow;", "getConfigState", "()Lkotlinx/coroutines/flow/StateFlow;", "getConfigs", "Lkotlinx/coroutines/flow/Flow;", "app_release"})
public final class CommonRepositoryImpl implements com.kaizenvpn.vpn.data.repository.CommonRepository {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    @org.jetbrains.annotations.NotNull
    private final com.kaizenvpn.vpn.data.remote.FirebaseService firebaseService = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.kaizenvpn.vpn.data.model.Config> _configState = null;
    
    @javax.inject.Inject
    public CommonRepositoryImpl(@com.kaizenvpn.vpn.di.qualifier.IoDispatcher
    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher, @org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.data.remote.FirebaseService firebaseService) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.StateFlow<com.kaizenvpn.vpn.data.model.Config> getConfigState() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.kaizenvpn.vpn.data.model.Config> getConfigs() {
        return null;
    }
}