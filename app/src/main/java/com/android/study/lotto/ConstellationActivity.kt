package com.android.study.lotto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ConstellationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constellation)
        Toast.makeText(this,"여기는 ConstellationActivity", Toast.LENGTH_LONG).show()

    }
}
