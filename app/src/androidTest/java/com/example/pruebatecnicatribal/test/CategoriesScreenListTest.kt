package com.example.pruebatecnicatribal.test

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.example.pruebatecnicatribal.view.MainActivity
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
class CategoriesScreenListTest {
    @get:Rule(order = 1)
    val hiltRule = HiltAndroidRule(this)
    @get:Rule(order = 2)
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Before
    fun setUp() {
        hiltRule.inject()

    }


    @Test
    fun testListCategoriesScreen()= runTest {

        composeTestRule.waitForIdle()
        Thread.sleep(1000)
        listOf(
            "animal", "career", "celebrity", "dev", "explicit",
            "food", "history", "money", "movie", "music",
            "political", "religion", "science", "sport", "travel"
        ).forEach { category ->
            composeTestRule.onNodeWithText(category).assertIsDisplayed()
        }


    }
}