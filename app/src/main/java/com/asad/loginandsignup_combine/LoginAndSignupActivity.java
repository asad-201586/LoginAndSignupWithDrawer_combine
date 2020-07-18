package com.asad.loginandsignup_combine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class LoginAndSignupActivity extends AppCompatActivity {

    private Button mSignUpButton,mSignInButton;
    private LinearLayout mSignInLayout,mSignUpLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_and_signup);

        initialize();

        mSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSignInButton.setBackground(getResources().getDrawable(R.drawable.login));
                mSignInButton.setTextColor(getResources().getColor(R.color.white));
                mSignUpButton.setBackground(getResources().getDrawable(R.drawable.white_rectangle));
                mSignUpButton.setTextColor(getResources().getColor(R.color.white_50));

                mSignUpLayout.setVisibility(View.GONE);
                mSignInLayout.setVisibility(View.VISIBLE);
            }
        });

        mSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSignUpButton.setBackground(getResources().getDrawable(R.drawable.signup));
                mSignUpButton.setTextColor(getResources().getColor(R.color.white));
                mSignInButton.setBackground(getResources().getDrawable(R.drawable.white_rectangle));
                mSignInButton.setTextColor(getResources().getColor(R.color.white_50));

                mSignUpLayout.setVisibility(View.VISIBLE);
                mSignInLayout.setVisibility(View.GONE);

            }
        });

    }

    private void initialize()
    {
        mSignInButton = findViewById(R.id.signin_button_id);
        mSignUpButton = findViewById(R.id.signup_button_id);
        mSignInLayout = findViewById(R.id.signIn_linear_layout);
        mSignUpLayout = findViewById(R.id.signUp_linear_layout);
    }
}