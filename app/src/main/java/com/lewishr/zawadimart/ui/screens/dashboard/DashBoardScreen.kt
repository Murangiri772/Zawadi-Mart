package com.lewishr.zawadimart.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lewishr.zawadimart.R
import com.lewishr.zawadimart.ui.theme.neworange
import com.lewishr.zawadimart.ui.theme.newwhite
import com.lewishr.zawadimart.ui.theme.newyellow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashBoardScreen(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize().background(newyellow)
    ){
        // BOX
        Box (){
            //CARD
            Card (
                modifier = Modifier.fillMaxWidth().height(300.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(newwhite)
            ){
                TopAppBar(
                    title = { Text(text = "DashBoard Section") },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                        }
                    },
                )


            }
            //END OF CARD
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .padding(start = 20.dp, end = 20.dp)
                    .offset(y = 90.dp)
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center


                ){
                    Text(
                        text = "Welcom to ZawadiMart",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = neworange,
                    )
                }








            }





        }
        //END OF BOX

        //ROW
        Spacer(modifier = Modifier.height(100.dp))
        Row (
            modifier = Modifier.padding(20.dp)
        ){
            //Card1
            Card (
                modifier = Modifier.width(150.dp).height(180.dp)
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center


                ){
                    Image(
                        painter = painterResource(R.drawable.hm),
                        contentDescription = "home",
                        alignment = Alignment.Center,
                        modifier = Modifier.fillMaxWidth(),
                    )

                    Text(text = "Home", fontSize = 15.sp)
                }

            }
            //card1
            Spacer(modifier = Modifier.width(20.dp))
            //Card2
            Card (
                modifier = Modifier.width(150.dp).height(180.dp)
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center


                ){
                    Image(
                        painter = painterResource(R.drawable.ab),
                        contentDescription = "home",
                        alignment = Alignment.Center,
                        modifier = Modifier.fillMaxWidth(),
                    )

                    Text(text = "About", fontSize = 15.sp)
                }

            }
            //card2
        }
        //ROW2
        Row (
            modifier = Modifier.padding(20.dp)

        ){
            //Card3
            Card (
                modifier = Modifier.width(150.dp).height(180.dp)
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center


                ){
                    Image(
                        painter = painterResource(R.drawable.st),
                        contentDescription = "home",
                        alignment = Alignment.Center,
                        modifier = Modifier.fillMaxWidth(),
                    )

                    Text(text = "Start", fontSize = 15.sp)
                }

            }
            //card3
            Spacer(modifier = Modifier.width(20.dp))
            //Card4
            Card (
                modifier = Modifier.width(150.dp).height(180.dp)
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center


                ){
                    Image(
                        painter = painterResource(R.drawable.it),
                        contentDescription = "home",
                        alignment = Alignment.Center,
                        modifier = Modifier.fillMaxWidth(),
                    )

                    Text(text = "Items", fontSize = 15.sp)
                }

            }
            //card4

        }
        //END OF ROW2





    }




        //END OF ROW




}





@Preview(showBackground = true)
@Composable
fun DashBoardScreenPreview(){
    DashBoardScreen(rememberNavController())

}