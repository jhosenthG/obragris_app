package com.example.obragrisapp.domain.entities

import androidx.compose.material3.FabPosition

data class User(
    val id: Int,
    val name: String,
    val lastName: String,
    val mail: String,
    val phoneNumber: Int,
    val position: String,
    val admin: Boolean,
    val premium: Boolean
)
