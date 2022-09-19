package com.example.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() ,LifecycleOwner {
    lateinit var textview :TextView
    lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview=findViewById(R.id.textView)
        button=findViewById(R.id.button)
        val viewModel = ViewModelProvider(this).get(MainActivityViewModel ::class.java)


        button.setOnClickListener {
         viewModel.addNumber()
            textview.text=viewModel.number.toString()

        }
    }
}