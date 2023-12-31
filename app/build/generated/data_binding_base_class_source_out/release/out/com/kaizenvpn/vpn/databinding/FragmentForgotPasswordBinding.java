// Generated by view binder compiler. Do not edit!
package com.kaizenvpn.vpn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kaizenvpn.vpn.R;
import com.kaizenvpn.vpn.core.widget.InputView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentForgotPasswordBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView btnAction;

  @NonNull
  public final ImageButton btnClose;

  @NonNull
  public final InputView inputEmail;

  @NonNull
  public final TextView tvTitle;

  private FragmentForgotPasswordBinding(@NonNull LinearLayout rootView, @NonNull TextView btnAction,
      @NonNull ImageButton btnClose, @NonNull InputView inputEmail, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.btnAction = btnAction;
    this.btnClose = btnClose;
    this.inputEmail = inputEmail;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentForgotPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentForgotPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_forgot_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentForgotPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_action;
      TextView btnAction = ViewBindings.findChildViewById(rootView, id);
      if (btnAction == null) {
        break missingId;
      }

      id = R.id.btn_close;
      ImageButton btnClose = ViewBindings.findChildViewById(rootView, id);
      if (btnClose == null) {
        break missingId;
      }

      id = R.id.input_email;
      InputView inputEmail = ViewBindings.findChildViewById(rootView, id);
      if (inputEmail == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new FragmentForgotPasswordBinding((LinearLayout) rootView, btnAction, btnClose,
          inputEmail, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
