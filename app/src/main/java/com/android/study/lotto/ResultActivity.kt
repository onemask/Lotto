package com.android.study.lotto

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        Toast.makeText(this,"여기는 ResultActivity", Toast.LENGTH_LONG).show()
        setupInten()
    }

    private fun setupInten() {
        val intent =intent
        intent.putExtra("RESULT", "ResultActivity 성공")
        setResult(Activity.RESULT_OK,intent)
        finish()
    }
}
