package com.apt.contract

import com.apt.model.Task

interface SearchContract {
    suspend fun searchTaskById(id: Int): Result<Task?>
    suspend fun searchTaskByPriority(id: Int): Result<List<Task?>>
    suspend fun searchTaskByStatus(id: Int): Result<List<Task?>>
    suspend fun searchTaskByTitle(title: String): Result<List<Task?>>
}