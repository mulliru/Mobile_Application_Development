package com.murillo.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Criando uma referência para os elementos do arquivo de layout activity_main.xml
        val primeiroNumero: TextInputEditText = findViewById(R.id.editPrimeiroNum)
        val segundoNumero: TextInputEditText = findViewById(R.id.editSegundoNum)
        val btnSomar: Button = findViewById(R.id.btn_somar)
        val txtResultado: TextView = findViewById(R.id.txtResultado)
        var imgCalc: ImageView = findViewById(R.id.imgCalc)

        // Adicionando um listener ao botão de soma
        btnSomar.setOnClickListener {
            val num1 = primeiroNumero.text.toString().toInt()
            val num2 = segundoNumero.text.toString().toInt()
            val resultado = num1 + num2
            // Exibindo o resultado da soma no TextView txtResultado
            txtResultado.text = "Resultado da soma: $resultado"
        }

            // Mostrando uma mensagem ao clicar na imagem
            imgCalc.setOnClickListener {
                txtResultado.text = "Cliquei na imagem!"
            }
        }
    }
