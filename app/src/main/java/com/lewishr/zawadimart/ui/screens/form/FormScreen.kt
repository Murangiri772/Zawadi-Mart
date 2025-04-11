package com.lewishr.zawadimart.ui.screens.form

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.SemanticsProperties.Password
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
import com.lewishr.zawadimart.ui.theme.newpine
import com.lewishr.zawadimart.ui.theme.newyellow
import com.navigatins.ROUT_DASHBOARD

@Composable
fun FormScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize().paint(painterResource(R.drawable.leo)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(R.drawable.ab),
            contentDescription = "",
            alignment = Alignment.Center,
            modifier = Modifier.size(100.dp)



            )
        Spacer(modifier = Modifier.height(10.dp))






        Text(
            text = "CREAT AN ACCOUNT",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = newblue


            )
        Spacer(modifier = Modifier.height(10.dp))
        //VARIABLES
        var fullname by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmpassword by remember { mutableStateOf("") }

        //fullname
        OutlinedTextField(
            value = fullname,
            onValueChange = {fullname = it},
            modifier = Modifier.fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = newpine) },
            label = {Text(text = "Fullname")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newpine,
                focusedBorderColor = newyellow,
                focusedLabelColor = newyellow
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )






        //end
        Spacer(modifier = Modifier.height(10.dp))
        //username
        OutlinedTextField(
            value = username,
            onValueChange = {username = it},
            modifier = Modifier.fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "", tint = newpine) },
            label = {Text(text = "Username")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newpine,
                focusedBorderColor = newyellow,
                focusedLabelColor = newyellow
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )






        //end
        Spacer(modifier = Modifier.height(10.dp))
        //email
        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            modifier = Modifier.fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = newpine) },
            label = {Text(text = "Email")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newpine,
                focusedBorderColor = newyellow,
                focusedLabelColor = newyellow
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )






        //end
        Spacer(modifier = Modifier.height(10.dp))
        //PASSWORD
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            modifier = Modifier.fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = newpine) },
            label = {Text(text = "Password")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newpine,
                focusedBorderColor = newyellow,
                focusedLabelColor = newyellow
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            visualTransformation = PasswordVisualTransformation()
        )






        //end
        Spacer(modifier = Modifier.height(10.dp))
        //PASSWORD
        OutlinedTextField(
            value = confirmpassword,
            onValueChange = {confirmpassword = it},
            modifier = Modifier.fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = newpine) },
            label = {Text(text = "Confirmpassword")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newpine,
                focusedBorderColor = newyellow,
                focusedLabelColor = newyellow
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            visualTransformation = PasswordVisualTransformation()
        )






        //end
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {

            },
            colors = ButtonDefaults.buttonColors(Color.Green),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)





        ) {
            Text(text = "Register")



        }




    }

}



@Preview(showBackground = true)
@Composable
fun FormScreenPreview(){
    FormScreen(rememberNavController())

}