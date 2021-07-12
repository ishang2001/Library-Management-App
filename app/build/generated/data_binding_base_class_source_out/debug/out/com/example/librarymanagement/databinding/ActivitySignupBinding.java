// Generated by view binder compiler. Do not edit!
package com.example.librarymanagement.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.librarymanagement.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignupBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final EditText binid;

  @NonNull
  public final Button confirmeyes;

  @NonNull
  public final LinearLayout eight;

  @NonNull
  public final RelativeLayout first;

  @NonNull
  public final RelativeLayout five;

  @NonNull
  public final RelativeLayout four;

  @NonNull
  public final EditText mobileNumber;

  @NonNull
  public final Button passwordeyes;

  @NonNull
  public final EditText sConfirmPassword;

  @NonNull
  public final Spinner sDeptment;

  @NonNull
  public final EditText sName;

  @NonNull
  public final EditText sPassword;

  @NonNull
  public final Spinner sSem;

  @NonNull
  public final Button sSignup;

  @NonNull
  public final EditText sSurname;

  @NonNull
  public final ScrollView scrollable1;

  @NonNull
  public final RelativeLayout second;

  @NonNull
  public final LinearLayout seven;

  @NonNull
  public final RelativeLayout six;

  @NonNull
  public final RelativeLayout third;

  private ActivitySignupBinding(@NonNull RelativeLayout rootView, @NonNull EditText binid,
      @NonNull Button confirmeyes, @NonNull LinearLayout eight, @NonNull RelativeLayout first,
      @NonNull RelativeLayout five, @NonNull RelativeLayout four, @NonNull EditText mobileNumber,
      @NonNull Button passwordeyes, @NonNull EditText sConfirmPassword, @NonNull Spinner sDeptment,
      @NonNull EditText sName, @NonNull EditText sPassword, @NonNull Spinner sSem,
      @NonNull Button sSignup, @NonNull EditText sSurname, @NonNull ScrollView scrollable1,
      @NonNull RelativeLayout second, @NonNull LinearLayout seven, @NonNull RelativeLayout six,
      @NonNull RelativeLayout third) {
    this.rootView = rootView;
    this.binid = binid;
    this.confirmeyes = confirmeyes;
    this.eight = eight;
    this.first = first;
    this.five = five;
    this.four = four;
    this.mobileNumber = mobileNumber;
    this.passwordeyes = passwordeyes;
    this.sConfirmPassword = sConfirmPassword;
    this.sDeptment = sDeptment;
    this.sName = sName;
    this.sPassword = sPassword;
    this.sSem = sSem;
    this.sSignup = sSignup;
    this.sSurname = sSurname;
    this.scrollable1 = scrollable1;
    this.second = second;
    this.seven = seven;
    this.six = six;
    this.third = third;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_signup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.binid;
      EditText binid = rootView.findViewById(id);
      if (binid == null) {
        break missingId;
      }

      id = R.id.confirmeyes;
      Button confirmeyes = rootView.findViewById(id);
      if (confirmeyes == null) {
        break missingId;
      }

      id = R.id.eight;
      LinearLayout eight = rootView.findViewById(id);
      if (eight == null) {
        break missingId;
      }

      id = R.id.first;
      RelativeLayout first = rootView.findViewById(id);
      if (first == null) {
        break missingId;
      }

      id = R.id.five;
      RelativeLayout five = rootView.findViewById(id);
      if (five == null) {
        break missingId;
      }

      id = R.id.four;
      RelativeLayout four = rootView.findViewById(id);
      if (four == null) {
        break missingId;
      }

      id = R.id.mobile_number;
      EditText mobileNumber = rootView.findViewById(id);
      if (mobileNumber == null) {
        break missingId;
      }

      id = R.id.passwordeyes;
      Button passwordeyes = rootView.findViewById(id);
      if (passwordeyes == null) {
        break missingId;
      }

      id = R.id.s_confirm_password;
      EditText sConfirmPassword = rootView.findViewById(id);
      if (sConfirmPassword == null) {
        break missingId;
      }

      id = R.id.s_deptment;
      Spinner sDeptment = rootView.findViewById(id);
      if (sDeptment == null) {
        break missingId;
      }

      id = R.id.s_name;
      EditText sName = rootView.findViewById(id);
      if (sName == null) {
        break missingId;
      }

      id = R.id.s_password;
      EditText sPassword = rootView.findViewById(id);
      if (sPassword == null) {
        break missingId;
      }

      id = R.id.s_sem;
      Spinner sSem = rootView.findViewById(id);
      if (sSem == null) {
        break missingId;
      }

      id = R.id.s_signup;
      Button sSignup = rootView.findViewById(id);
      if (sSignup == null) {
        break missingId;
      }

      id = R.id.s_surname;
      EditText sSurname = rootView.findViewById(id);
      if (sSurname == null) {
        break missingId;
      }

      id = R.id.scrollable1;
      ScrollView scrollable1 = rootView.findViewById(id);
      if (scrollable1 == null) {
        break missingId;
      }

      id = R.id.second;
      RelativeLayout second = rootView.findViewById(id);
      if (second == null) {
        break missingId;
      }

      id = R.id.seven;
      LinearLayout seven = rootView.findViewById(id);
      if (seven == null) {
        break missingId;
      }

      id = R.id.six;
      RelativeLayout six = rootView.findViewById(id);
      if (six == null) {
        break missingId;
      }

      id = R.id.third;
      RelativeLayout third = rootView.findViewById(id);
      if (third == null) {
        break missingId;
      }

      return new ActivitySignupBinding((RelativeLayout) rootView, binid, confirmeyes, eight, first,
          five, four, mobileNumber, passwordeyes, sConfirmPassword, sDeptment, sName, sPassword,
          sSem, sSignup, sSurname, scrollable1, second, seven, six, third);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}