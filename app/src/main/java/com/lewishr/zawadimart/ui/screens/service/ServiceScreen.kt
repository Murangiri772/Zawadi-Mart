package com.lewishr.zawadimart.ui.screens.service

import android.content.Intent
import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lewishr.zawadimart.R
import com.lewishr.zawadimart.ui.theme.newgrey
import com.lewishr.zawadimart.ui.theme.newyellow
import com.navigatins.ROUT_HOME
import com.navigatins.ROUT_INTENTS
import com.navigatins.ROUT_ITEM

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ServiceScreen(navController: NavController){
    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Service") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = newgrey,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        },

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
                    icon = { Icon(Icons.Default.ShoppingCart, contentDescription = "Favorites") },
                    label = { Text("Products") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                         navController.navigate(ROUT_ITEM)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Info, contentDescription = "Profile") },
                    label = { Text("Items") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                          navController.navigate(ROUT_INTENTS)
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
                var mContext = LocalContext.current


            //Main Contents of the page
                Spacer(modifier = Modifier.height(20.dp))
                //SearchBar
                var search by remember { mutableStateOf("") }
                OutlinedTextField(
                    value = search,
                    onValueChange = { search = it },
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                    leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") },
                    placeholder = { Text("search here......") }
                )


                //End Of SearchBar


                Spacer(modifier = Modifier.height(20.dp))
                Image(
                    painter = painterResource(R.drawable.leo),
                    contentDescription = "bag",
                    modifier = Modifier.fillMaxWidth().height(200.dp),
                    contentScale = ContentScale.FillWidth


                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Services Available",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.height(20.dp))
                //Row
                Row(
                    modifier = Modifier.padding(start = 20.dp)
                ) {

                    Image(
                        painter = painterResource(R.drawable.leo),
                        contentDescription = "home",
                        modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.FillWidth
                    )
                    Spacer(modifier = Modifier.width(20.dp))

                    Column {
                        Text(
                            text = "Men's T-Shirt",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold



                        )
                        Text(
                            text = "Casual Wear",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.ExtraBold

                        )
                        Text(
                            text = "Ksh.2000",
                            fontSize = 15.sp,
                            textDecoration = TextDecoration.LineThrough

                        )
                        Text(
                            text = "Price : Ksh.1900",
                            fontSize = 15.sp,


                            )
                        Row {
                            Icon(imageVector = Icons.Default.Star, contentDescription = "", tint =  Color.Magenta)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "", tint =  Color.Magenta)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "", tint =  Color.Magenta)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "", tint =  Color.Magenta)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "", tint =  Color.Magenta)
                        }
                        Button(
                            onClick = {
                                val callIntent= Intent(Intent.ACTION_DIAL)
                                callIntent.data="tel:0716959730".toUri()

                                mContext.startActivity(callIntent)
                            },
                            colors = ButtonDefaults.buttonColors(Color.DarkGray),
                            shape = RoundedCornerShape(size = 10.dp)
                        ) {
                            Text(
                                text = "Contact Us",
                                color = Color.Green
                            )
                        }





                    }


                }
                //End of row












            }
        }
    )
    //End of Scaffold

}



@Preview(showBackground = true)
@Composable
fun ServiceScreenPreview(){
    ServiceScreen(rememberNavController())

}