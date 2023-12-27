package com.kaizenvpn.vpn.core.base;

/**
 * Created by Furuichi on 25/09/2023
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002JJ\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\r2$\b\u0002\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0010\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J7\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\r2\b\b\u0002\u0010\u0017\u001a\u00020\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u0001H\u000e\u00a2\u0006\u0002\u0010\u0019R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/kaizenvpn/vpn/core/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "indicatorEvent", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/kaizenvpn/vpn/core/base/IndicatorState;", "getIndicatorEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "indicatorPublisher", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getIndicatorPublisher", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "catchFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "transformLoading", "indicatorState", "defaultValue", "(Lkotlinx/coroutines/flow/Flow;Lcom/kaizenvpn/vpn/core/base/IndicatorState;Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "app_release"})
public class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.kaizenvpn.vpn.core.base.IndicatorState> indicatorPublisher = null;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.kaizenvpn.vpn.core.base.IndicatorState> getIndicatorEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.flow.MutableSharedFlow<com.kaizenvpn.vpn.core.base.IndicatorState> getIndicatorPublisher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final <T extends java.lang.Object>kotlinx.coroutines.flow.Flow<T> transformLoading(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<? extends T> $this$transformLoading, @org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.core.base.IndicatorState indicatorState, @org.jetbrains.annotations.Nullable
    T defaultValue) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final <T extends java.lang.Object>kotlinx.coroutines.flow.Flow<T> catchFlow(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<? extends T> $this$catchFlow, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
}