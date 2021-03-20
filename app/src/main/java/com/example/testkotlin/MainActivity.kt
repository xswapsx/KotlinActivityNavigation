package com.example.testkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.Toast
import com.example.testkotlin.databinding.ActivityMainBinding
import com.example.testkotlin.R.string

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.tv1.text = getString(string.hello_from_vb_activity)
        binding.textView.text = getString(string.wecm)
        binding.textView.setOnClickListener(View.OnClickListener {
            val message = "What is up"
            val intent = Intent(this, NextActivity::class.java)
            intent.putExtra("Data",message)
            startActivity(intent)
        })
    }
}