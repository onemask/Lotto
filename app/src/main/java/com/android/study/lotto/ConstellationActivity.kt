package com.android.study.lotto

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ConstellationActivity : AppCompatActivity() {

    private var str : String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constellation)
        Toast.makeText(this,"여기는 ConstellationActivity", Toast.LENGTH_LONG).show()
        setupIntent()
    }

    private fun setupIntent(){
        val intent = intent
        str = intent.getStringExtra("ConstellationActivity")
        intent.getStringExtra("")
        intent.putExtra("RESULT","ConstellationActivity 성공")
        setResult(Activity.RESULT_OK,intent)
        finish()
    }



}
