package com.kaizenvpn.vpn.presentation.main;

/**
 * Created by Furuichi on 25/09/2023
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0003DEFB9\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0011J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020(H\u0002J\b\u0010,\u001a\u00020(H\u0002J\u0010\u0010-\u001a\u00020(2\u0006\u0010&\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020%2\u0006\u0010&\u001a\u000200H\u0002J\b\u00101\u001a\u00020(H\u0002J\u0010\u00102\u001a\u00020(2\u0006\u0010&\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020(2\u0006\u0010&\u001a\u000205H\u0002J\u0010\u00106\u001a\u00020(2\u0006\u0010&\u001a\u000207H\u0002J\b\u00108\u001a\u00020(H\u0002J\b\u00109\u001a\u00020(H\u0002J\b\u0010:\u001a\u00020(H\u0002J\b\u0010;\u001a\u00020(H\u0014J\u000e\u0010<\u001a\u00020%2\u0006\u0010=\u001a\u00020\u0013J\u0016\u0010>\u001a\u00020(2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BJ\u0010\u0010C\u001a\u00020(2\u0006\u0010&\u001a\u00020\u0011H\u0002R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001e8F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\u00030\u00030\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006G"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/MainViewModel;", "Lcom/kaizenvpn/vpn/core/base/BaseViewModel;", "context", "Landroid/content/Context;", "userRepos", "Lcom/kaizenvpn/vpn/data/repository/UserRepository;", "commonRepos", "Lcom/kaizenvpn/vpn/data/repository/CommonRepository;", "serverRepos", "Lcom/kaizenvpn/vpn/data/repository/ServerRepository;", "iapConnector", "Lcom/limerse/iap/IapConnector;", "storeManager", "Lcom/kaizenvpn/vpn/data/preferences/DataStoreManager;", "(Landroid/content/Context;Lcom/kaizenvpn/vpn/data/repository/UserRepository;Lcom/kaizenvpn/vpn/data/repository/CommonRepository;Lcom/kaizenvpn/vpn/data/repository/ServerRepository;Lcom/limerse/iap/IapConnector;Lcom/kaizenvpn/vpn/data/preferences/DataStoreManager;)V", "_actionEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction;", "_uiCommandEvent", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UICommand;", "_uiStateEvent", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIState;", "subscriptionServiceListener", "Lcom/limerse/iap/SubscriptionServiceListener;", "uiCommand", "Lkotlinx/coroutines/flow/SharedFlow;", "getUiCommand", "()Lkotlinx/coroutines/flow/SharedFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "weakContext", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "accept", "Lkotlinx/coroutines/Job;", "action", "bindConfig", "", "config", "Lcom/kaizenvpn/vpn/data/model/Config;", "handleFetchData", "handleRefuse", "handleSetCurrentTab", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$SetCurrentTab;", "handleSetCurrentVPNServer", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$SetCurrentVPNServer;", "handleSigOut", "handleSubscriptionPricesUpdate", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$SubscriptionPricesUpdated;", "handleSyncPurchased", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$SyncPurchased;", "handleSyncTraffic", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$SyncTraffic;", "observeConfig", "observeRefuse", "observeUserInfo", "onCleared", "send", "commmand", "subscribe", "activity", "Landroidx/fragment/app/FragmentActivity;", "skuDetails", "Lcom/limerse/iap/DataWrappers$SkuDetails;", "transform", "UIAction", "UICommand", "UIState", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MainViewModel extends com.kaizenvpn.vpn.core.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.kaizenvpn.vpn.data.repository.UserRepository userRepos = null;
    @org.jetbrains.annotations.NotNull
    private final com.kaizenvpn.vpn.data.repository.CommonRepository commonRepos = null;
    @org.jetbrains.annotations.NotNull
    private final com.kaizenvpn.vpn.data.repository.ServerRepository serverRepos = null;
    @org.jetbrains.annotations.NotNull
    private final com.limerse.iap.IapConnector iapConnector = null;
    @org.jetbrains.annotations.NotNull
    private final com.kaizenvpn.vpn.data.preferences.DataStoreManager storeManager = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction> _actionEvent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.kaizenvpn.vpn.presentation.main.MainViewModel.UICommand> _uiCommandEvent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.kaizenvpn.vpn.presentation.main.MainViewModel.UIState> _uiStateEvent = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.ref.WeakReference<android.content.Context> weakContext;
    @org.jetbrains.annotations.NotNull
    private final com.limerse.iap.SubscriptionServiceListener subscriptionServiceListener = null;
    
    @javax.inject.Inject
    public MainViewModel(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.data.repository.UserRepository userRepos, @org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.data.repository.CommonRepository commonRepos, @org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.data.repository.ServerRepository serverRepos, @org.jetbrains.annotations.NotNull
    com.limerse.iap.IapConnector iapConnector, @org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.data.preferences.DataStoreManager storeManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.kaizenvpn.vpn.presentation.main.MainViewModel.UIState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.kaizenvpn.vpn.presentation.main.MainViewModel.UICommand> getUiCommand() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    /**
     * Processor of side effects from the UI which in turn feedback into [accept]
     */
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job accept(@org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction action) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job send(@org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.presentation.main.MainViewModel.UICommand commmand) {
        return null;
    }
    
    public final void subscribe(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull
    com.limerse.iap.DataWrappers.SkuDetails skuDetails) {
    }
    
    private final void observeUserInfo() {
    }
    
    private final void observeConfig() {
    }
    
    private final void observeRefuse() {
    }
    
    private final void transform(com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction action) {
    }
    
    private final void handleSyncPurchased(com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction.SyncPurchased action) {
    }
    
    private final void handleSyncTraffic(com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction.SyncTraffic action) {
    }
    
    private final void handleFetchData() {
    }
    
    private final void handleSigOut() {
    }
    
    private final void handleRefuse() {
    }
    
    private final void handleSetCurrentTab(com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction.SetCurrentTab action) {
    }
    
    private final void handleSubscriptionPricesUpdate(com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction.SubscriptionPricesUpdated action) {
    }
    
    private final kotlinx.coroutines.Job handleSetCurrentVPNServer(com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction.SetCurrentVPNServer action) {
        return null;
    }
    
    private final void bindConfig(com.kaizenvpn.vpn.data.model.Config config) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction;", "", "()V", "FetchData", "Refuse", "SetCurrentTab", "SetCurrentVPNServer", "SignOut", "SubscriptionPricesUpdated", "SyncPurchased", "SyncTraffic", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$FetchData;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$Refuse;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$SetCurrentTab;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$SetCurrentVPNServer;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$SignOut;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$SubscriptionPricesUpdated;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$SyncPurchased;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$SyncTraffic;", "app_release"})
    public static abstract class UIAction {
        
        private UIAction() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$FetchData;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction;", "()V", "app_release"})
        public static final class FetchData extends com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction {
            @org.jetbrains.annotations.NotNull
            public static final com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction.FetchData INSTANCE = null;
            
            private FetchData() {
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$Refuse;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction;", "()V", "app_release"})
        public static final class Refuse extends com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction {
            @org.jetbrains.annotations.NotNull
            public static final com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction.Refuse INSTANCE = null;
            
            private Refuse() {
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$SetCurrentTab;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction;", "tab", "Lcom/kaizenvpn/vpn/presentation/main/MainFragment$Tab;", "(Lcom/kaizenvpn/vpn/presentation/main/MainFragment$Tab;)V", "getTab", "()Lcom/kaizenvpn/vpn/presentation/main/MainFragment$Tab;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
        public static final class SetCurrentTab extends com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction {
            @org.jetbrains.annotations.NotNull
            private final com.kaizenvpn.vpn.presentation.main.MainFragment.Tab tab = null;
            
            public SetCurrentTab(@org.jetbrains.annotations.NotNull
            com.kaizenvpn.vpn.presentation.main.MainFragment.Tab tab) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.kaizenvpn.vpn.presentation.main.MainFragment.Tab getTab() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.kaizenvpn.vpn.presentation.main.MainFragment.Tab component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction.SetCurrentTab copy(@org.jetbrains.annotations.NotNull
            com.kaizenvpn.vpn.presentation.main.MainFragment.Tab tab) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$SetCurrentVPNServer;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction;", "vpnServer", "Lcom/kaizenvpn/vpn/data/model/VPNServer;", "(Lcom/kaizenvpn/vpn/data/model/VPNServer;)V", "getVpnServer", "()Lcom/kaizenvpn/vpn/data/model/VPNServer;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
        public static final class SetCurrentVPNServer extends com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction {
            @org.jetbrains.annotations.NotNull
            private final com.kaizenvpn.vpn.data.model.VPNServer vpnServer = null;
            
            public SetCurrentVPNServer(@org.jetbrains.annotations.NotNull
            com.kaizenvpn.vpn.data.model.VPNServer vpnServer) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.kaizenvpn.vpn.data.model.VPNServer getVpnServer() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.kaizenvpn.vpn.data.model.VPNServer component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction.SetCurrentVPNServer copy(@org.jetbrains.annotations.NotNull
            com.kaizenvpn.vpn.data.model.VPNServer vpnServer) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$SignOut;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction;", "()V", "app_release"})
        public static final class SignOut extends com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction {
            @org.jetbrains.annotations.NotNull
            public static final com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction.SignOut INSTANCE = null;
            
            private SignOut() {
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0004H\u00d6\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$SubscriptionPricesUpdated;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction;", "iapKeyPrices", "", "", "Lcom/limerse/iap/DataWrappers$SkuDetails;", "(Ljava/util/Map;)V", "getIapKeyPrices", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"})
        public static final class SubscriptionPricesUpdated extends com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction {
            @org.jetbrains.annotations.NotNull
            private final java.util.Map<java.lang.String, com.limerse.iap.DataWrappers.SkuDetails> iapKeyPrices = null;
            
            public SubscriptionPricesUpdated(@org.jetbrains.annotations.NotNull
            java.util.Map<java.lang.String, com.limerse.iap.DataWrappers.SkuDetails> iapKeyPrices) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.Map<java.lang.String, com.limerse.iap.DataWrappers.SkuDetails> getIapKeyPrices() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.Map<java.lang.String, com.limerse.iap.DataWrappers.SkuDetails> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction.SubscriptionPricesUpdated copy(@org.jetbrains.annotations.NotNull
            java.util.Map<java.lang.String, com.limerse.iap.DataWrappers.SkuDetails> iapKeyPrices) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$SyncPurchased;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction;", "purchaseInfo", "Lcom/limerse/iap/DataWrappers$PurchaseInfo;", "(Lcom/limerse/iap/DataWrappers$PurchaseInfo;)V", "getPurchaseInfo", "()Lcom/limerse/iap/DataWrappers$PurchaseInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
        public static final class SyncPurchased extends com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction {
            @org.jetbrains.annotations.Nullable
            private final com.limerse.iap.DataWrappers.PurchaseInfo purchaseInfo = null;
            
            public SyncPurchased(@org.jetbrains.annotations.Nullable
            com.limerse.iap.DataWrappers.PurchaseInfo purchaseInfo) {
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.limerse.iap.DataWrappers.PurchaseInfo getPurchaseInfo() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.limerse.iap.DataWrappers.PurchaseInfo component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction.SyncPurchased copy(@org.jetbrains.annotations.Nullable
            com.limerse.iap.DataWrappers.PurchaseInfo purchaseInfo) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction$SyncTraffic;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIAction;", "byteOut", "", "byteIn", "(JJ)V", "getByteIn", "()J", "getByteOut", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
        public static final class SyncTraffic extends com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction {
            private final long byteOut = 0L;
            private final long byteIn = 0L;
            
            public SyncTraffic(long byteOut, long byteIn) {
            }
            
            public final long getByteOut() {
                return 0L;
            }
            
            public final long getByteIn() {
                return 0L;
            }
            
            public final long component1() {
                return 0L;
            }
            
            public final long component2() {
                return 0L;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.kaizenvpn.vpn.presentation.main.MainViewModel.UIAction.SyncTraffic copy(long byteOut, long byteIn) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UICommand;", "", "()V", "Purchased", "SetupAd", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UICommand$Purchased;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UICommand$SetupAd;", "app_release"})
    public static abstract class UICommand {
        
        private UICommand() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UICommand$Purchased;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UICommand;", "()V", "app_release"})
        public static final class Purchased extends com.kaizenvpn.vpn.presentation.main.MainViewModel.UICommand {
            @org.jetbrains.annotations.NotNull
            public static final com.kaizenvpn.vpn.presentation.main.MainViewModel.UICommand.Purchased INSTANCE = null;
            
            private Purchased() {
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UICommand$SetupAd;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UICommand;", "()V", "app_release"})
        public static final class SetupAd extends com.kaizenvpn.vpn.presentation.main.MainViewModel.UICommand {
            @org.jetbrains.annotations.NotNull
            public static final com.kaizenvpn.vpn.presentation.main.MainViewModel.UICommand.SetupAd INSTANCE = null;
            
            private SetupAd() {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\t\u0010(\u001a\u00020\u0011H\u00c6\u0003Jm\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010*\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020-H\u00d6\u0001J\t\u0010.\u001a\u00020/H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u00060"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/MainViewModel$UIState;", "", "tab", "Lcom/kaizenvpn/vpn/presentation/main/MainFragment$Tab;", "userInfo", "Lcom/kaizenvpn/vpn/data/model/UserInfo;", "config", "Lcom/kaizenvpn/vpn/data/model/Config;", "servers", "", "Lcom/kaizenvpn/vpn/data/model/VPNServer;", "currentServer", "skuDetailsList", "Lcom/limerse/iap/DataWrappers$SkuDetails;", "purchaseInfo", "Lcom/limerse/iap/DataWrappers$PurchaseInfo;", "isRefuseRateApp", "", "(Lcom/kaizenvpn/vpn/presentation/main/MainFragment$Tab;Lcom/kaizenvpn/vpn/data/model/UserInfo;Lcom/kaizenvpn/vpn/data/model/Config;Ljava/util/List;Lcom/kaizenvpn/vpn/data/model/VPNServer;Ljava/util/List;Lcom/limerse/iap/DataWrappers$PurchaseInfo;Z)V", "getConfig", "()Lcom/kaizenvpn/vpn/data/model/Config;", "getCurrentServer", "()Lcom/kaizenvpn/vpn/data/model/VPNServer;", "()Z", "getPurchaseInfo", "()Lcom/limerse/iap/DataWrappers$PurchaseInfo;", "getServers", "()Ljava/util/List;", "getSkuDetailsList", "getTab", "()Lcom/kaizenvpn/vpn/presentation/main/MainFragment$Tab;", "getUserInfo", "()Lcom/kaizenvpn/vpn/data/model/UserInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"})
    public static final class UIState {
        @org.jetbrains.annotations.NotNull
        private final com.kaizenvpn.vpn.presentation.main.MainFragment.Tab tab = null;
        @org.jetbrains.annotations.Nullable
        private final com.kaizenvpn.vpn.data.model.UserInfo userInfo = null;
        @org.jetbrains.annotations.Nullable
        private final com.kaizenvpn.vpn.data.model.Config config = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.kaizenvpn.vpn.data.model.VPNServer> servers = null;
        @org.jetbrains.annotations.Nullable
        private final com.kaizenvpn.vpn.data.model.VPNServer currentServer = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.limerse.iap.DataWrappers.SkuDetails> skuDetailsList = null;
        @org.jetbrains.annotations.Nullable
        private final com.limerse.iap.DataWrappers.PurchaseInfo purchaseInfo = null;
        private final boolean isRefuseRateApp = false;
        
        public UIState(@org.jetbrains.annotations.NotNull
        com.kaizenvpn.vpn.presentation.main.MainFragment.Tab tab, @org.jetbrains.annotations.Nullable
        com.kaizenvpn.vpn.data.model.UserInfo userInfo, @org.jetbrains.annotations.Nullable
        com.kaizenvpn.vpn.data.model.Config config, @org.jetbrains.annotations.NotNull
        java.util.List<com.kaizenvpn.vpn.data.model.VPNServer> servers, @org.jetbrains.annotations.Nullable
        com.kaizenvpn.vpn.data.model.VPNServer currentServer, @org.jetbrains.annotations.NotNull
        java.util.List<com.limerse.iap.DataWrappers.SkuDetails> skuDetailsList, @org.jetbrains.annotations.Nullable
        com.limerse.iap.DataWrappers.PurchaseInfo purchaseInfo, boolean isRefuseRateApp) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.kaizenvpn.vpn.presentation.main.MainFragment.Tab getTab() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.kaizenvpn.vpn.data.model.UserInfo getUserInfo() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.kaizenvpn.vpn.data.model.Config getConfig() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.kaizenvpn.vpn.data.model.VPNServer> getServers() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.kaizenvpn.vpn.data.model.VPNServer getCurrentServer() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.limerse.iap.DataWrappers.SkuDetails> getSkuDetailsList() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.limerse.iap.DataWrappers.PurchaseInfo getPurchaseInfo() {
            return null;
        }
        
        public final boolean isRefuseRateApp() {
            return false;
        }
        
        public UIState() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.kaizenvpn.vpn.presentation.main.MainFragment.Tab component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.kaizenvpn.vpn.data.model.UserInfo component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.kaizenvpn.vpn.data.model.Config component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.kaizenvpn.vpn.data.model.VPNServer> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.kaizenvpn.vpn.data.model.VPNServer component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.limerse.iap.DataWrappers.SkuDetails> component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.limerse.iap.DataWrappers.PurchaseInfo component7() {
            return null;
        }
        
        public final boolean component8() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.kaizenvpn.vpn.presentation.main.MainViewModel.UIState copy(@org.jetbrains.annotations.NotNull
        com.kaizenvpn.vpn.presentation.main.MainFragment.Tab tab, @org.jetbrains.annotations.Nullable
        com.kaizenvpn.vpn.data.model.UserInfo userInfo, @org.jetbrains.annotations.Nullable
        com.kaizenvpn.vpn.data.model.Config config, @org.jetbrains.annotations.NotNull
        java.util.List<com.kaizenvpn.vpn.data.model.VPNServer> servers, @org.jetbrains.annotations.Nullable
        com.kaizenvpn.vpn.data.model.VPNServer currentServer, @org.jetbrains.annotations.NotNull
        java.util.List<com.limerse.iap.DataWrappers.SkuDetails> skuDetailsList, @org.jetbrains.annotations.Nullable
        com.limerse.iap.DataWrappers.PurchaseInfo purchaseInfo, boolean isRefuseRateApp) {
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