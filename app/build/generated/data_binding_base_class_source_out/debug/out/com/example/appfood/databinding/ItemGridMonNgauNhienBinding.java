// Generated by view binder compiler. Do not edit!
package com.example.appfood.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.appfood.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemGridMonNgauNhienBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView gia;

  @NonNull
  public final ImageView hinhmon;

  @NonNull
  public final TextView mota;

  @NonNull
  public final TextView tenmon;

  private ItemGridMonNgauNhienBinding(@NonNull LinearLayout rootView, @NonNull TextView gia,
      @NonNull ImageView hinhmon, @NonNull TextView mota, @NonNull TextView tenmon) {
    this.rootView = rootView;
    this.gia = gia;
    this.hinhmon = hinhmon;
    this.mota = mota;
    this.tenmon = tenmon;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemGridMonNgauNhienBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemGridMonNgauNhienBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_grid_mon_ngau_nhien, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemGridMonNgauNhienBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.gia;
      TextView gia = ViewBindings.findChildViewById(rootView, id);
      if (gia == null) {
        break missingId;
      }

      id = R.id.hinhmon;
      ImageView hinhmon = ViewBindings.findChildViewById(rootView, id);
      if (hinhmon == null) {
        break missingId;
      }

      id = R.id.mota;
      TextView mota = ViewBindings.findChildViewById(rootView, id);
      if (mota == null) {
        break missingId;
      }

      id = R.id.tenmon;
      TextView tenmon = ViewBindings.findChildViewById(rootView, id);
      if (tenmon == null) {
        break missingId;
      }

      return new ItemGridMonNgauNhienBinding((LinearLayout) rootView, gia, hinhmon, mota, tenmon);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
