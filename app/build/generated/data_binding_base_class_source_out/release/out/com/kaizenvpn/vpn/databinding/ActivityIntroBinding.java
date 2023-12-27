// Generated by view binder compiler. Do not edit!
package com.kaizenvpn.vpn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kaizenvpn.vpn.R;
import com.kaizenvpn.vpn.core.util.ClickableViewPager;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityIntroBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout linearLayoutSkip;

  @NonNull
  public final RelativeLayout relativeLayoutSlide;

  @NonNull
  public final ClickableViewPager viewPagerSlide;

  private ActivityIntroBinding(@NonNull RelativeLayout rootView,
      @NonNull LinearLayout linearLayoutSkip, @NonNull RelativeLayout relativeLayoutSlide,
      @NonNull ClickableViewPager viewPagerSlide) {
    this.rootView = rootView;
    this.linearLayoutSkip = linearLayoutSkip;
    this.relativeLayoutSlide = relativeLayoutSlide;
    this.viewPagerSlide = viewPagerSlide;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityIntroBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityIntroBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_intro, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityIntroBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.linear_layout_skip;
      LinearLayout linearLayoutSkip = ViewBindings.findChildViewById(rootView, id);
      if (linearLayoutSkip == null) {
        break missingId;
      }

      RelativeLayout relativeLayoutSlide = (RelativeLayout) rootView;

      id = R.id.view_pager_slide;
      ClickableViewPager viewPagerSlide = ViewBindings.findChildViewById(rootView, id);
      if (viewPagerSlide == null) {
        break missingId;
      }

      return new ActivityIntroBinding((RelativeLayout) rootView, linearLayoutSkip,
          relativeLayoutSlide, viewPagerSlide);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
