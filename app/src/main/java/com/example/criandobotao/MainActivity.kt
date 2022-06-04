package com.example.criandobotao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var botaores: Button
    lateinit var plus: Button
    lateinit var minus: Button
    lateinit var mult: Button
    lateinit var div: Button
    lateinit var num1: TextView
    lateinit var ent1: TextView
    lateinit var ent2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botaores = findViewById(R.id.buttonRes)
        num1 = findViewById(R.id.Numero)
        ent1 = findViewById(R.id.ent1)
        ent2 = findViewById(R.id.ent2)

        plus = findViewById(R.id.plus)
        minus = findViewById(R.id.minus)
        div = findViewById(R.id.div)
        mult = findViewById(R.id.mult)

        var Entrada1: Int = 0
        var Entrada2: Int = 0
        var Numeracao: Int = 0

        plus.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {

                Entrada1 = ent1.text.toString().toInt()
                Entrada2 = ent2.text.toString().toInt()

                val i = Entrada1 + Entrada2
                Numeracao = i
                num1.text = Numeracao.toString()

            }

        } )

        minus.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {

                Entrada1 = ent1.text.toString().toInt()
                Entrada2 = ent2.text.toString().toInt()

                val i = Entrada1 - Entrada2
                Numeracao = i
                num1.text = Numeracao.toString()

            }

        } )

        mult.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {

                Entrada1 = ent1.text.toString().toInt()
                Entrada2 = ent2.text.toString().toInt()

                val i = Entrada1 * Entrada2
                Numeracao = i
                num1.text = Numeracao.toString()

            }

        } )

        div.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {

                Entrada1 = ent1.text.toString().toInt()
                Entrada2 = ent2.text.toString().toInt()

                val i = Entrada1 / Entrada2
                Numeracao = i
                num1.text = Numeracao.toString()

            }

        } )

        botaores.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Entrada1 = 0
                Entrada2 = 0
                Numeracao = 0
                num1.text = Numeracao.toString()
                ent1.text = Entrada1.toString()
                ent2.text = Entrada2.toString()
            }
        })


    }
}