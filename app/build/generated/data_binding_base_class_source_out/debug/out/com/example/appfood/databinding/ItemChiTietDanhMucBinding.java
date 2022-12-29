// Generated by view binder compiler. Do not edit!
package com.example.appfood.databinding;

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
import com.example.appfood.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemChiTietDanhMucBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView giaDanhmuc;

  @NonNull
  public final ImageView hinhmonDanhmuc;

  @NonNull
  public final TextView motaDanhmuc;

  @NonNull
  public final TextView tenmonDanhmuc;

  private ItemChiTietDanhMucBinding(@NonNull CardView rootView, @NonNull TextView giaDanhmuc,
      @NonNull ImageView hinhmonDanhmuc, @NonNull TextView motaDanhmuc,
      @NonNull TextView tenmonDanhmuc) {
    this.rootView = rootView;
    this.giaDanhmuc = giaDanhmuc;
    this.hinhmonDanhmuc = hinhmonDanhmuc;
    this.motaDanhmuc = motaDanhmuc;
    this.tenmonDanhmuc = tenmonDanhmuc;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemChiTietDanhMucBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemChiTietDanhMucBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_chi_tiet_danh_muc, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemChiTietDanhMucBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.gia_danhmuc;
      TextView giaDanhmuc = ViewBindings.findChildViewById(rootView, id);
      if (giaDanhmuc == null) {
        break missingId;
      }

      id = R.id.hinhmon_danhmuc;
      ImageView hinhmonDanhmuc = ViewBindings.findChildViewById(rootView, id);
      if (hinhmonDanhmuc == null) {
        break missingId;
      }

      id = R.id.mota_danhmuc;
      TextView motaDanhmuc = ViewBindings.findChildViewById(rootView, id);
      if (motaDanhmuc == null) {
        break missingId;
      }

      id = R.id.tenmon_danhmuc;
      TextView tenmonDanhmuc = ViewBindings.findChildViewById(rootView, id);
      if (tenmonDanhmuc == null) {
        break missingId;
      }

      return new ItemChiTietDanhMucBinding((CardView) rootView, giaDanhmuc, hinhmonDanhmuc,
          motaDanhmuc, tenmonDanhmuc);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}