package com.lewishr.zawadimart.ui.screens.start


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lewishr.zawadimart.R
import com.lewishr.zawadimart.ui.theme.neworange
import com.navigatins.ROUT_ITEM
import com.navigatins.ROUT_START

@Composable
fun StartScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "ZawadiMart",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = neworange

        )
        Spacer(modifier = Modifier.height(20.dp))
        //Circuler Image
        Image(
            painter = painterResource(R.drawable.og),
            contentDescription = "home",
            alignment = Alignment.Center,
            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )



            //end
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Find You Order",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = neworange
        )


        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Discover Getty Images' unrivaled collection of royalty-free images to find the perfect stock photo, vector, or illustration that resonates with your ...",
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                navController.navigate(ROUT_ITEM)
            },
            colors = ButtonDefaults.buttonColors(Color.Green),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)





            ) {
            Text(text = "Get started")


        }



    }

}



@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen(rememberNavController())

}