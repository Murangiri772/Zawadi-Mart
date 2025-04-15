package com.lewishr.zawadimart.ui.screens.Hammalia

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lewishr.zawadimart.R
import com.lewishr.zawadimart.ui.theme.newblue
import com.lewishr.zawadimart.ui.theme.newbrown
import com.lewishr.zawadimart.ui.theme.newgrey
import com.lewishr.zawadimart.ui.theme.newwhite
import com.lewishr.zawadimart.ui.theme.newyellow
import com.navigatins.ROUT_HOME
import com.navigatins.ROUT_INTENTS

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HammaliaScreen(navController: NavController){
    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(


        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = newgrey
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )


                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )

            }
        },



        //Contents
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {
                //CARD
                Card (
                    modifier = Modifier.fillMaxWidth().height(400.dp),

                    colors = CardDefaults.cardColors(newwhite)
                ){
                    Spacer(modifier = Modifier.height(20.dp).padding(20.dp))

                    Text(
                        text = "Hi Samantha",





                    )
                    Text(text = "Here are your project", fontWeight = FontWeight.Light)
                    Spacer(modifier = Modifier.height(20.dp))
                    Spacer(modifier = Modifier.height(100.dp))
                    Row (
                        modifier = Modifier.padding(20.dp)
                    ){
                        //Card1
                        Card (
                            modifier = Modifier.width(150.dp).height(180.dp)

                        ){
                            Column (
                                modifier = Modifier.fillMaxSize().background(newblue),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center


                            ){
                                Image(
                                    painter = painterResource(R.drawable.cy),
                                    contentDescription = "",
                                    alignment = Alignment.Center,
                                    modifier = Modifier.fillMaxWidth(),
                                )

                                Text(text = "CryptoCurrency",
                                    fontSize = 15.sp,
                                    color = newwhite)
                                Text(text = "Landing Page",
                                    fontSize = 15.sp,
                                    color = newwhite)
                            }

                        }
                        //card1
                        Spacer(modifier = Modifier.width(20.dp))
                        //Card2
                        Card (
                            modifier = Modifier.width(150.dp).height(180.dp)

                        ){
                            Column (
                                modifier = Modifier.fillMaxSize().background(newbrown),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center


                            ){
                                Image(
                                    painter = painterResource(R.drawable.std),
                                    contentDescription = "",
                                    alignment = Alignment.Center,
                                    modifier = Modifier.fillMaxWidth(),
                                )

                                Text(text = "Statistics",
                                    fontSize = 15.sp,
                                    color = newwhite)
                                Text(text = "DashBoard",
                                    fontSize = 15.sp,
                                    color = newwhite
                                )
                            }

                        }
                        //card2
                        Spacer(modifier = Modifier.width(20.dp))


                            //Card1
                            Card (
                                modifier = Modifier.width(150.dp).height(180.dp)
                            ){
                                Column (
                                    modifier = Modifier.fillMaxSize().background(newgrey),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center


                                ){


                                    Text(text = "CryptoCurrency",
                                        fontSize = 15.sp,
                                        color = newwhite)
                                    Text(text = "Landing Page",
                                        fontSize = 15.sp,
                                        color = newwhite)
                                    Spacer(modifier = Modifier.height(10.dp))
                                    Row (
                                        verticalAlignment = Alignment.CenterVertically
                                    ){
                                        Image(
                                            painter = painterResource(R.drawable.ps),
                                            contentDescription = "",
                                            alignment = Alignment.Center,

                                            )
                                        Spacer(modifier = Modifier.width(20.dp))
                                        Text(
                                            text = "Samantha"
                                        )
                                        Spacer(modifier = Modifier.height(10.dp))

                                    }

                                }

                            }

                    }



                }
                Spacer(modifier = Modifier.height(20.dp))
               Column (
                   modifier = Modifier.padding(20.dp)
               ){
                   Text(text = "Personal Tasks",
                       fontWeight = FontWeight.Bold,
                       fontSize = 20.sp,
                   )
               }
                Spacer(modifier = Modifier.height(20.dp))
                Row (
                    modifier = Modifier.padding(20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ){
                    Card (
                        modifier = Modifier.fillMaxWidth().size(100.dp)
                    ){
                        Column (
                            modifier = Modifier.fillMaxWidth().padding(start = 10.dp),
                            verticalArrangement = Arrangement.Center
                        ){
                            Image(
                                painter = painterResource(R.drawable.ps),
                                contentDescription = "",
                                alignment = Alignment.Center,

                                )
                            Spacer(modifier = Modifier.width(10.dp))
                            Row (verticalAlignment = Alignment.CenterVertically){
                                Text(text = "NDA Review for website project")


                            }
                            Row (verticalAlignment = Alignment.CenterVertically){
                                Text(text = "Today _ 10pm")
                            }
                        }

                    }

                }
                Row (
                    modifier = Modifier.padding(20.dp)
                ){
                    Spacer(modifier = Modifier.height(10.dp))
                    Card (
                        modifier = Modifier.fillMaxWidth().size(100.dp)
                    ){
                        Column (
                            modifier = Modifier.fillMaxWidth().padding(start = 10.dp),
                            verticalArrangement = Arrangement.Center
                        ){
                            Image(
                                painter = painterResource(R.drawable.ps),
                                contentDescription = "",
                                alignment = Alignment.Center,

                                )
                            Spacer(modifier = Modifier.width(10.dp))
                            Row(
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Text(text = "Email Reply for Green Project ")

                            }
                            Row (verticalAlignment = Alignment.CenterVertically,

                            )
                            { Text(text = "Today _ 10pm") }

                        }

                    }

                }
















            }
        }
    )
    //End of Scaffold








}



@Preview(showBackground = true)
@Composable
fun HammaliaScreenPreview(){
    HammaliaScreen(rememberNavController())

}

