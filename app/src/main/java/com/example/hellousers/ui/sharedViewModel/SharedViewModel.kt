package com.example.hellousers.ui.sharedViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hellousers.data.model.User


class SharedViewModel(application: Application) : AndroidViewModel(application) {

//   private val mService: RetrofitServices = Common.retrofitService
    private var usersData: MutableLiveData<MutableList<User>>  = MutableLiveData()
    //TODO мб Service обьявить в MainActivity от туда подтягивать данные
    // в MainActivity отоброжать окно загрузки оформить методы Responce AND GetUsersList
    // прошарить адекватно ли common наградить методами забирать
    // данные чтоб View Model не знала про сервер и работу с ним
    fun setUsersData(item: MutableList<User>?) {
        usersData!!.value = item

    }

    fun getUsersData(): LiveData<MutableList<User>?>? {
        return usersData
    }

//val usersList: MutableList<User> = usersData
}