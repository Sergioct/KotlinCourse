package com.sergiocrespotoubes.kotlincourse

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

/**
 * Created by Sergio Crespo Toubes on 09/12/2017.
 *     SergioCrespoToubes@gmail.com
 *     www.SergioCrespoToubes.com
 */
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle = intent.extras
        tv_age.text =  "La edad es de ${bundle.getInt("age")}"
    }
}