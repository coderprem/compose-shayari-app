package com.example.shayari

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.shayari.routing.RoutingItem
import com.example.shayari.ui.theme.primaryColor

@Composable
fun ListScreen(
    navHostController: NavHostController,
    title: String
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = primaryColor)
            .padding(top = 16.dp)
    ) {
        MainToolBar(title = title, onBackClick = {
            navHostController.popBackStack()
        })

        val filteredList = getList().filter { it.title == title }

        LazyColumn(
            modifier = Modifier.padding(bottom = 18.dp)
        ) {
            items(filteredList.size) { index ->
                val shayariModel = filteredList[index]
                shayariModel.list?.let { shayariList ->
                    // Display the list of shayaris
                    shayariList.forEach { shayari ->
                        Card(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(horizontal = 16.dp)
                                .padding(top = 16.dp)
                                .clickable{
                                    // Navigate to the detail screen
                                          navHostController.navigate(RoutingItem.DetailScreen.route+"/${shayari}")
                                },

                        ) {
                            Text(
                                text = shayari,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(16.dp),
                                color = Color.Black
                            )
                        }
                    }
                }
            }
        }
    }
}
