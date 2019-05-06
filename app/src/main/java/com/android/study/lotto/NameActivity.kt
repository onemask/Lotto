package com.android.study.lotto

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class NameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        Toast.makeText(this,"여기는 NameActivity", Toast.LENGTH_LONG).show()
        setupIntent()
    }

    private fun setupIntent() {
        val intent = intent
        intent.putExtra("REUSLT","NameActivity 성공")
        setResult(Activity.RESULT_OK,intent)
        finish()
    }
}
