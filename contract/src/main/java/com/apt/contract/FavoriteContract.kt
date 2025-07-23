package com.apt.contract

import com.apt.model.Task

interface FavoriteContract {
    suspend fun getAllFavorites(): Result<List<Task?>>
    suspend fun addFavorite(task: Task): Result<Boolean>
    suspend fun removeFavorite(task: Task): Result<Boolean>
}