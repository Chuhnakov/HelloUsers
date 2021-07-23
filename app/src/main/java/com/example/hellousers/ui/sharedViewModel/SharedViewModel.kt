package com.example.hellousers.ui.sharedViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hellousers.data.model.User


class SharedViewModel: ViewModel() {

//   private val mService: RetrofitServices = Common.retrofitService
    private var usersData: MutableLiveData<MutableList<User>>  = MutableLiveData()
// Service обьявить в MainActivity от туда подтягивать данные
    // в MainActivity отоброжать окно загрузки оформить методы Responce AND GetUsersList
    fun setUsersData(item: MutableList<User>?) {
        usersData!!.value = item
    }

    fun getUsersData(): LiveData<MutableList<User>?>? {
        return usersData
    }
//val usersList: MutableList<User> = usersData
}