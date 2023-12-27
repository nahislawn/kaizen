package com.kaizenvpn.vpn.presentation.main.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u001a\u001bB\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\r\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J*\u0010\r\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u001c\u0010\u0014\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002R\"\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/adapter/LocationAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/kaizenvpn/vpn/data/model/VPNServer;", "Lcom/kaizenvpn/vpn/presentation/main/adapter/LocationAdapter$ViewHolder;", "onItemClicked", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "value", "", "_idSelected", "set_idSelected", "(Ljava/lang/String;)V", "onBindViewHolder", "holder", "position", "", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCurrentServer", "server", "Companion", "ViewHolder", "app_release"})
public final class LocationAdapter extends androidx.recyclerview.widget.ListAdapter<com.kaizenvpn.vpn.data.model.VPNServer, com.kaizenvpn.vpn.presentation.main.adapter.LocationAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.kaizenvpn.vpn.data.model.VPNServer, kotlin.Unit> onItemClicked = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.kaizenvpn.vpn.data.model.VPNServer> diff = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.String _idSelected;
    @org.jetbrains.annotations.NotNull
    public static final com.kaizenvpn.vpn.presentation.main.adapter.LocationAdapter.Companion Companion = null;
    
    public LocationAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.kaizenvpn.vpn.data.model.VPNServer, kotlin.Unit> onItemClicked) {
        super(null);
    }
    
    private final void set_idSelected(java.lang.String value) {
    }
    
    public final void setCurrentServer(@org.jetbrains.annotations.Nullable
    com.kaizenvpn.vpn.data.model.VPNServer server) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.kaizenvpn.vpn.presentation.main.adapter.LocationAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.presentation.main.adapter.LocationAdapter.ViewHolder holder, int position, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Object> payloads) {
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.kaizenvpn.vpn.presentation.main.adapter.LocationAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/adapter/LocationAdapter$Companion;", "", "()V", "diff", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/kaizenvpn/vpn/data/model/VPNServer;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/kaizenvpn/vpn/presentation/main/adapter/LocationAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/kaizenvpn/vpn/databinding/ItemLocationBinding;", "(Lcom/kaizenvpn/vpn/presentation/main/adapter/LocationAdapter;Lcom/kaizenvpn/vpn/databinding/ItemLocationBinding;)V", "bindData", "", "server", "Lcom/kaizenvpn/vpn/data/model/VPNServer;", "app_release"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.kaizenvpn.vpn.databinding.ItemLocationBinding viewBinding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.kaizenvpn.vpn.databinding.ItemLocationBinding viewBinding) {
            super(null);
        }
        
        public final void bindData(@org.jetbrains.annotations.NotNull
        com.kaizenvpn.vpn.data.model.VPNServer server) {
        }
    }
}