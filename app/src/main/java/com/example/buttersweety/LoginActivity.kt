package com.example.buttersweety

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buttersweety.ui.theme.ButterSweetyTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginActivitySip()
        }
    }
}

@Composable
fun LoginActivitySip() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {

        val context = LocalContext.current

        Column(
            modifier = Modifier
                .width(300.dp)
                .height(400.dp), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .width(300.dp)
                    .height(400.dp),
                painter = painterResource(id = R.drawable.logooo),
                contentDescription = "Photo ThinkPad T480",
            )


            Column(
                modifier = Modifier.padding(
                    start = 55.dp,
                    top = 5.dp,
                    end = 10.dp
                ), horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Box(
                    Modifier
                        .height(60.dp)
                        .fillMaxWidth().background(Color.White)
                ) {
                    var text by remember { mutableStateOf(TextFieldValue("")) }
                    TextField(
                        value = text,
                        onValueChange = {
                            text = it
                        },
                        label = { Text(text = "Email") },
                        placeholder = { Text(text = "Masukkan email") }
                    )


                }
            }

            Column(
                modifier = Modifier.padding(
                    start = 55.dp,
                    top = 20.dp,
                    end = 16.dp
                ), horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Box(
                    Modifier
                        .height(60.dp)
                        .fillMaxWidth().background(Color.White)
                ) {
                    var text by remember { mutableStateOf(TextFieldValue("")) }
                    TextField(
                        value = text,
                        onValueChange = {
                            text = it
                        },
                        label = { Text(text = "Password") },
                        placeholder = { Text(text = "Masukkan password") }
                    )
                }


            }

            Column(
                modifier = Modifier.padding(
                    start = 16.dp,
                    top = 20.dp,
                    end = 16.dp
                ), horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Button(
                    onClick = {
                        context.startActivity(Intent(context, MainScreen2::class.java))
                    },
                    // Uses ButtonDefaults.ContentPadding by default
                    contentPadding = PaddingValues(
                        start = 20.dp,
                        top = 12.dp,
                        end = 20.dp,
                        bottom = 12.dp
                    )
                ) {
                    Text(text = "LOGIN")
                }


            }






            Column(
                modifier = Modifier.padding(
                    start = 16.dp,
                    top = 10.dp,
                    end = 16.dp
                ), horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(text = "Sign Up Here", color = Color.Blue)

            }


        }

    }
}
