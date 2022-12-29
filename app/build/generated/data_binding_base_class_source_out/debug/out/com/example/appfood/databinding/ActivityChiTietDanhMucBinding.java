// Generated by view binder compiler. Do not edit!
package com.example.appfood.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.appfood.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityChiTietDanhMucBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView miniCart;

  @NonNull
  public final RecyclerView recycleViewChiTietDanhMuc;

  @NonNull
  public final Toolbar toolbarChitietdanhmuc;

  private ActivityChiTietDanhMucBinding(@NonNull LinearLayout rootView, @NonNull ImageView miniCart,
      @NonNull RecyclerView recycleViewChiTietDanhMuc, @NonNull Toolbar toolbarChitietdanhmuc) {
    this.rootView = rootView;
    this.miniCart = miniCart;
    this.recycleViewChiTietDanhMuc = recycleViewChiTietDanhMuc;
    this.toolbarChitietdanhmuc = toolbarChitietdanhmuc;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChiTietDanhMucBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChiTietDanhMucBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_chi_tiet_danh_muc, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChiTietDanhMucBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.miniCart;
      ImageView miniCart = ViewBindings.findChildViewById(rootView, id);
      if (miniCart == null) {
        break missingId;
      }

      id = R.id.recycleView_ChiTietDanhMuc;
      RecyclerView recycleViewChiTietDanhMuc = ViewBindings.findChildViewById(rootView, id);
      if (recycleViewChiTietDanhMuc == null) {
        break missingId;
      }

      id = R.id.toolbar_Chitietdanhmuc;
      Toolbar toolbarChitietdanhmuc = ViewBindings.findChildViewById(rootView, id);
      if (toolbarChitietdanhmuc == null) {
        break missingId;
      }

      return new ActivityChiTietDanhMucBinding((LinearLayout) rootView, miniCart,
          recycleViewChiTietDanhMuc, toolbarChitietdanhmuc);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
