package com.example.obragrisapp.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.obragrisapp.data.local.dao.ProjectDao
import com.example.obragrisapp.data.local.dao.UserDao
import com.example.obragrisapp.data.local.entities.Project
import com.example.obragrisapp.data.local.entities.User

@Database(
    entities = [
        Project::class,
        User::class
               ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun projectdao(): ProjectDao
    abstract fun userdao(): UserDao
}