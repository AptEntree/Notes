package com.apt.contract

import com.apt.core.model.Response
import kotlinx.coroutines.flow.Flow

interface ValidationContract {
    suspend fun isTitleValid(title: String): Flow<Response<Boolean>>
    suspend fun isDescriptionValid(description: String): Flow<Response<Boolean>>
}