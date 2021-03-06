package com.kamaeft.currencyretrofit.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kamaeft.currencyretrofit.data.repository.Repository
import com.kamaeft.currencyretrofit.model.beznal.BezNalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel : ViewModel() {
    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<BezNalichka>> = MutableLiveData()


    fun getBezNalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repo.getBezNal()

        }
    }
}