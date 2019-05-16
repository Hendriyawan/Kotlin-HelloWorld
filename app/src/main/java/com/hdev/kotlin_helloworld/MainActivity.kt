package com.hdev.kotlin_helloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife

/*
16 05 2019 created by Hendriyawan
 */
class MainActivity : AppCompatActivity() {
    @BindView(R.id.tv_hello)
    lateinit var hello: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //bind view
        ButterKnife.bind(this)
        //set text value from string xml
        hello.setText(resources.getText(R.string.hello))
    }
}