package com.android.study.lotto

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        setupBtn()
    }

    private fun setupBtn() {
        button_main.setOnClickListener {
            val intent = Intent(this@TestActivity,MainActivity::class.java)
            startActivity(intent)
        }

        button_constellation.setOnClickListener {
            val intent = Intent(this@TestActivity,ConstellationActivity::class.java)
            startActivity(intent)
        }

        button_name.setOnClickListener {
            val intent = Intent(this@TestActivity,NameActivity::class.java)
            startActivity(intent)
        }

        button_result.setOnClickListener {
            val intent = Intent(this@TestActivity, ResultActivity::class.java)
            startActivity(intent)
        }
    }

    /*
        xml에서 참조할 수 있게 메소드 정의.
     */

     private fun onclick(view : View){
        val intent = Intent(this@TestActivity,NameActivity::class.java)
        startActivity(intent)
    }

    fun callWeb(view : View){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://naver.com"))
        startActivity(intent)
    }
}
