package com.apt.domain.task

import com.apt.contract.TaskContract
import com.apt.core.model.Response
import com.apt.model.Task
import kotlinx.coroutines.flow.Flow

class TaskContractImpl: TaskContract {

    override suspend fun getTasks(): Flow<Response<List<Task>>> {
        TODO()
    }

    override suspend fun addTask(task: Task): Flow<Response<Boolean>> {
        TODO()
    }

    override suspend fun updateTask(task: Task): Flow<Response<Boolean>> {
        TODO()
    }

    override suspend fun deleteTask(id: Int): Flow<Response<Boolean>> {
        TODO()
    }
}