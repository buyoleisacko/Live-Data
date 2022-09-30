package com.example.livedata

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val currentRandomFruitName: LiveData<String>
        get() = FakeRepository.currentRandomFruitName
    fun onChangeRandomFruitClick() = FakeRepository.getRandomFruitName()

    @Bindable
    val editTextContent = MutableLiveData<String>()
}