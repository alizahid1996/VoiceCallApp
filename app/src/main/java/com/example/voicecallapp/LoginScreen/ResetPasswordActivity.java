package com.example.voicecallapp.LoginScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.voicecallapp.R;
import com.example.voicecallapp.databinding.ActivityResetPasswordBinding;

public class ResetPasswordActivity extends AppCompatActivity {

    ActivityResetPasswordBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResetPasswordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.passwordReset.setOnClickListener(v -> {
            Intent intent = new Intent(ResetPasswordActivity.this,LoginActivity.class);
            startActivity(intent);
        });
        binding.backButton.setOnClickListener(v -> {

            finish();
        });
    }
}