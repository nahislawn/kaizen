package com.kaizenvpn.vpn.data.preferences;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0006\u001a\u0002H\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J/\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00030\t\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0006\u001a\u0002H\u0003H&\u00a2\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ-\u0010\u000e\u001a\u00020\f\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u000f\u001a\u0002H\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/kaizenvpn/vpn/data/preferences/DataStoreManager;", "", "get", "T", "key", "Landroidx/datastore/preferences/core/Preferences$Key;", "default", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFlow", "Lkotlinx/coroutines/flow/Flow;", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "remove", "", "(Landroidx/datastore/preferences/core/Preferences$Key;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "set", "value", "app_release"})
public abstract interface DataStoreManager {
    
    @org.jetbrains.annotations.NotNull
    public abstract <T extends java.lang.Object>kotlinx.coroutines.flow.Flow<T> getFlow(@org.jetbrains.annotations.NotNull
    androidx.datastore.preferences.core.Preferences.Key<T> key, T p1_772401952);
    
    @org.jetbrains.annotations.Nullable
    public abstract <T extends java.lang.Object>java.lang.Object get(@org.jetbrains.annotations.NotNull
    androidx.datastore.preferences.core.Preferences.Key<T> key, T p1_772401952, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super T> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract <T extends java.lang.Object>java.lang.Object set(@org.jetbrains.annotations.NotNull
    androidx.datastore.preferences.core.Preferences.Key<T> key, T value, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract <T extends java.lang.Object>java.lang.Object remove(@org.jetbrains.annotations.NotNull
    androidx.datastore.preferences.core.Preferences.Key<T> key, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}