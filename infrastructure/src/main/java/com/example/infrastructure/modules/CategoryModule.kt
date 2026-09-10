package com.example.infrastructure.modules

import com.example.domain.repository.CategoryRepository
import com.example.domain.service.CategoryService
import com.example.infrastructure.api.CategoryApi
import com.example.infrastructure.service.CategoryServiceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CategoryModule {
    @Provides
    fun provideCategoryService(categoryRepository: CategoryRepository): CategoryService= CategoryService(categoryRepository)

    @Provides
    fun provideCategoryRepository(category: CategoryApi): CategoryRepository = CategoryServiceImpl(category)

    @Provides
    @Singleton
    fun provideCategoryApi(retrofit: Retrofit): CategoryApi = retrofit.create(CategoryApi::class.java)
}