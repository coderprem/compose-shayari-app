package com.example.shayari

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.shayari.routing.RoutingItem
import com.example.shayari.ui.theme.primaryColor
import com.example.shayari.ui.theme.purpleColor
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    modifier: Modifier = Modifier,
    navHostController : NavHostController
) {
    Surface {
        Box(
            modifier = modifier
                .fillMaxSize()
                .background(color = primaryColor),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo), contentDescription = "Logo",
                modifier = Modifier.size(100.dp)
            )
        }

        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(bottom = 16.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            CircularProgressIndicator(
                color = purpleColor,
            )
        }

        LaunchedEffect(Unit) {
            delay(1500)
            navHostController.navigate(RoutingItem.CategoryScreen.route) {
                popUpTo(navHostController.graph.startDestinationId) { inclusive = true }
            }
        }

    }
}
