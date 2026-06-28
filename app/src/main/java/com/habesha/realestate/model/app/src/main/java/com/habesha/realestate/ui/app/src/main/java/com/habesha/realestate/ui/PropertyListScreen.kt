package com.habesha.realestate.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.habesha.realestate.model.Property

@Composable
fun PropertyListScreen(properties: List<Property>) {
    LazyColumn {
        items(properties) { property ->
            Text(text = property.title)
        }
    }
}
