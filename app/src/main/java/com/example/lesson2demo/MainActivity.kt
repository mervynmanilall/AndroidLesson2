package com.example.lesson2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.lesson2demo.data.UserDetail
import com.example.lesson2demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        val btnGenerateSentence: Button = findViewById(R.id.btnGenerate)
        binding.btnGenerate.setOnClickListener {
//            val fullName: EditText = findViewById(R.id.txtFullName)
            val fullName = binding.txtFullName.text.toString()

//            val userName: EditText = findViewById(R.id.txtUserName)
            val userName = binding.txtUserName.text.toString()

            val resultSentence = "${fullName} - ${userName}"

            binding.userDetails = UserDetail(
                fullName,
                userName,
                resultSentence
            )

//            val txtResult: TextView = findViewById(R.id.txtResult)
//            txtResult.text = resultSentence

//            binding.txtResult.text = resultSentence



        }
    }
}