package com.example.and_real_tuto

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun on1(v: View){

        Toast.makeText(getApplicationContext(),"Button이 눌렸습니다.",Toast.LENGTH_SHORT).show()
    }
}
