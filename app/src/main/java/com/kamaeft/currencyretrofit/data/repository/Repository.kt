package com.kamaeft.currencyretrofit.data.repository

import com.kamaeft.currencyretrofit.data.api.RetrofitInstance
import com.kamaeft.currencyretrofit.model.beznal.BezNalichkaItem
import com.kamaeft.currencyretrofit.model.nal.NalichkaItem
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<NalichkaItem>{
        return RetrofitInstance.api.getNalMoney()

    }
    suspend fun getBezNal(): Response<BezNalichkaItem>{
        return RetrofitInstance.api.getBezNalMoney()
    }
}