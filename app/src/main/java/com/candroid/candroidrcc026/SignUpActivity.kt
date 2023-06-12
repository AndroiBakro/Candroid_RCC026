package com.candroid.candroidrcc026

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.candroid.candroidrcc026.databinding.ActivitySignUpBinding
import com.google.android.gms.ads.MobileAds

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        MobileAds.initialize(this) {}

        binding.alreadyUserTv.setOnClickListener {
            val i = Intent(this, LoginActivity::class.java)
            startActivity(i)
            finish()
        }

        binding.signUpBtn.setOnClickListener {
            val email = binding.emailEt.text.toString()
            val password = binding.passwordEt.text.toString()
            //Sign up for our new user
        }

    }
}