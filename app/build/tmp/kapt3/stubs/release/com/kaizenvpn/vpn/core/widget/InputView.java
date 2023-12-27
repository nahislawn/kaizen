package com.kaizenvpn.vpn.core.widget;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\f\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\u001c\u0010\u001f\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010 \u001a\u00020\u0014H\u0002J\u0012\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\tH\u0014J\u0006\u0010\'\u001a\u00020\u0014J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\tH\u0002J\u001a\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u0013H\u0002J\u0012\u0010-\u001a\u00020\u00142\b\u0010.\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010/\u001a\u00020\u0014H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/kaizenvpn/vpn/core/widget/InputView;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actionType", "", "value", "", "error", "getError", "()Z", "setError", "(Z)V", "onTextChanged", "Lkotlin/Function1;", "", "", "getOnTextChanged", "()Lkotlin/jvm/functions/Function1;", "setOnTextChanged", "(Lkotlin/jvm/functions/Function1;)V", "text", "getText", "()Ljava/lang/String;", "viewBinding", "Lcom/kaizenvpn/vpn/databinding/ViewInputBinding;", "clearFocus", "initAttrs", "initView", "onClick", "p0", "Landroid/view/View;", "onCreateDrawableState", "", "extraSpace", "reset", "setIcon", "type", "setInputText", "inputType", "hint", "setLabel", "label", "toggleIcon", "Companion", "app_release"})
public final class InputView extends android.widget.RelativeLayout implements android.view.View.OnClickListener {
    public static final int ACTION_NONE = 0;
    public static final int ACTION_CANCEL = 1;
    public static final int ACTION_HINT = 2;
    @org.jetbrains.annotations.NotNull
    private static int[] STATE_ERROR;
    @org.jetbrains.annotations.NotNull
    private final com.kaizenvpn.vpn.databinding.ViewInputBinding viewBinding = null;
    private int actionType = 0;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTextChanged;
    private boolean error = false;
    @org.jetbrains.annotations.NotNull
    public static final com.kaizenvpn.vpn.core.widget.InputView.Companion Companion = null;
    
    public InputView(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnTextChanged() {
        return null;
    }
    
    public final void setOnTextChanged(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getText() {
        return null;
    }
    
    public final boolean getError() {
        return false;
    }
    
    public final void setError(boolean value) {
    }
    
    private final void initView() {
    }
    
    private final void initAttrs(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    private final void toggleIcon() {
    }
    
    private final void setLabel(java.lang.String label) {
    }
    
    private final void setInputText(int inputType, java.lang.String hint) {
    }
    
    private final void setIcon(int type) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected int[] onCreateDrawableState(int extraSpace) {
        return null;
    }
    
    @java.lang.Override
    public void clearFocus() {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.Nullable
    android.view.View p0) {
    }
    
    public final void reset() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/kaizenvpn/vpn/core/widget/InputView$Companion;", "", "()V", "ACTION_CANCEL", "", "ACTION_HINT", "ACTION_NONE", "STATE_ERROR", "", "getSTATE_ERROR", "()[I", "setSTATE_ERROR", "([I)V", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final int[] getSTATE_ERROR() {
            return null;
        }
        
        public final void setSTATE_ERROR(@org.jetbrains.annotations.NotNull
        int[] p0) {
        }
    }
}