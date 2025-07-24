package com.apt.contract

import com.apt.core.model.Response
import com.apt.model.Task

interface TaskContract {
    suspend fun getTasks(): Response<List<Task>>
    suspend fun addTask(task: Task): Response<Boolean>
    suspend fun updateTask(task: Task): Response<Boolean>
    suspend fun deleteTask(id: Int): Response<Boolean>
}