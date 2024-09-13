package com.example.aulaapi

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.aulaapi.api.EnderecoAPI
import com.example.aulaapi.api.RetrofitHelper
import com.example.aulaapi.model.Endereco
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private val retrofit by lazy {
        RetrofitHelper.retrofit
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn_Enviar: Button = findViewById(R.id.btn_enviar)
        btn_Enviar.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                recuperarDados()
            }
        }
    }

    // criar a função que vai fazer a requisição http
    private suspend fun recuperarDados() {
        var retorno: Response<Endereco>? = null
        val cepDigitadoUsuario = "0134895"

        try {
            val enderecoAPI = retrofit.create(EnderecoAPI::class.java)
            retorno = enderecoAPI.recuperarEndereco(cepDigitadoUsuario)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        if (retorno != null) {
            if (retorno.isSuccessful) {
                var endereco = retorno.body()
                var cep = endereco?.cep
                var logradouro = endereco?.logradouro
                var complemento = endereco?.complemento
                var bairro = endereco?.bairro
                var localidade = endereco?.localidade
                var uf = endereco?.uf
                var ibge = endereco?.ibge
                var gia = endereco?.gia
                var ddd = endereco?.ddd
                var siafi = endereco?.siafi

                Log.i("teste", "CEP: $cep")
            }
        }
    }
}