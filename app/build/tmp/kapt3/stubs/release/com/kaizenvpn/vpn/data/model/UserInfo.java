package com.kaizenvpn.vpn.data.model;

/**
 * Created by Furuichi on 25/09/2023
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/kaizenvpn/vpn/data/model/UserInfo;", "", "email", "", "premium", "Lcom/kaizenvpn/vpn/data/model/UserInfo$Premium;", "(Ljava/lang/String;Lcom/kaizenvpn/vpn/data/model/UserInfo$Premium;)V", "getEmail", "()Ljava/lang/String;", "getPremium", "()Lcom/kaizenvpn/vpn/data/model/UserInfo$Premium;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "Premium", "app_release"})
public final class UserInfo {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable
    private final com.kaizenvpn.vpn.data.model.UserInfo.Premium premium = null;
    @org.jetbrains.annotations.NotNull
    public static final com.kaizenvpn.vpn.data.model.UserInfo.Companion Companion = null;
    
    public UserInfo(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.Nullable
    com.kaizenvpn.vpn.data.model.UserInfo.Premium premium) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.kaizenvpn.vpn.data.model.UserInfo.Premium getPremium() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.kaizenvpn.vpn.data.model.UserInfo.Premium component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.kaizenvpn.vpn.data.model.UserInfo copy(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.Nullable
    com.kaizenvpn.vpn.data.model.UserInfo.Premium premium) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/kaizenvpn/vpn/data/model/UserInfo$Companion;", "", "()V", "fromFirebase", "Lcom/kaizenvpn/vpn/data/model/UserInfo;", "snapshot", "Lcom/google/firebase/firestore/DocumentSnapshot;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.kaizenvpn.vpn.data.model.UserInfo fromFirebase(@org.jetbrains.annotations.NotNull
        com.google.firebase.firestore.DocumentSnapshot snapshot) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Lcom/kaizenvpn/vpn/data/model/UserInfo$Premium;", "", "orderId", "", "packageName", "productId", "purchaseTime", "", "purchaseToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getOrderId", "()Ljava/lang/String;", "getPackageName", "getProductId", "getPurchaseTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPurchaseToken", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/kaizenvpn/vpn/data/model/UserInfo$Premium;", "equals", "", "other", "hashCode", "", "toString", "app_release"})
    public static final class Premium {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String orderId = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String packageName = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String productId = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Long purchaseTime = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String purchaseToken = null;
        
        public Premium(@org.jetbrains.annotations.Nullable
        java.lang.String orderId, @org.jetbrains.annotations.Nullable
        java.lang.String packageName, @org.jetbrains.annotations.Nullable
        java.lang.String productId, @org.jetbrains.annotations.Nullable
        java.lang.Long purchaseTime, @org.jetbrains.annotations.Nullable
        java.lang.String purchaseToken) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getOrderId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getPackageName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getProductId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Long getPurchaseTime() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getPurchaseToken() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Long component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.kaizenvpn.vpn.data.model.UserInfo.Premium copy(@org.jetbrains.annotations.Nullable
        java.lang.String orderId, @org.jetbrains.annotations.Nullable
        java.lang.String packageName, @org.jetbrains.annotations.Nullable
        java.lang.String productId, @org.jetbrains.annotations.Nullable
        java.lang.Long purchaseTime, @org.jetbrains.annotations.Nullable
        java.lang.String purchaseToken) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
}