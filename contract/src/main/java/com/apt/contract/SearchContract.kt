package com.apt.contract

import com.apt.core.model.Response
import com.apt.model.Task

interface SearchContract {
    suspend fun searchTaskById(id: Int): Response<Task?>
    suspend fun searchTaskByPriority(id: Int): Response<List<Task?>>
    suspend fun searchTaskByStatus(id: Int): Response<List<Task?>>
    suspend fun searchTaskByTitle(title: String): Response<List<Task?>>
}