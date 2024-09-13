package com.example.aulaapi.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitHelper {
    //criar a função que vai retornar a instancia do retrofit para fazer as requisições http
    companion object{
        val retrofit: Unit = Unit
        val retofit = Retrofit.Builder().baseUrl("https://viacep.com.br")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
}