package com.example.hellousers.ui.notifications

import android.app.Activity
import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hellousers.R


class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {

        value = "Тестовое задание для Rentateam"
    }
    val text: LiveData<String> = _text
}