package com.example.obragrisapp.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation

@Entity("user")
data class User(
    @PrimaryKey(autoGenerate = true) @ColumnInfo("user_id") val userId: Int,
    @ColumnInfo("name") val name: String,
    @ColumnInfo("last_name") val lastName: String,
    @ColumnInfo("mail") val mail: String,
    @ColumnInfo("phone_number") val phoneNumber: Int,
    @ColumnInfo("position") val position: String,
    @ColumnInfo("administrator") val admin: Boolean,
    @ColumnInfo("subscription") val premium: Boolean
)

data class ProjectForUser(
    @Embedded val user: User, @Relation(
        parentColumn = "user_id",
        entityColumn = "user_id"
    )
    val projects: List<Project>
)