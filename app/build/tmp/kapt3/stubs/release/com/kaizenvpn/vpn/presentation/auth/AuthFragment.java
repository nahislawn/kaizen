package com.kaizenvpn.vpn.presentation.auth;

/**
 * Created by Furuichi on 25/09/2023
 */
@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0002R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u00028VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/auth/AuthFragment;", "Lcom/kaizenvpn/vpn/core/base/BaseDialogFragment;", "Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel;", "Lcom/kaizenvpn/vpn/databinding/FragmentAuthBinding;", "()V", "value", "Lcom/kaizenvpn/vpn/presentation/auth/AuthFragment$Mode;", "mode", "setMode", "(Lcom/kaizenvpn/vpn/presentation/auth/AuthFragment$Mode;)V", "viewModel", "getViewModel", "()Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindEvent", "", "clearFocus", "onFragmentCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "resetInput", "setupViews", "toggleButton", "toggleMode", "Mode", "app_release"})
public final class AuthFragment extends com.kaizenvpn.vpn.core.base.BaseDialogFragment<com.kaizenvpn.vpn.presentation.auth.AuthViewModel, com.kaizenvpn.vpn.databinding.FragmentAuthBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private com.kaizenvpn.vpn.presentation.auth.AuthFragment.Mode mode = com.kaizenvpn.vpn.presentation.auth.AuthFragment.Mode.SignIn;
    
    public AuthFragment() {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.kaizenvpn.vpn.presentation.auth.AuthViewModel getViewModel() {
        return null;
    }
    
    private final void setMode(com.kaizenvpn.vpn.presentation.auth.AuthFragment.Mode value) {
    }
    
    @java.lang.Override
    public void onFragmentCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * SETUP VIEWS
     */
    private final void setupViews() {
    }
    
    /**
     * EVENT
     */
    private final void bindEvent() {
    }
    
    private final void toggleMode() {
    }
    
    private final void toggleButton() {
    }
    
    private final void clearFocus() {
    }
    
    private final void resetInput() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/auth/AuthFragment$Mode;", "", "(Ljava/lang/String;I)V", "SignIn", "SignUp", "app_release"})
    public static enum Mode {
        /*public static final*/ SignIn /* = new SignIn() */,
        /*public static final*/ SignUp /* = new SignUp() */;
        
        Mode() {
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.EnumEntries<com.kaizenvpn.vpn.presentation.auth.AuthFragment.Mode> getEntries() {
            return null;
        }
    }
}