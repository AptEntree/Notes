package com.apt.contract

import com.apt.model.TaskDTO

interface TaskRepository {
    fun getTasks(): List<TaskDTO>
}