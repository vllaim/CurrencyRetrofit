package com.kamaeft.currencyretrofit.data.repository

import com.kamaeft.currencyretrofit.data.api.RetrofitInstance
import com.kamaeft.currencyretrofit.model.beznal.BezNalichka
import com.kamaeft.currencyretrofit.model.nal.Nalichka

import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<Nalichka>{
        return RetrofitInstance.api.getNalMoney()

    }
    suspend fun getBezNal(): Response<BezNalichka>{
        return RetrofitInstance.api.getBezNalMoney()
    }
}