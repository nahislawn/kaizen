package com.kaizenvpn.vpn.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0011\u0010\u0016\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/kaizenvpn/vpn/data/repository/UserRepositoryImpl;", "Lcom/kaizenvpn/vpn/data/repository/UserRepository;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "firebaseService", "Lcom/kaizenvpn/vpn/data/remote/FirebaseService;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/kaizenvpn/vpn/data/remote/FirebaseService;)V", "_userInfoState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/kaizenvpn/vpn/data/model/UserInfo;", "userInfoState", "Lkotlinx/coroutines/flow/StateFlow;", "getUserInfoState", "()Lkotlinx/coroutines/flow/StateFlow;", "getCurrentUser", "Lkotlinx/coroutines/flow/Flow;", "", "resetPassword", "email", "", "signIn", "password", "signOut", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "syncPurchase", "purchase", "Lcom/limerse/iap/DataWrappers$PurchaseInfo;", "syncTraffic", "byteOut", "", "byteIn", "syncUserInfo", "app_release"})
public final class UserRepositoryImpl implements com.kaizenvpn.vpn.data.repository.UserRepository {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    @org.jetbrains.annotations.NotNull
    private final com.kaizenvpn.vpn.data.remote.FirebaseService firebaseService = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.kaizenvpn.vpn.data.model.UserInfo> _userInfoState = null;
    
    @javax.inject.Inject
    public UserRepositoryImpl(@com.kaizenvpn.vpn.di.qualifier.IoDispatcher
    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher, @org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.data.remote.FirebaseService firebaseService) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.StateFlow<com.kaizenvpn.vpn.data.model.UserInfo> getUserInfoState() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<kotlin.Unit> getCurrentUser() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.kaizenvpn.vpn.data.model.UserInfo> signIn(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.kaizenvpn.vpn.data.model.UserInfo> signUp(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<kotlin.Unit> resetPassword(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<kotlin.Unit> syncUserInfo() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<kotlin.Unit> syncTraffic(long byteOut, long byteIn) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<kotlin.Unit> syncPurchase(@org.jetbrains.annotations.Nullable
    com.limerse.iap.DataWrappers.PurchaseInfo purchase) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object signOut(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}