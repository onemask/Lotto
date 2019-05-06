package com.android.study.lotto

import android.app.Activity
import android.app.Instrumentation
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {

    private val MAIN_REQUEST_CODE = 100
    private val CONSTELLATION_REQUEST_CODE = 200
    private val NAME_REQUEST_CODE = 300
    private val RESULT__REQUEST_CODE = 400

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        setupBtn()
    }

    private fun setupBtn() {
        button_main.setOnClickListener {
            val intent = Intent(this@TestActivity, MainActivity::class.java)
            intent.putExtra("MainActivity", "MainActivity")
            Log.d("MainActivity", "${intent.getStringExtra("MainActivity")}")
            startActivityForResult(intent, MAIN_REQUEST_CODE)
            // startActivity(intent)

        }

        button_constellation.setOnClickListener {
            val intent = Intent(this@TestActivity, ConstellationActivity::class.java)
            intent.putExtra("ConstellationActivity", "ConstellationActivity")
            startActivityForResult(intent, CONSTELLATION_REQUEST_CODE)
            //startActivity(intent)
        }

        button_name.setOnClickListener {
            val intent = Intent(this@TestActivity, NameActivity::class.java)
            intent.putExtra("NameActivity", "NameActivity")
            startActivityForResult(intent, NAME_REQUEST_CODE)
            //startActivity(intent)
        }

        button_result.setOnClickListener {
            val intent = Intent(this@TestActivity, ResultActivity::class.java)
            intent.putExtra("ResultActivity", "ResultActivity")
            startActivityForResult(intent, RESULT__REQUEST_CODE)
            //startActivity(intent)
        }
    }

    /*
        xml에서 참조할 수 있게 메소드 정의.
     */

    private fun onclick(view: View) {
        val intent = Intent(this@TestActivity, NameActivity::class.java)
        startActivity(intent)
    }

    fun callWeb(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://naver.com"))
        startActivity(intent)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            MAIN_REQUEST_CODE -> {
                if (resultCode == Activity.RESULT_OK) {
                    Log.d("onActivityResult", "resultCode is $resultCode request is $requestCode")
                    Log.d("onActivityResult", "data is ${data!!.getStringExtra("RESULT")}")
                } else
                    return
            }
            CONSTELLATION_REQUEST_CODE -> {
                if (resultCode == Activity.RESULT_OK) {
                    Log.d("onActivityResult", "resultCode is $resultCode request is $requestCode")
                    Log.d("onActivityResult", "data is ${data!!.getStringExtra("RESULT")}")
                } else
                    return
            }
            NAME_REQUEST_CODE -> {
                if (resultCode == Activity.RESULT_OK) {
                    Log.d("onActivityResult", "resultCode is $resultCode request is $requestCode")
                    Log.d("onActivityResult", "data is ${data!!.getStringExtra("RESULT")}")
                } else
                    return
            }
            RESULT__REQUEST_CODE -> {
                if (resultCode == Activity.RESULT_OK) {
                    Log.d("onActivityResult", "resultCode is $resultCode request is $requestCode")
                    Log.d("onActivityResult", "data is ${data!!.getStringExtra("RESULT")}")

                } else
                    return
            }

        }

    }
}

