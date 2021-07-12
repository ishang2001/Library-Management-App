// Generated by view binder compiler. Do not edit!
package com.example.librarymanagement.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import com.example.librarymanagement.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainPageBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final BottomNavigationView bottom;

  @NonNull
  public final DrawerLayout drawLayout;

  @NonNull
  public final FrameLayout fragmentContenter;

  @NonNull
  public final NavigationView nav;

  @NonNull
  public final Toolbar toolbar1;

  private ActivityMainPageBinding(@NonNull DrawerLayout rootView,
      @NonNull BottomNavigationView bottom, @NonNull DrawerLayout drawLayout,
      @NonNull FrameLayout fragmentContenter, @NonNull NavigationView nav,
      @NonNull Toolbar toolbar1) {
    this.rootView = rootView;
    this.bottom = bottom;
    this.drawLayout = drawLayout;
    this.fragmentContenter = fragmentContenter;
    this.nav = nav;
    this.toolbar1 = toolbar1;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main__page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottom;
      BottomNavigationView bottom = rootView.findViewById(id);
      if (bottom == null) {
        break missingId;
      }

      DrawerLayout drawLayout = (DrawerLayout) rootView;

      id = R.id.fragment_contenter;
      FrameLayout fragmentContenter = rootView.findViewById(id);
      if (fragmentContenter == null) {
        break missingId;
      }

      id = R.id.nav;
      NavigationView nav = rootView.findViewById(id);
      if (nav == null) {
        break missingId;
      }

      id = R.id.toolbar1;
      Toolbar toolbar1 = rootView.findViewById(id);
      if (toolbar1 == null) {
        break missingId;
      }

      return new ActivityMainPageBinding((DrawerLayout) rootView, bottom, drawLayout,
          fragmentContenter, nav, toolbar1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
