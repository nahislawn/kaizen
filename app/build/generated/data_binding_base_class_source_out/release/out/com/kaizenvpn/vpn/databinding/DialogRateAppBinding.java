// Generated by view binder compiler. Do not edit!
package com.kaizenvpn.vpn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kaizenvpn.vpn.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogRateAppBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView btnRate;

  @NonNull
  public final TextView btnRefuse;

  @NonNull
  public final TextView tvDescription;

  @NonNull
  public final TextView tvTitle;

  private DialogRateAppBinding(@NonNull ConstraintLayout rootView, @NonNull TextView btnRate,
      @NonNull TextView btnRefuse, @NonNull TextView tvDescription, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.btnRate = btnRate;
    this.btnRefuse = btnRefuse;
    this.tvDescription = tvDescription;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogRateAppBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogRateAppBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_rate_app, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogRateAppBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_rate;
      TextView btnRate = ViewBindings.findChildViewById(rootView, id);
      if (btnRate == null) {
        break missingId;
      }

      id = R.id.btn_refuse;
      TextView btnRefuse = ViewBindings.findChildViewById(rootView, id);
      if (btnRefuse == null) {
        break missingId;
      }

      id = R.id.tv_description;
      TextView tvDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvDescription == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new DialogRateAppBinding((ConstraintLayout) rootView, btnRate, btnRefuse,
          tvDescription, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}