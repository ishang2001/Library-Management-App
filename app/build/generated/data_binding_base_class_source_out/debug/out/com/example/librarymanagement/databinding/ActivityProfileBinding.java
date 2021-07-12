// Generated by view binder compiler. Do not edit!
package com.example.librarymanagement.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.librarymanagement.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProfileBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView pDepartment;

  @NonNull
  public final TextView pEnroll;

  @NonNull
  public final TextView pMoblie;

  @NonNull
  public final TextView pName;

  @NonNull
  public final TextView pSem;

  @NonNull
  public final TextView pSurname;

  private ActivityProfileBinding(@NonNull RelativeLayout rootView, @NonNull TextView pDepartment,
      @NonNull TextView pEnroll, @NonNull TextView pMoblie, @NonNull TextView pName,
      @NonNull TextView pSem, @NonNull TextView pSurname) {
    this.rootView = rootView;
    this.pDepartment = pDepartment;
    this.pEnroll = pEnroll;
    this.pMoblie = pMoblie;
    this.pName = pName;
    this.pSem = pSem;
    this.pSurname = pSurname;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.p_department;
      TextView pDepartment = rootView.findViewById(id);
      if (pDepartment == null) {
        break missingId;
      }

      id = R.id.p_enroll;
      TextView pEnroll = rootView.findViewById(id);
      if (pEnroll == null) {
        break missingId;
      }

      id = R.id.p_moblie;
      TextView pMoblie = rootView.findViewById(id);
      if (pMoblie == null) {
        break missingId;
      }

      id = R.id.p_name;
      TextView pName = rootView.findViewById(id);
      if (pName == null) {
        break missingId;
      }

      id = R.id.p_sem;
      TextView pSem = rootView.findViewById(id);
      if (pSem == null) {
        break missingId;
      }

      id = R.id.p_surname;
      TextView pSurname = rootView.findViewById(id);
      if (pSurname == null) {
        break missingId;
      }

      return new ActivityProfileBinding((RelativeLayout) rootView, pDepartment, pEnroll, pMoblie,
          pName, pSem, pSurname);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}