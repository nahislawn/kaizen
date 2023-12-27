package com.kaizenvpn.vpn.presentation.main;

/**
 * Created by Furuichi on 25/09/2023
 */
@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0013H\u0002J\b\u0010!\u001a\u00020\u0013H\u0002J\b\u0010\"\u001a\u00020\u0013H\u0002J\b\u0010#\u001a\u00020\u0013H\u0002J\b\u0010$\u001a\u00020\u0013H\u0002J\b\u0010%\u001a\u00020\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u00028VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\'"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/MainFragment;", "Lcom/kaizenvpn/vpn/core/base/BaseFragment;", "Lcom/kaizenvpn/vpn/presentation/main/MainViewModel;", "Lcom/kaizenvpn/vpn/databinding/FragmentMainBinding;", "()V", "drawerToggle", "Landroidx/drawerlayout/widget/DrawerLayout$DrawerListener;", "menuAdapter", "Lcom/kaizenvpn/vpn/presentation/main/adapter/MenuAdapter;", "getMenuAdapter", "()Lcom/kaizenvpn/vpn/presentation/main/adapter/MenuAdapter;", "url", "", "viewModel", "getViewModel", "()Lcom/kaizenvpn/vpn/presentation/main/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindCommand", "", "bindState", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentCreated", "view", "Landroid/view/View;", "onPause", "onResume", "setCurrentItem", "tab", "Lcom/kaizenvpn/vpn/presentation/main/MainFragment$Tab;", "setupViews", "updateAccountUI", "updateHomeUI", "updateLocationUI", "updateSettingUI", "updateUpgradeUI", "Tab", "app_release"})
public final class MainFragment extends com.kaizenvpn.vpn.core.base.BaseFragment<com.kaizenvpn.vpn.presentation.main.MainViewModel, com.kaizenvpn.vpn.databinding.FragmentMainBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.drawerlayout.widget.DrawerLayout.DrawerListener drawerToggle = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String url = "http://www.ip-api.com/json";
    
    public MainFragment() {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.kaizenvpn.vpn.presentation.main.MainViewModel getViewModel() {
        return null;
    }
    
    private final com.kaizenvpn.vpn.presentation.main.adapter.MenuAdapter getMenuAdapter() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
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
    
    private final void setCurrentItem(com.kaizenvpn.vpn.presentation.main.MainFragment.Tab tab) {
    }
    
    private final void updateHomeUI() {
    }
    
    private final void updateUpgradeUI() {
    }
    
    private final void updateAccountUI() {
    }
    
    private final void updateSettingUI() {
    }
    
    private final void updateLocationUI() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/MainFragment$Tab;", "", "(Ljava/lang/String;I)V", "fragment", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "iconRes", "", "getIconRes", "()I", "title", "", "getTitle", "()Ljava/lang/String;", "Home", "Upgrade", "Account", "Location", "Setting", "app_release"})
    public static enum Tab {
        /*public static final*/ Home /* = new Home() */,
        /*public static final*/ Upgrade /* = new Upgrade() */,
        /*public static final*/ Account /* = new Account() */,
        /*public static final*/ Location /* = new Location() */,
        /*public static final*/ Setting /* = new Setting() */;
        
        Tab() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.fragment.app.Fragment getFragment() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final int getIconRes() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.EnumEntries<com.kaizenvpn.vpn.presentation.main.MainFragment.Tab> getEntries() {
            return null;
        }
    }
}