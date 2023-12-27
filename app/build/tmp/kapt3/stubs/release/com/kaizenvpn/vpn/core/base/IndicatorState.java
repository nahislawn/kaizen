package com.kaizenvpn.vpn.core.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/kaizenvpn/vpn/core/base/IndicatorState;", "", "()V", "Error", "Idle", "Loading", "Lcom/kaizenvpn/vpn/core/base/IndicatorState$Error;", "Lcom/kaizenvpn/vpn/core/base/IndicatorState$Idle;", "Lcom/kaizenvpn/vpn/core/base/IndicatorState$Loading;", "app_release"})
public abstract class IndicatorState {
    
    private IndicatorState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/kaizenvpn/vpn/core/base/IndicatorState$Error;", "Lcom/kaizenvpn/vpn/core/base/IndicatorState;", "error", "", "throwable", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "message", "getMessage", "()Ljava/lang/String;", "getThrowable", "()Ljava/lang/Throwable;", "app_release"})
    public static final class Error extends com.kaizenvpn.vpn.core.base.IndicatorState {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String error = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Throwable throwable = null;
        
        public Error(@org.jetbrains.annotations.Nullable
        java.lang.String error, @org.jetbrains.annotations.Nullable
        java.lang.Throwable throwable) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Throwable getThrowable() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMessage() {
            return null;
        }
        
        public Error() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/kaizenvpn/vpn/core/base/IndicatorState$Idle;", "Lcom/kaizenvpn/vpn/core/base/IndicatorState;", "()V", "app_release"})
    public static final class Idle extends com.kaizenvpn.vpn.core.base.IndicatorState {
        @org.jetbrains.annotations.NotNull
        public static final com.kaizenvpn.vpn.core.base.IndicatorState.Idle INSTANCE = null;
        
        private Idle() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/kaizenvpn/vpn/core/base/IndicatorState$Loading;", "Lcom/kaizenvpn/vpn/core/base/IndicatorState;", "()V", "app_release"})
    public static final class Loading extends com.kaizenvpn.vpn.core.base.IndicatorState {
        @org.jetbrains.annotations.NotNull
        public static final com.kaizenvpn.vpn.core.base.IndicatorState.Loading INSTANCE = null;
        
        private Loading() {
        }
    }
}