package com.kaizenvpn.vpn.presentation.main.tab;

/**
 * Created by Furuichi on 25/09/2023
 */
@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000278B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020 H\u0002J\b\u0010\"\u001a\u00020 H\u0002J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020 H\u0002J\b\u0010\'\u001a\u00020 H\u0002J\b\u0010(\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020 H\u0002J\b\u0010*\u001a\u00020 H\u0002J\u001a\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020 H\u0016J\b\u00101\u001a\u00020 H\u0016J\b\u00102\u001a\u00020 H\u0002J\b\u00103\u001a\u00020 H\u0002J\b\u00104\u001a\u00020 H\u0002J\b\u00105\u001a\u00020 H\u0002J\b\u00106\u001a\u00020 H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u00028VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00069"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/tab/HomeFragment;", "Lcom/kaizenvpn/vpn/core/base/BaseFragment;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel;", "Lcom/kaizenvpn/vpn/databinding/FragmentHomeBinding;", "()V", "adIsLoading", "", "animator", "Landroid/animation/ValueAnimator;", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "interstitialAd", "Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "isMobileAdsInitializeCalled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "originWidth", "", "startForResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "value", "Lcom/kaizenvpn/vpn/presentation/main/tab/HomeFragment$State;", "state", "setState", "(Lcom/kaizenvpn/vpn/presentation/main/tab/HomeFragment$State;)V", "viewModel", "getViewModel", "()Lcom/kaizenvpn/vpn/presentation/main/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindCommand", "", "bindConnected", "bindConnecting", "bindCurrentServer", "vpnServer", "Lcom/kaizenvpn/vpn/data/model/VPNServer;", "bindDisconnected", "bindState", "doSyncTraffic", "initializeMobileAdsSdk", "loadInterstitialAd", "onFragmentCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "prepareStartVpn", "setupViews", "showInterstitial", "showRateAppIfNeeded", "startVPN", "Companion", "State", "app_release"})
public final class HomeFragment extends com.kaizenvpn.vpn.core.base.BaseFragment<com.kaizenvpn.vpn.presentation.main.MainViewModel, com.kaizenvpn.vpn.databinding.FragmentHomeBinding> {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ACTION_CONNECTION_STATE = "connectionState";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String EXTRA_STATE = "state";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String EXTRA_DOWNLOAD = "download";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String EXTRA_UPLOAD = "upload";
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable
    private android.animation.ValueAnimator animator;
    private int originWidth = 0;
    @org.jetbrains.annotations.NotNull
    private com.kaizenvpn.vpn.presentation.main.tab.HomeFragment.State state = com.kaizenvpn.vpn.presentation.main.tab.HomeFragment.State.Disconnected;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> startForResult = null;
    @org.jetbrains.annotations.NotNull
    private final android.content.BroadcastReceiver broadcastReceiver = null;
    @org.jetbrains.annotations.NotNull
    private java.util.concurrent.atomic.AtomicBoolean isMobileAdsInitializeCalled;
    @org.jetbrains.annotations.Nullable
    private com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd;
    private boolean adIsLoading = false;
    @org.jetbrains.annotations.NotNull
    public static final com.kaizenvpn.vpn.presentation.main.tab.HomeFragment.Companion Companion = null;
    
    public HomeFragment() {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.kaizenvpn.vpn.presentation.main.MainViewModel getViewModel() {
        return null;
    }
    
    private final void setState(com.kaizenvpn.vpn.presentation.main.tab.HomeFragment.State value) {
    }
    
    @java.lang.Override
    public void onFragmentCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    /**
     * SETUP VIEWS
     */
    private final void setupViews() {
    }
    
    /**
     * STATE
     */
    private final void bindState() {
    }
    
    /**
     * COMMAND
     */
    private final void bindCommand() {
    }
    
    private final void prepareStartVpn() {
    }
    
    private final void startVPN() {
    }
    
    private final void doSyncTraffic() {
    }
    
    private final void bindDisconnected() {
    }
    
    private final void bindConnecting() {
    }
    
    private final void bindConnected() {
    }
    
    private final void bindCurrentServer(com.kaizenvpn.vpn.data.model.VPNServer vpnServer) {
    }
    
    private final void showRateAppIfNeeded() {
    }
    
    private final void initializeMobileAdsSdk() {
    }
    
    private final void loadInterstitialAd() {
    }
    
    private final void showInterstitial() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/tab/HomeFragment$Companion;", "", "()V", "ACTION_CONNECTION_STATE", "", "EXTRA_DOWNLOAD", "EXTRA_STATE", "EXTRA_UPLOAD", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/tab/HomeFragment$State;", "", "(Ljava/lang/String;I)V", "Disconnected", "Connecting", "Connected", "app_release"})
    public static enum State {
        /*public static final*/ Disconnected /* = new Disconnected() */,
        /*public static final*/ Connecting /* = new Connecting() */,
        /*public static final*/ Connected /* = new Connected() */;
        
        State() {
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.EnumEntries<com.kaizenvpn.vpn.presentation.main.tab.HomeFragment.State> getEntries() {
            return null;
        }
    }
}