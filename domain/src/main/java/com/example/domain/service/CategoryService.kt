package com.example.domain.service

import com.example.domain.repository.CategoryRepository

class CategoryService(private val categoryRepository: CategoryRepository) {
    fun getCategories()= categoryRepository.getCategories()
}