package com.sergiocrespotoubes.kotlincourse

import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * Created by Sergio Crespo Toubes on 09/12/2017.
 *     SergioCrespoToubes@gmail.com
 *     www.SergioCrespoToubes.com
 */
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        supportActionBar!!.setDisplayShowHomeEnabled(true)

        val bundle = intent.extras
        tv_age.text =  "La edad es de ${bundle.getInt("age")}"

        loadListeners()
    }

    private fun loadListeners() {
        bt_web!!.onClick {
            browse("http:\\www.marca.com")
        }

        bt_email!!.onClick {
            email("email@yopmail.com", "Subject", "Email description")
        }

        bt_call!!.onClick {
            makeCall("666666666")
        }

        bt_share!!.onClick {
            share("Anko description", "Share title")
        }

        doFromSdk(Build.VERSION_CODES.O){
            toast("Movil superior o igual a Marshmallow")
        }
        doIfSdk(Build.VERSION_CODES.O){
            toast("Movil anterior a Oreo")
        }

        bt_country.onClick {
            val countries = listOf("ESP", "UK", "US", "POR", "FRA")
            selector("Where are you from?", countries,{
                dialogInterface, i ->
                    longToast("${countries[i]} its awesome")
            })
        }

        bt_loading.onClick {
            val dialog = progressDialog(message = "Loading data...", title = "LOADING")
        }

        bt_exit.onClick {
            alert ("Are you sure to exit?", "ALERT"){
                yesButton { finish() }
                noButton { toast(":D") }
            }.show()
        }

    }

}