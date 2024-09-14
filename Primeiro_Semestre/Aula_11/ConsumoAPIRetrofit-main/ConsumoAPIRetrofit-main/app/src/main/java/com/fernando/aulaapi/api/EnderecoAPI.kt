package com.fernando.aulaapi.api

import com.fernando.aulaapi.model.Endereco
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoAPI {
    //Confg EndPoint
    @GET("ws/{cep}/json/")
    suspend fun recuperarEndereco(@Path("cep") cep:String) : Response<Endereco>
}