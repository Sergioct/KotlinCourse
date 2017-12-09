package com.sergiocrespotoubes.kotlincourse

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import java.io.FileReader
import java.io.FileWriter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variables()
        convertTypes()
        expressions()
        Log.i("TEST", "Suma: 5+7 = ${sum(5, 7)}")
        var user = User("Sergio", 28, 1.80, 73.0)
        var user2 = User()

        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setIcon(R.mipmap.ic_launcher)
        toast("Toast con Anko")

        bt_next.onClick {
            startActivity<SecondActivity>("age" to user.age)
        }

    }

    fun variables(){

        var nombre : String = "Sergio"
        val EDAD : Int = 27
        var ciudad : String = "Madrid"

        Log.i("TEST", "Test $ciudad")
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

    fun expressions(){

        val nombre = "Sergio"
        val nombre2 = "Sergio"

        if(nombre == nombre2){
            Log.i("TEST", "Son iguales")
        }else{
            Log.i("TEST", "No son iguales")
        }

        val x = 5
        when(x){
            1 -> {
                Log.i("TEST", "Result 1")
            }
            3 -> {
                Log.i("TEST", "Result 3")
            }
            5 -> {
                Log.i("TEST", "Result 5")
            }
            2, 4, 6 -> {
                Log.i("TEST", "Result pair")
            }
            in 9..10 -> {
                Log.i("TEST", "Excellent")
            }
            else -> Log.i("TEST", "Other")
        }

        Log.i("TEST", "0..10")
        for (elemento in 0..10){
            Log.i("TEST", "Valor $elemento")
        }

        Log.i("TEST", "DOWN_TO")
        for(elemento in 15 downTo 1){
            Log.i("TEST", "Valor $elemento")
        }

        Log.i("TEST", "UNTIL")
        for(elemento in 1 until 15){
            Log.i("TEST", "Valor $elemento")
        }

        val array = Array<Int>(5){0}
        array[1] = 5
        array[2] = 12
        array[3] = -2
        array[4] = 6

        for(i in 0..array.size - 1){
            Log.i("TEST", "Valor ${array[i]}")
        }

        /* Array List */

        val lista = ArrayList<String>()
        lista.add("Objeto 1")
        lista.add("Objeto 2")
        lista.add("Objeto 3")

        for (obj in lista){
            Log.i("TEST", "ArrayList: $obj")
        }

        for (i in 0..lista.size - 1){
            Log.i("TEST", "ArrayList: ${lista[i]}")
        }

        /* HashMap */

        val nameHash = HashMap<Int, String>()

        nameHash.put(0, "Sergio")
        nameHash.put(1, "David")
        nameHash.put(2, "Salva")

        for (obj in nameHash.keys){

        }
        Log.i("TEST", "Hash: ${nameHash[0]}")

        /* Exceptions */

        var result : Int
        try{
            result = 50 / 5
        }catch (e:Exception){
            Log.e("TEST", "${e.message}")
        }

        /* Write file */
        // var file = FileWriter("Prueba.txt")
        // file.write("Este es el texto para mi archivo")
        // file.close()

        /* Read file */
        //var file = FileReader("Prueba.txt")
        //var character : Int?

        //do{
        //    character = file.read()
        //    Log.e("TEST", "${character.toChar()}")
        //}while(character != -1)

    }

    fun sum(x: Int, y: Int) : Int {
        return x + y
    }

}