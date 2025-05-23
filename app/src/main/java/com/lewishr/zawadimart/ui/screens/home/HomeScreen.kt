package com.lewishr.zawadimart.ui.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lewishr.zawadimart.R
import com.lewishr.zawadimart.ui.theme.newwhite
import com.lewishr.zawadimart.ui.theme.newyellow
import com.navigatins.ROUT_START

@Composable
fun HomeScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
            .paint(painter = painterResource(R.drawable.bc), contentScale = ContentScale.FillBounds)
    ) {





        }
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .clip(RoundedCornerShape(10.dp))
                .shadow(20.dp)

        ){
            Box (
                modifier = Modifier
                    .fillMaxHeight()
                   ,
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "ZawadiMart",
                    color = newwhite,
                    fontWeight = FontWeight.Bold,
                    fontSize = 70.sp,
                    modifier = Modifier
                        .rotate(-90f)

                )


            }
            Box (
                modifier = Modifier.fillMaxHeight().padding(start = 80.dp, end = 80.dp),
                contentAlignment = Alignment.BottomCenter

            ){
                Button(
                    onClick = {
                        navController.navigate(ROUT_START)
                    },
                    colors = ButtonDefaults.buttonColors(Color.Green),


                    ) {
                    Text(text = "Add to cut")
            }
        }






    }


}



@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())

}