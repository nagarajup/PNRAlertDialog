package com.pnr.pnralertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.pnr.mylibrary.PNRAlert

class MainActivity : AppCompatActivity() {
    lateinit var button: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.btn);
        button.setOnClickListener { PNRAlert().myAlert(this@MainActivity) }
    }
}