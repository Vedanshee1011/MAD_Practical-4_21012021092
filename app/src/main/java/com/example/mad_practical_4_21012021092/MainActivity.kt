package com.example.mad_practical_4_21012021092
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.Loginbutton).setOnClickListener {
// Create an Intent to navigate to SecondActivity
            val intent = Intent(this,login::class.java)
            startActivity(intent)}
        findViewById<View>(R.id.signupbutton).setOnClickListener {
// Create an Intent to navigate to SecondActivity
            val intent = Intent(this,registratration::class.java)
            startActivity(intent)}}}