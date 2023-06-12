package com.candroid.candroidrcc026

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.candroid.candroidrcc026.databinding.ActivityLoginBinding
import com.candroid.candroidrcc026.databinding.ActivitySignUpBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.newUserTv.setOnClickListener {
            val i = Intent(this, SignUpActivity::class.java)
            startActivity(i)
            finish()
        }

        binding.loginBtn.setOnClickListener {
            val email = binding.emailEt.text.toString()
            val password = binding.passwordEt.text.toString()
            //Login for our existing user
        }

    }
}