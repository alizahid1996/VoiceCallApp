package com.example.voicecallapp.LoginScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.voicecallapp.R;
import com.example.voicecallapp.databinding.ActivityForgotPasswordBinding;

public class ForgotPasswordActivity extends AppCompatActivity {
    ActivityForgotPasswordBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityForgotPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backButton.setOnClickListener(v -> {

            finish();
        });

        binding.sendOTP.setOnClickListener(v -> {
            Intent intent = new Intent(ForgotPasswordActivity.this,OTPVerifyActivity.class);
            startActivity(intent);
        });


    }
}