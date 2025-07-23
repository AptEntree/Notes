package com.apt.contract

import com.apt.core.model.Response
import com.apt.model.Task

interface FavoriteContract {
    suspend fun getAllFavorites(): Response<List<Task?>>
    suspend fun addFavorite(task: Task): Response<Boolean>
    suspend fun removeFavorite(task: Task): Response<Boolean>
}