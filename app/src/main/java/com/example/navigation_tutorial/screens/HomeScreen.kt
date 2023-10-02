package com.example.navigation_tutorial.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.navigation_tutorial.navigation.Screens
import com.example.navigation_tutorial.ui.theme.Navigation_tutorialTheme

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ){
            Text(
                text = "Home Screen",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Row( modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ){
            Button(
                shape = MaterialTheme.shapes.medium,
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                modifier = Modifier.padding(5.dp),
                onClick = {
                        navController.navigate(Screens.Detail.route)
                }
            ) {
                Text(
                    text = "Go to Details",
                    modifier = Modifier.padding(5.dp),
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
        Button(
            shape = MaterialTheme.shapes.medium,
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            modifier = Modifier.padding(5.dp),
            onClick = {
                navController.popBackStack(route = Screens.Login.route, inclusive = false)
            }
        ) {
            Text(
                text = "Logout",
                modifier = Modifier.padding(5.dp),
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}

