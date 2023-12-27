package com.kaizenvpn.vpn.core.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0014R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0014\u0010\r\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lcom/kaizenvpn/vpn/core/base/BaseActivity;", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/FragmentActivity;", "_binding", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "(Lkotlin/jvm/functions/Function1;)V", "_viewBinding", "Landroidx/viewbinding/ViewBinding;", "isFlagLight", "", "()Z", "viewBinding", "getViewBinding", "()Landroidx/viewbinding/ViewBinding;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onDestroy", "app_release"})
public abstract class BaseActivity<VB extends androidx.viewbinding.ViewBinding> extends androidx.fragment.app.FragmentActivity {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<android.view.LayoutInflater, VB> _binding = null;
    @org.jetbrains.annotations.Nullable
    private VB _viewBinding;
    
    public BaseActivity(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.view.LayoutInflater, ? extends VB> _binding) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final VB getViewBinding() {
        return null;
    }
    
    public abstract void onActivityCreated(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState);
    
    public abstract boolean isFlagLight();
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}