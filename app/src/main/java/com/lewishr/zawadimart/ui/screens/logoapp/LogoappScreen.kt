package com.lewishr.zawadimart.ui.screens.logoapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.lewishr.zawadimart.R
import com.lewishr.zawadimart.ui.theme.newblue
import com.lewishr.zawadimart.ui.theme.newdark
import com.lewishr.zawadimart.ui.theme.newpine
import com.lewishr.zawadimart.ui.theme.newred
import com.lewishr.zawadimart.ui.theme.newrest
import com.lewishr.zawadimart.ui.theme.newyellow

@Composable
fun LoginScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize().background(newblue),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){



        Row (
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(R.drawable.ap),
                contentDescription = "",
                modifier = Modifier.size(100.dp)


                )
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Logo App", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        }
        Image(
            painter = painterResource(R.drawable.img_1),
            contentDescription = "",
            modifier = Modifier.size(200.dp)

            )
        Spacer(modifier = Modifier.height(50.dp))

        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            Card (
                modifier = Modifier.fillMaxWidth().size(600.dp)
            ){
                Column (
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Spacer(modifier = Modifier.width(30.dp))
                    Text(text = "The Most Worth",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = newred
                    )
                    Text(text = "Grocery App",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = newred
                    )
                    var username by remember { mutableStateOf("") }
                    Spacer(modifier = Modifier.height(20.dp))
                    //username
                    OutlinedTextField(
                        value = username,
                        onValueChange = {username = it},
                        modifier = Modifier.fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp),
                        leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "", tint = newrest) },
                        label = {Text(text = "Username")},
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = newpine,
                            focusedBorderColor = newyellow,
                            focusedLabelColor = newyellow,
                            unfocusedContainerColor = newdark
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                    )
                    var password by remember { mutableStateOf("") }
                    Spacer(modifier = Modifier.height(20.dp))
                    //PASSWORD
                    OutlinedTextField(
                        value = password,
                        onValueChange = {password = it},
                        modifier = Modifier.fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp),
                        leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = newrest) },
                        label = {Text(text = "Password")},
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = newpine,
                            focusedBorderColor = newyellow,
                            focusedLabelColor = newyellow,
                            unfocusedContainerColor = newdark
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                        visualTransformation = PasswordVisualTransformation()
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Button(
                        onClick = {

                        },
                        colors = ButtonDefaults.buttonColors(Color.Green),
                        modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)





                    ) {
                        Text(text = "Sign Up")



                    }
                    Spacer(modifier = Modifier.height(60.dp))
                    Text(text = "Already Are Members? Sign In")



                }
            }
        }


    }

}



@Preview(showBackground = true)
@Composable
fun loginScreenPreview(){
    LoginScreen(rememberNavController())

}