package com.emre.kotlingclassesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sum(5, 6)
        println(multiply(5, 7)) // return sonucunu parantez içine verir
    }

    fun test() { // Fonksiyon oluşturma

    }

    fun sum(a : Int, b : Int) { // Unit fonksiyon -> geri dönüt vermeyen foksiyonlar (void)
        println(a + b)
    }

    fun multiply(x : Int, y : Int) : Int {
        return x * y
    }
}