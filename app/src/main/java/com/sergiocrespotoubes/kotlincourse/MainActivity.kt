package com.sergiocrespotoubes.kotlincourse

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variables()
    }

    fun variables(){

        var nombre : String = "Sergio"
        val EDAD : Int = 27
        var ciudad : String = "Madrid"

        Log.i("TAG", "Test $ciudad")
    }

    fun convertTypes(){

        var num1 : Int = 5
        var num3 : Int = 10
        var strNumero : String  = "19"

        num1 = strNumero.toInt()
        strNumero = num1.toString()

        var num2 : Float? = 12.5f

        num2 = num1.toFloat()
    }

}