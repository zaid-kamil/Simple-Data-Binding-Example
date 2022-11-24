package com.digipod.databindingexample

import androidx.lifecycle.ViewModel

class FirstViewModel: ViewModel() {

    init {
        random4DigitNumber()
    }

    private lateinit var _number :String
    val number :String
        get() = _number

    private fun random4DigitNumber(){
        _number =  (1000..9999).random().toString()
    }

}