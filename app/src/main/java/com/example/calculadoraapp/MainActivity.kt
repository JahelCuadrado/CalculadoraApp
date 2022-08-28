package com.example.calculadoraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    lateinit var st_resultado : String
    lateinit var tv_resultado : TextView
    lateinit var numeros : ArrayList<Int>
    lateinit var operadores : ArrayList<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        st_resultado = "0"
        tv_resultado = findViewById(R.id.resultado)
    }

    fun calculadora(view: View){

            st_resultado += when(view.tag){
                    "bt_1" ->  "1"
                    "bt_2" ->  "2"
                    "bt_3" ->  "3"
                    "bt_4" ->  "4"
                    "bt_5" ->  "5"
                    "bt_6" ->  "6"
                    "bt_7" ->  "7"
                    "bt_8" ->  "8"
                    "bt_9" ->  "9"
                    "bt_0" ->  "0"
            else -> {

                numeros.add(st_resultado.toInt())

                when(view.tag){
                    "dividir"      -> "/"
                    "multiplicar"  ->  "*"
                    "sumar"        ->  "+"
                    "restar"       ->  "-"
                    "punto"        ->  "."
                    "parent_left"  ->  "("
                    "parent_rigth" ->  ")"
                    "bt_c" -> st_resultado = ""
                    else -> {

                    }
                }
            }
        }

        tv_resultado.text = st_resultado

    }
}