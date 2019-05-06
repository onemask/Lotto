package com.android.study.lotto

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var value : String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"여기는 MainActivity",Toast.LENGTH_LONG).show()
        //setupIntent()
        sendIntentInfo()
    }

    private fun setupIntent() {
        val intent =intent
        value = intent.getStringExtra("MainActivity")
        Log.d("MainActivity","$value")
      //  sendIntentInfo()
    }

    private fun sendIntentInfo(){
        val intent = intent
        value = intent.getStringExtra("MainActivity")
        Log.d("value", "$value")

        intent.putExtra("RESULT","MainActivity 성공")
        setResult(Activity.RESULT_OK,intent)
        Log.d("MainActivity","${intent.getStringExtra("MainActivity")}")
        finish()
    }
}
