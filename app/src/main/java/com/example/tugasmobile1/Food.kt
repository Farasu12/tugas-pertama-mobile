package com.example.tugasmobile1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Food(
    val name : String,
    val description : String,
    val photo : Int
) : Parcelable
