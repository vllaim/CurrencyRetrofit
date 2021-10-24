package com.kamaeft.currencyretrofit.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kamaeft.currencyretrofit.data.repository.Repository
import com.kamaeft.currencyretrofit.model.nal.Nalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel : ViewModel(){

    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Nalichka>> = MutableLiveData()


    fun getNalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repo.getNal()

        }
    }


}