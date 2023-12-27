package com.kaizenvpn.vpn.core.util;

/**
 * Created by Furuichi on 25/09/2023
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/kaizenvpn/vpn/core/util/AppConstant;", "", "()V", "Firebase", "Prefs", "app_release"})
public final class AppConstant {
    @org.jetbrains.annotations.NotNull
    public static final com.kaizenvpn.vpn.core.util.AppConstant INSTANCE = null;
    
    private AppConstant() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/kaizenvpn/vpn/core/util/AppConstant$Firebase;", "", "()V", "ANONYMOUS", "", "CONFIGS", "ERROR", "SERVERS", "USERS", "app_release"})
    public static final class Firebase {
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String SERVERS = "Servers";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String USERS = "users";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String ERROR = "errors";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String ANONYMOUS = "anonymous";
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String CONFIGS = "configs";
        @org.jetbrains.annotations.NotNull
        public static final com.kaizenvpn.vpn.core.util.AppConstant.Firebase INSTANCE = null;
        
        private Firebase() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/kaizenvpn/vpn/core/util/AppConstant$Prefs;", "", "()V", "isRefuseRateApp", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "()Landroidx/datastore/preferences/core/Preferences$Key;", "vpnServiceId", "", "getVpnServiceId", "app_release"})
    public static final class Prefs {
        @org.jetbrains.annotations.NotNull
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> vpnServiceId = null;
        @org.jetbrains.annotations.NotNull
        private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> isRefuseRateApp = null;
        @org.jetbrains.annotations.NotNull
        public static final com.kaizenvpn.vpn.core.util.AppConstant.Prefs INSTANCE = null;
        
        private Prefs() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getVpnServiceId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> isRefuseRateApp() {
            return null;
        }
    }
}