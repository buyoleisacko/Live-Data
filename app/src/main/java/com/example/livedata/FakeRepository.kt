package com.example.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.random.Random

object FakeRepository {
    private val fruitNames: List<String> = listOf(
        "Apple",
        "Bananas",
        "Orange",
        "Kiwi",
        "Grapes",
        "Fig",
        "Pear",
        "StrawBerry",
        "Gooseberry",
        "Raspberry"
    )
    private val _currentRandomFruitName = MutableLiveData<String>()
    val currentRandomFruitName: LiveData<String>
        get() = _currentRandomFruitName

    init {
        _currentRandomFruitName.value = fruitNames.first()
    }
    fun getRandomFruitName():String{
        val random = Random()
        return fruitNames[random.nextInt(fruitNames.size)]
    }
    fun changeCurrentRandomFruitName(){
        _currentRandomFruitName.value = getRandomFruitName()
    }
}