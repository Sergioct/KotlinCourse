package com.sergiocrespotoubes.kotlincourse

import android.util.Log

/**
 * Created by Sergio Crespo Toubes on 08/12/2017.
 *     SergioCrespoToubes@gmail.com
 *     www.SergioCrespoToubes.com
 */
class User {

    var username : String? = null
    var age : Int? = null
    var height : Double? = null
    var weight : Double? = null

    constructor()

    constructor(username: String) {
        this.username = username
    }

    constructor(username : String, age : Int, height : Double, weight : Double){
        this.username = username
        this.age = age
        this.height = height
        this.weight = weight
    }

    init {
        this.username = username
        this.age = age
        this.height = height
        this.weight = weight
    }

    fun getName():String?{
        return this.username
    }



}