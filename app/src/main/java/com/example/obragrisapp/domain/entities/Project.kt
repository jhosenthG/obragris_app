package com.example.obragrisapp.domain.entities

import java.time.LocalDate

data class Project(
    val id: Int,
    val userId: Int,
    val name: String,
    val location: String,
    val description: String,
    val startDate: LocalDate,
    val endDate: LocalDate
)