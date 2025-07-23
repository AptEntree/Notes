package com.apt.contract

import com.apt.model.Task

interface TaskContract {
    suspend fun getTasks(): Result<List<Task>>
    suspend fun addTask(task: Task): Result<Boolean>
    suspend fun updateTask(task: Task): Result<Boolean>
    suspend fun deleteTask(id: Int): Result<Boolean>
}