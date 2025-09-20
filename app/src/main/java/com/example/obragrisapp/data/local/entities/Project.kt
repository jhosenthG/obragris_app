package com.example.obragrisapp.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("project")
data class Project(
    @PrimaryKey(autoGenerate = false) @ColumnInfo("project_id") val id: Int,
    @ColumnInfo("user_id") val userId: Int,
    @ColumnInfo("name") val name: String,
    @ColumnInfo("location") val location: String,
    @ColumnInfo("description") val description: String,
    @ColumnInfo("start_date") val startDate: Long,
    @ColumnInfo("end_date") val endDate: Long
)