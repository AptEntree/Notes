package com.apt.contract

import com.apt.core.model.Response
import com.apt.model.Task
import kotlinx.coroutines.flow.Flow

interface SearchContract {
    suspend fun searchTaskById(id: Int): Flow<Response<Task?>>
    suspend fun searchTaskByPriority(id: Int): Flow<Response<List<Task?>>>
    suspend fun searchTaskByStatus(id: Int): Flow<Response<List<Task?>>>
    suspend fun searchTaskByTitle(title: String): Flow<Response<List<Task?>>>
}