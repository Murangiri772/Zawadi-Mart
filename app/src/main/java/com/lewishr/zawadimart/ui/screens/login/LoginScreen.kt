package com.lewishr.zawadimart.ui.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lewishr.zawadimart.R
import com.lewishr.zawadimart.ui.theme.newblue

@Composable
fun LoginScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize().background(newblue),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(R.drawable.ab),
            contentDescription = "",

            modifier = Modifier.size(100.dp)



        )

    }

}



@Preview(showBackground = true)
@Composable
fun loginScreenPreview(){
    LoginScreen(rememberNavController())

}