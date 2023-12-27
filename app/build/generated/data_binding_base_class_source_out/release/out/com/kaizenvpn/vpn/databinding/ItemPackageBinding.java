// Generated by view binder compiler. Do not edit!
package com.kaizenvpn.vpn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kaizenvpn.vpn.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemPackageBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView imgCheck;

  @NonNull
  public final TextView tvPackage;

  @NonNull
  public final TextView tvPrice;

  @NonNull
  public final TextView tvSummary;

  private ItemPackageBinding(@NonNull CardView rootView, @NonNull ImageView imgCheck,
      @NonNull TextView tvPackage, @NonNull TextView tvPrice, @NonNull TextView tvSummary) {
    this.rootView = rootView;
    this.imgCheck = imgCheck;
    this.tvPackage = tvPackage;
    this.tvPrice = tvPrice;
    this.tvSummary = tvSummary;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPackageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPackageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_package, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPackageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_check;
      ImageView imgCheck = ViewBindings.findChildViewById(rootView, id);
      if (imgCheck == null) {
        break missingId;
      }

      id = R.id.tv_package;
      TextView tvPackage = ViewBindings.findChildViewById(rootView, id);
      if (tvPackage == null) {
        break missingId;
      }

      id = R.id.tv_price;
      TextView tvPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvPrice == null) {
        break missingId;
      }

      id = R.id.tv_summary;
      TextView tvSummary = ViewBindings.findChildViewById(rootView, id);
      if (tvSummary == null) {
        break missingId;
      }

      return new ItemPackageBinding((CardView) rootView, imgCheck, tvPackage, tvPrice, tvSummary);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
