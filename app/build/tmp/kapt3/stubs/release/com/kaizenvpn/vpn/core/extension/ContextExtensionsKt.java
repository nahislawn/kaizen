package com.kaizenvpn.vpn.core.extension;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\b\u001a\u0014\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000b\u001a\f\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u0002\u001a\u0012\u0010\u000e\u001a\u00020\b*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\b\u001a\u0014\u0010\u0010\u001a\u00020\u000b*\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\b\u001a\u0012\u0010\u0012\u001a\u00020\b*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\b\u001a\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\b\u001a\u0016\u0010\u0015\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u001a\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018*\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\b\u001a*\u0010\u001c\u001a\u00020\u0001*\u0004\u0018\u00010\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010 H\u0007\u001a\f\u0010!\u001a\u00020\u0001*\u0004\u0018\u00010\r\u001a\n\u0010\"\u001a\u00020#*\u00020\u0002\u001a-\u0010$\u001a\u00020\u0001*\u00020\u00022\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&2\u0006\u0010\'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004\u00a2\u0006\u0002\u0010)\u001a\u0012\u0010*\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0004\u001a\u0016\u0010+\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0004\u001a\u0012\u0010-\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a3\u0010.\u001a\u00020\u0001*\u00020\r2\n\b\u0003\u0010/\u001a\u0004\u0018\u00010\b2\n\b\u0003\u00100\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00101\u001a\u0004\u0018\u00010#\u00a2\u0006\u0002\u00102\u001a\u0012\u00103\u001a\u00020\u0001*\u00020\u00022\u0006\u00104\u001a\u00020\u0004\u001a\u0014\u00105\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u00106\u001a\u000207\u001a\u001e\u00108\u001a\u00020\u0001*\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010:\u001a\u00020#\u001a\u0014\u0010;\u001a\u00020\u0001*\u00020\r2\b\b\u0002\u00101\u001a\u00020#\u001a\u0012\u0010<\u001a\u00020\u0001*\u00020\u00022\u0006\u00104\u001a\u00020\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006="}, d2 = {"deleteFileFromUri", "", "Landroid/content/Context;", "fileUri", "", "fileName", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dimen", "", "dpToPx", "dp", "", "getActivity", "Landroid/app/Activity;", "getColorAttr", "attr", "getDimension", "id", "getDimensionAttr", "getDrawableAttr", "Landroid/graphics/drawable/Drawable;", "getMoreApps", "url", "getNavGraph", "Landroidx/navigation/NavGraph;", "navController", "Landroidx/navigation/NavController;", "navigation", "hideKeyboardWhenTouchOutside", "view", "Landroid/view/View;", "callback", "Lkotlin/Function0;", "hideSoftKeyboard", "isNetworkConnected", "", "openMail", "emails", "", "subject", "extraText", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "openUrl", "rateApp", "packageName", "readAsset", "setWindowStatusNav", "statusBarColor", "navBarColor", "flagLight", "(Landroid/app/Activity;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "shareContent", "path", "showKeyboard", "editText", "Landroid/widget/EditText;", "showToast", "message", "isShort", "updateLightStatusBar", "viewContent", "app_release"})
@kotlin.Suppress(names = {"DEPRECATION"})
public final class ContextExtensionsKt {
    
    /**
     * Create by QuyenLX
     */
    public static final boolean isNetworkConnected(@org.jetbrains.annotations.NotNull
    android.content.Context $this$isNetworkConnected) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String readAsset(@org.jetbrains.annotations.NotNull
    android.content.Context $this$readAsset, @org.jetbrains.annotations.NotNull
    java.lang.String fileName) {
        return null;
    }
    
    public static final void showToast(@org.jetbrains.annotations.NotNull
    android.content.Context $this$showToast, @org.jetbrains.annotations.Nullable
    java.lang.String message, boolean isShort) {
    }
    
    public static final int dpToPx(@org.jetbrains.annotations.Nullable
    android.content.Context $this$dpToPx, float dp) {
        return 0;
    }
    
    public static final float getDimension(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getDimension, @androidx.annotation.DimenRes
    int id) {
        return 0.0F;
    }
    
    public static final int getColorAttr(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getColorAttr, int attr) {
        return 0;
    }
    
    public static final int getDimensionAttr(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getDimensionAttr, int attr) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final android.graphics.drawable.Drawable getDrawableAttr(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getDrawableAttr, int attr) {
        return null;
    }
    
    public static final void showKeyboard(@org.jetbrains.annotations.Nullable
    android.content.Context $this$showKeyboard, @org.jetbrains.annotations.NotNull
    android.widget.EditText editText) {
    }
    
    public static final void hideSoftKeyboard(@org.jetbrains.annotations.Nullable
    android.app.Activity $this$hideSoftKeyboard) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public static final void hideKeyboardWhenTouchOutside(@org.jetbrains.annotations.Nullable
    android.app.Activity $this$hideKeyboardWhenTouchOutside, @org.jetbrains.annotations.Nullable
    android.view.View view, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public static final void setWindowStatusNav(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$setWindowStatusNav, @androidx.annotation.ColorInt
    @org.jetbrains.annotations.Nullable
    java.lang.Integer statusBarColor, @androidx.annotation.ColorInt
    @org.jetbrains.annotations.Nullable
    java.lang.Integer navBarColor, @org.jetbrains.annotations.Nullable
    java.lang.Boolean flagLight) {
    }
    
    public static final void updateLightStatusBar(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$updateLightStatusBar, boolean flagLight) {
    }
    
    @org.jetbrains.annotations.Nullable
    public static final androidx.navigation.NavGraph getNavGraph(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$getNavGraph, @org.jetbrains.annotations.Nullable
    androidx.navigation.NavController navController, int navigation) {
        return null;
    }
    
    public static final void openUrl(@org.jetbrains.annotations.NotNull
    android.content.Context $this$openUrl, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    public static final int dimen(@org.jetbrains.annotations.NotNull
    android.content.Context $this$dimen, @androidx.annotation.DimenRes
    int dimen) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final android.app.Activity getActivity(@org.jetbrains.annotations.NotNull
    android.content.Context $this$getActivity) {
        return null;
    }
    
    public static final void openMail(@org.jetbrains.annotations.NotNull
    android.content.Context $this$openMail, @org.jetbrains.annotations.NotNull
    java.lang.String[] emails, @org.jetbrains.annotations.NotNull
    java.lang.String subject, @org.jetbrains.annotations.NotNull
    java.lang.String extraText) {
    }
    
    public static final void rateApp(@org.jetbrains.annotations.Nullable
    android.content.Context $this$rateApp, @org.jetbrains.annotations.Nullable
    java.lang.String packageName) {
    }
    
    public static final void getMoreApps(@org.jetbrains.annotations.Nullable
    android.content.Context $this$getMoreApps, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    public static final void viewContent(@org.jetbrains.annotations.NotNull
    android.content.Context $this$viewContent, @org.jetbrains.annotations.NotNull
    java.lang.String path) {
    }
    
    public static final void shareContent(@org.jetbrains.annotations.NotNull
    android.content.Context $this$shareContent, @org.jetbrains.annotations.NotNull
    java.lang.String path) {
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object deleteFileFromUri(@org.jetbrains.annotations.NotNull
    android.content.Context $this$deleteFileFromUri, @org.jetbrains.annotations.NotNull
    java.lang.String fileUri, @org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}