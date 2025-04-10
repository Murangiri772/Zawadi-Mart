package com.lewishr.zawadimart.ui.screens.Hammalia

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lewishr.zawadimart.R
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
        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = newyellow

            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
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
                    Text(text = "Here are your project")
                    Spacer(modifier = Modifier.height(20.dp))
                    Spacer(modifier = Modifier.height(100.dp))
                    Row (
                        modifier = Modifier.padding(20.dp)
                    ){
                        //Card1
                        Card (
                            modifier = Modifier.width(150.dp).height(180.dp).clickable{navController.navigate(ROUT_HOME)}

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
                            modifier = Modifier.width(150.dp).height(180.dp).clickable{navController.navigate(ROUT_INTENTS)}

                        ){
                            Column (
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center


                            ){
                                Image(
                                    painter = painterResource(R.drawable.gm),
                                    contentDescription = "home",
                                    alignment = Alignment.Center,
                                    modifier = Modifier.fillMaxWidth(),
                                )

                                Text(text = "Intents", fontSize = 15.sp)
                            }

                        }
                        //card2
                        Spacer(modifier = Modifier.height(100.dp))


                            //Card1
                            Card (
                                modifier = Modifier.width(150.dp).height(180.dp).clickable{navController.navigate(ROUT_HOME)}

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
                                modifier = Modifier.width(150.dp).height(180.dp).clickable{navController.navigate(ROUT_INTENTS)}

                            ){
                                Column (
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center


                                ){
                                    Image(
                                        painter = painterResource(R.drawable.gm),
                                        contentDescription = "home",
                                        alignment = Alignment.Center,
                                        modifier = Modifier.fillMaxWidth(),
                                    )

                                    Text(text = "Intents", fontSize = 15.sp)
                                }

                            }
                            //card2

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

