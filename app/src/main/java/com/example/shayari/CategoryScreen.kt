package com.example.shayari

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.shayari.routing.RoutingItem
import com.example.shayari.ui.theme.primaryColor
import com.example.shayari.ui.theme.primaryLight

@Composable
fun CategoryScreen(modifier: Modifier = Modifier,
                   navHostController: NavController
) {
    Box(
        modifier = modifier
            .background(color = primaryColor)
            .padding(top = 16.dp)
            .fillMaxSize()
            .background(color = primaryColor)
    ) {
        Column {
            MainToolBar(title = "Categories", onBackClick = {
                navHostController.popBackStack()
            })

            LazyColumn {
                items(getList().size) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .padding(top = 16.dp)
                            .clickable {
                                navHostController.navigate(RoutingItem.ListScreen.route+"/${getList()[it].title}")
                            },
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = primaryLight
                        )
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = getList()[it].title.toString(),
                                modifier = Modifier.padding(12.dp),
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}