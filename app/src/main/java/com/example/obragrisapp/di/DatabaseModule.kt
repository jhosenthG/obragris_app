package com.example.obragrisapp.di

import android.content.Context
import androidx.room.Room
import com.example.obragrisapp.data.local.dao.ProjectDao
import com.example.obragrisapp.data.local.dao.UserDao
import com.example.obragrisapp.data.local.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): AppDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            "AppDatabase.db"
        ).build()
    }

    @Provides
    fun provideProjectDao(dataModule: AppDatabase): ProjectDao = dataModule.projectdao()

    @Provides
    fun provideUserDao(dataModule: AppDatabase): UserDao = dataModule.userdao()

}