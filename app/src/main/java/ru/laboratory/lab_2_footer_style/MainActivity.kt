package ru.laboratory.lab_2_footer_style


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var email : EditText
    lateinit var pas : EditText
    lateinit var but : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pas = findViewById(R.id.et_pass)
        email = findViewById(R.id.et_email)
        but = findViewById(R.id.bt_login)

        but.setOnClickListener {
            var intent = Intent(this, ActivityProfile::class.java)
            startActivity(intent)
        }

    }


    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}