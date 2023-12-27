package com.kaizenvpn.vpn.data.repository;

/**
 * Created by Furuichi on 25/09/2023
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH&R\u001a\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/kaizenvpn/vpn/data/repository/CommonRepository;", "", "configState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/kaizenvpn/vpn/data/model/Config;", "getConfigState", "()Lkotlinx/coroutines/flow/StateFlow;", "getConfigs", "Lkotlinx/coroutines/flow/Flow;", "app_release"})
public abstract interface CommonRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.StateFlow<com.kaizenvpn.vpn.data.model.Config> getConfigState();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.kaizenvpn.vpn.data.model.Config> getConfigs();
}