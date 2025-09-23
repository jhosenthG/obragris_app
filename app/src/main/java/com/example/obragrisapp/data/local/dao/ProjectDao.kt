package com.example.obragrisapp.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import com.example.obragrisapp.data.local.entities.Project
import com.example.obragrisapp.data.local.entities.ProjectForUser

@Dao
interface ProjectDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertProject(project: Project)

    @Update
    fun updateProject(project: Project)

    @Delete
    fun deleteProject(project: Project)

    @Query("SELECT * FROM project")
    fun loadAllProject(): Array<Project>

    @Query("SELECT * FROM project WHERE project_id = :id")
    fun loadIdProject(id: Int): Project

    @Transaction
    @Query("SELECT * FROM User")
    fun getProjectForUser(): List<ProjectForUser>
}