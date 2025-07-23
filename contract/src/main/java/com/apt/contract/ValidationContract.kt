package com.apt.contract

import com.apt.model.Task

interface ValidationContract {
    suspend fun isTitleValid(title: String): Result<Boolean>
    suspend fun isDescriptionValid(description: String): Result<Boolean>
}