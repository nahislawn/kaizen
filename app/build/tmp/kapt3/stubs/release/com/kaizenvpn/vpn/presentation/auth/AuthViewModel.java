package com.kaizenvpn.vpn.presentation.auth;

/**
 * Created by Furuichi on 25/09/2023
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\"#B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\tH\u0002J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel;", "Lcom/kaizenvpn/vpn/core/base/BaseViewModel;", "userRepos", "Lcom/kaizenvpn/vpn/data/repository/UserRepository;", "(Lcom/kaizenvpn/vpn/data/repository/UserRepository;)V", "_actionEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel$UiAction;", "_onSendPasswordResetEmailSuccess", "", "_onSignInSuccess", "_onSignUpSuccess", "_uiStateEvent", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel$UiState;", "onSendPasswordResetEmailSuccess", "Lkotlinx/coroutines/flow/SharedFlow;", "getOnSendPasswordResetEmailSuccess", "()Lkotlinx/coroutines/flow/SharedFlow;", "onSignInSuccess", "getOnSignInSuccess", "onSignUpSuccess", "getOnSignUpSuccess", "accept", "Lkotlinx/coroutines/Job;", "action", "handleResetPassword", "Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel$UiAction$ResetPassword;", "handleSignIn", "Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel$UiAction$SignIn;", "handleSignUp", "Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel$UiAction$SignUp;", "observeUserInfo", "transform", "UiAction", "UiState", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class AuthViewModel extends com.kaizenvpn.vpn.core.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.kaizenvpn.vpn.data.repository.UserRepository userRepos = null;
    
    /**
     * Stream of immutable states representative of the UI.
     */
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> _onSignInSuccess = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> _onSignUpSuccess = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> _onSendPasswordResetEmailSuccess = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.kaizenvpn.vpn.presentation.auth.AuthViewModel.UiAction> _actionEvent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.kaizenvpn.vpn.presentation.auth.AuthViewModel.UiState> _uiStateEvent = null;
    
    @javax.inject.Inject
    public AuthViewModel(@org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.data.repository.UserRepository userRepos) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> getOnSignInSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> getOnSignUpSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> getOnSendPasswordResetEmailSuccess() {
        return null;
    }
    
    /**
     * Processor of side effects from the UI which in turn feedback into [accept]
     */
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job accept(@org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.presentation.auth.AuthViewModel.UiAction action) {
        return null;
    }
    
    private final void observeUserInfo() {
    }
    
    private final void transform(com.kaizenvpn.vpn.presentation.auth.AuthViewModel.UiAction action) {
    }
    
    private final void handleSignIn(com.kaizenvpn.vpn.presentation.auth.AuthViewModel.UiAction.SignIn action) {
    }
    
    private final void handleSignUp(com.kaizenvpn.vpn.presentation.auth.AuthViewModel.UiAction.SignUp action) {
    }
    
    private final void handleResetPassword(com.kaizenvpn.vpn.presentation.auth.AuthViewModel.UiAction.ResetPassword action) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel$UiAction;", "", "()V", "ResetPassword", "SignIn", "SignUp", "Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel$UiAction$ResetPassword;", "Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel$UiAction$SignIn;", "Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel$UiAction$SignUp;", "app_release"})
    public static abstract class UiAction {
        
        private UiAction() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel$UiAction$ResetPassword;", "Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel$UiAction;", "email", "", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"})
        public static final class ResetPassword extends com.kaizenvpn.vpn.presentation.auth.AuthViewModel.UiAction {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String email = null;
            
            public ResetPassword(@org.jetbrains.annotations.NotNull
            java.lang.String email) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getEmail() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.kaizenvpn.vpn.presentation.auth.AuthViewModel.UiAction.ResetPassword copy(@org.jetbrains.annotations.NotNull
            java.lang.String email) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel$UiAction$SignIn;", "Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel$UiAction;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPassword", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"})
        public static final class SignIn extends com.kaizenvpn.vpn.presentation.auth.AuthViewModel.UiAction {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String email = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String password = null;
            
            public SignIn(@org.jetbrains.annotations.NotNull
            java.lang.String email, @org.jetbrains.annotations.NotNull
            java.lang.String password) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getEmail() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getPassword() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.kaizenvpn.vpn.presentation.auth.AuthViewModel.UiAction.SignIn copy(@org.jetbrains.annotations.NotNull
            java.lang.String email, @org.jetbrains.annotations.NotNull
            java.lang.String password) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel$UiAction$SignUp;", "Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel$UiAction;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPassword", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"})
        public static final class SignUp extends com.kaizenvpn.vpn.presentation.auth.AuthViewModel.UiAction {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String email = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String password = null;
            
            public SignUp(@org.jetbrains.annotations.NotNull
            java.lang.String email, @org.jetbrains.annotations.NotNull
            java.lang.String password) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getEmail() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getPassword() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.kaizenvpn.vpn.presentation.auth.AuthViewModel.UiAction.SignUp copy(@org.jetbrains.annotations.NotNull
            java.lang.String email, @org.jetbrains.annotations.NotNull
            java.lang.String password) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/auth/AuthViewModel$UiState;", "", "userInfo", "Lcom/kaizenvpn/vpn/data/model/UserInfo;", "(Lcom/kaizenvpn/vpn/data/model/UserInfo;)V", "getUserInfo", "()Lcom/kaizenvpn/vpn/data/model/UserInfo;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"})
    public static final class UiState {
        @org.jetbrains.annotations.Nullable
        private final com.kaizenvpn.vpn.data.model.UserInfo userInfo = null;
        
        public UiState(@org.jetbrains.annotations.Nullable
        com.kaizenvpn.vpn.data.model.UserInfo userInfo) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.kaizenvpn.vpn.data.model.UserInfo getUserInfo() {
            return null;
        }
        
        public UiState() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.kaizenvpn.vpn.data.model.UserInfo component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.kaizenvpn.vpn.presentation.auth.AuthViewModel.UiState copy(@org.jetbrains.annotations.Nullable
        com.kaizenvpn.vpn.data.model.UserInfo userInfo) {
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