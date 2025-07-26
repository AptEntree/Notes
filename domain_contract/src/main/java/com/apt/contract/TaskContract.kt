package com.apt.contract

import com.apt.core.model.Response
import com.apt.model.Task
import kotlinx.coroutines.flow.Flow

interface TaskContract {
    suspend fun getTasks(): Flow<Response<List<Task>>>
    suspend fun addTask(task: Task): Flow<Response<Boolean>>
    suspend fun updateTask(task: Task): Flow<Response<Boolean>>
    suspend fun deleteTask(id: Int): Flow<Response<Boolean>>
}