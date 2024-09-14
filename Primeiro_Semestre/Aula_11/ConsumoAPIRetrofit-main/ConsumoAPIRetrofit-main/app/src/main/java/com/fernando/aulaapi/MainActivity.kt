package com.fernando.aulaapi

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fernando.aulaapi.api.EnderecoAPI
import com.fernando.aulaapi.api.RetrofitHelper
import com.fernando.aulaapi.model.Endereco
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    val retrofit by lazy{
        RetrofitHelper.retrofit
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btnEnviar:Button = findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener{
            CoroutineScope(Dispatchers.IO).launch {
                recuperarEndereco()
            }
        }
    }
    private suspend fun recuperarEndereco(){
        var retorno:Response<Endereco>? = null
        var cepDigitadoUsuario = "01507020"
        try {
            val enderecoAPI = retrofit.create(EnderecoAPI::class.java)
            retorno = enderecoAPI.recuperarEndereco(cepDigitadoUsuario)
        }catch (e:Exception){
            e.printStackTrace()
        }

        if(retorno!=null){
            if(retorno.isSuccessful){
                var endereco = retorno.body()
                var rua = endereco?.logradouro
                Log.i("teste","RUA:${rua}")
            }
        }
    }

}