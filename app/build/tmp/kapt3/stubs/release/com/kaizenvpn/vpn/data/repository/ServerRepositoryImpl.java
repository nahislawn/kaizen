package com.kaizenvpn.vpn.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/kaizenvpn/vpn/data/repository/ServerRepositoryImpl;", "Lcom/kaizenvpn/vpn/data/repository/ServerRepository;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "firebaseService", "Lcom/kaizenvpn/vpn/data/remote/FirebaseService;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/kaizenvpn/vpn/data/remote/FirebaseService;)V", "getServers", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kaizenvpn/vpn/data/model/VPNServer;", "app_release"})
public final class ServerRepositoryImpl implements com.kaizenvpn.vpn.data.repository.ServerRepository {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    @org.jetbrains.annotations.NotNull
    private final com.kaizenvpn.vpn.data.remote.FirebaseService firebaseService = null;
    
    @javax.inject.Inject
    public ServerRepositoryImpl(@com.kaizenvpn.vpn.di.qualifier.IoDispatcher
    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher, @org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.data.remote.FirebaseService firebaseService) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.kaizenvpn.vpn.data.model.VPNServer>> getServers() {
        return null;
    }
}