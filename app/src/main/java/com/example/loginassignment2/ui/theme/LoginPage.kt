package com.example.loginassignment2.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.ModifierLocalScrollableContainerProvider.value
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginassignment2.R

@Composable
fun LoginScreen()
{
    Surface(modifier = Modifier
        .fillMaxSize(),

        ) {
            LoginScreen2()
    }
}
@Composable
fun TextFieldWithIcons(){
    var text by remember {mutuableStateOf(TextFieldValue(""))}
    return OutlinedTextField(
        value = text,
        leadingIcon={Icon(imageVector = Icons.Default.Email,
            contentDescription = null)},
        onValueChange={
            text=it
        },
        placeholder={Text(text="Email address")},
    )
}
@Composable
fun TextFieldWithIcons1(){
    var text by remember {mutuableStateOf(TextFieldValue(""))}
    return OutlinedTextField(
        value = text,
        leadingIcon={Icon(imageVector = Icons.Default.Lock,
            contentDescription = null)},
        trailingIcon = {Icon(imageVector = Icons.Default.Info )
        },
        onValueChange={
            text=it
        },
        placeholder={Text(text="Enter your password")},
    )
}
@Composable
fun LoginScreen2(){
    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.bg_app),
            contentDescription ="loginBackground",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize())
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row ( horizontalArrangement =Arrangement.Center,
            modifier = Modifier.padding(5.dp)

        ){
            Icon(modifier=Modifier.size(100.dp),
                imageVector = Icons.Default.Face, contentDescription ="person",
                tint = Color.White ,)
        }
        Row {
            Text(text = "Please login with your credentials to manage the user repository",
                fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.White,
                textAlign = TextAlign.Center)

        }



    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    LoginScreen()
   // LoginScreen2()
}