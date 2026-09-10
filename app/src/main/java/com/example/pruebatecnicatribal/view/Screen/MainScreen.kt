package com.example.pruebatecnicatribal.view.Screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.pruebatecnicatribal.ViewModel.CategoryViewModel

@Composable
fun ListScreen(
    viewModel: CategoryViewModel= hiltViewModel()
) {
    val categories by viewModel.categories.collectAsState()


    viewModel.getCategories()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 30.dp)
    ) {
        item {
            Text(
                text = "Mi Lista de Categorias",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(vertical = 30.dp)
            )
            VerticalDivider()
        }

        items(categories?: emptyList()) { item ->
            Text(
                text = item,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 12.dp)
            )
            VerticalDivider()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListScreenPreview() {
    MaterialTheme {
        ListScreen()
    }
}
