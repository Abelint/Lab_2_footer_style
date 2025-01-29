package ru.laboratory.lab_2_footer_style

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ActivityProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        Toast.makeText(this, "Hello!", Toast.LENGTH_LONG).show()
    }
}