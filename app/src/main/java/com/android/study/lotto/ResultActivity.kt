package com.android.study.lotto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        Toast.makeText(this,"여기는 ResultActivity", Toast.LENGTH_LONG).show()

    }
}
