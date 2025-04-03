package com.lewishr.zawadimart.ui.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.lewishr.zawadimart.R

@Composable
fun HomeScreen(){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Text(
            text = "ZawadiMart",
            fontSize = 30.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.SansSerif,
            textDecoration = TextDecoration.Underline
        )
        Text(
            text = "Welcom to my Ecommerce app",
            fontSize = 18.sp,
            fontStyle = FontStyle.Italic

        )
        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "home",
            alignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth(),
        )





        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Green),


        ) {
            Text(text = "Add to cut")

            
        }
    }


}



@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()

}