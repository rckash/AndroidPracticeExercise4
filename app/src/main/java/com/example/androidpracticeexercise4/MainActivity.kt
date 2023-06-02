package com.example.androidpracticeexercise4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.androidpracticeexercise4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = "EggCracker_69"
        val password = "password"

        binding.buttonLogin.setOnClickListener {
            isValidCredentials(username, password)
        }
    }
    fun isValidCredentials(username: String, password: String) {
        val usernameInput = binding.editTextUsername.text.toString()
        val passwordInput = binding.editTextPassword.text.toString()

        if ((usernameInput == username) && (passwordInput == password)) {
            val myIntent = Intent(this, HomePageActivity::class.java)
            startActivity(myIntent)
            finish()
        } else {
            val toastText = "Incorrect credential/s"
            val toast = Toast.makeText(this, toastText, 3)
            toast.show()
        }
    }
}