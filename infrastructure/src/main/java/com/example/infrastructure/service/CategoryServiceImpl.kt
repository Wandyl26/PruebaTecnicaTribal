package com.example.infrastructure.service

import com.example.domain.exception.CategoryResponse
import com.example.domain.repository.CategoryRepository
import com.example.infrastructure.api.CategoryApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CategoryServiceImpl @Inject constructor(private val categoryApi: CategoryApi) : CategoryRepository {
    override fun getCategories(): Flow<List<String>> =
        flow {
            emit(categoryApi.getCategories())
        }.catch {
            it.printStackTrace()
            throw CategoryResponse("Error al obtener las categorias")
        }

}