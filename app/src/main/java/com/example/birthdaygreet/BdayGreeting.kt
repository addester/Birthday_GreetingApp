package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BdayGreeting : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bday_greeting)
        val name = intent.getStringExtra(NAME_EXTRA)
        val birthdayGreeting = findViewById<TextView>(R.id.birthdayGreeting)
        birthdayGreeting.setText("Happy Birthday\n$name!")


    }
}