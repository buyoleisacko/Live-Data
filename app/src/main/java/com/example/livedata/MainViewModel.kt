package com.example.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val currentRandomFruitName: LiveData<String>
        get() = FakeRepository.currentRandomFruitName
    fun onChangeRandomFruitClick() = FakeRepository.getRandomFruitName()
}