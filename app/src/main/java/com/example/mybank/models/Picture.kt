package com.example.mybank.models

import com.example.mybank.R
import java.io.Serializable

class Picture(
    val imageView: Int,
    var checkButton: Boolean
) : Serializable {

    companion object {
        val viewPagerList = mutableListOf(
            Picture(R.drawable.one, true),
            Picture(R.drawable.two, true),
            Picture(R.drawable.three, false)
        )
    }
}