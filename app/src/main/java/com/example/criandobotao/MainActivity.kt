package com.example.criandobotao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    lateinit var botao1: Button
    lateinit var botaores: Button
    lateinit var botaoMin: Button
    lateinit var num1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao1 = findViewById(R.id.Botao)
        botaores = findViewById(R.id.buttonRes)
        botaoMin = findViewById(R.id.buttonMin)
        num1 = findViewById(R.id.Numero)

        var Numeracao: Int = 0

        botao1.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                val i = Numeracao + 1
                Numeracao = i

                num1.text = Numeracao.toString()

            }

        } )

        botaores.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Numeracao = 0
                num1.text = Numeracao.toString()
            }
        })

        botaoMin.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                val i = Numeracao - 1
                Numeracao = i

                num1.text = Numeracao.toString()

            }

        } )
    }
}