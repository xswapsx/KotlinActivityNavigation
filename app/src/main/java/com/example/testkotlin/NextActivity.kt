package com.example.testkotlin

import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testkotlin.databinding.NextActivityBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: NextActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = NextActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

// Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra("Data")
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        // Capture the layout's TextView and set the string as its text
        binding.textView2.text = message
    }
}