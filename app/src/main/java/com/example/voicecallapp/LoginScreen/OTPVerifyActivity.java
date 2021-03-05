package com.example.voicecallapp.LoginScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.voicecallapp.R;
import com.example.voicecallapp.databinding.ActivityOTPVerifyBinding;

public class OTPVerifyActivity extends AppCompatActivity {

    ActivityOTPVerifyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOTPVerifyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backButton.setOnClickListener(v -> {

            finish();
        });

        binding.submitOTP.setOnClickListener(v -> {
            Intent intent = new Intent(OTPVerifyActivity.this,ResetPasswordActivity.class);
            startActivity(intent);
        });
    }
}