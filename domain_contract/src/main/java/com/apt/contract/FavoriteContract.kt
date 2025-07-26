package com.apt.contract

import com.apt.core.model.Response
import com.apt.model.Task
import kotlinx.coroutines.flow.Flow

interface FavoriteContract {
    suspend fun getAllFavorites(): Flow<Response<List<Task?>>>
    suspend fun addFavorite(task: Task): Flow<Response<Boolean>>
    suspend fun removeFavorite(task: Task): Flow<Response<Boolean>>
}