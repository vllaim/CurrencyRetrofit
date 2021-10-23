package com.kamaeft.currencyretrofit.data.api

import com.kamaeft.currencyretrofit.model.beznal.BezNalichkaItem
import com.kamaeft.currencyretrofit.model.nal.NalichkaItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoney(): Response<NalichkaItem>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBezNalMoney(): Response<BezNalichkaItem>

}