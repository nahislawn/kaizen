package com.kaizenvpn.vpn.data.repository;

/**
 * Created by Furuichi on 25/09/2023
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\fH&J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&J\u0011\u0010\u000f\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH&R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/kaizenvpn/vpn/data/repository/UserRepository;", "", "userInfoState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/kaizenvpn/vpn/data/model/UserInfo;", "getUserInfoState", "()Lkotlinx/coroutines/flow/StateFlow;", "getCurrentUser", "Lkotlinx/coroutines/flow/Flow;", "", "resetPassword", "email", "", "signIn", "password", "signOut", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "syncPurchase", "purchase", "Lcom/limerse/iap/DataWrappers$PurchaseInfo;", "syncTraffic", "byteOut", "", "byteIn", "syncUserInfo", "app_release"})
public abstract interface UserRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.StateFlow<com.kaizenvpn.vpn.data.model.UserInfo> getUserInfoState();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Unit> getCurrentUser();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.kaizenvpn.vpn.data.model.UserInfo> signIn(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.kaizenvpn.vpn.data.model.UserInfo> signUp(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Unit> resetPassword(@org.jetbrains.annotations.NotNull
    java.lang.String email);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Unit> syncUserInfo();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Unit> syncTraffic(long byteOut, long byteIn);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Unit> syncPurchase(@org.jetbrains.annotations.Nullable
    com.limerse.iap.DataWrappers.PurchaseInfo purchase);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object signOut(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}