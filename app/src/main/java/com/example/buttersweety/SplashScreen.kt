package com.example.buttersweety

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.buttersweety.ui.theme.ButterSweetyTheme
import kotlinx.coroutines.delay

class SplashScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButterSweetyTheme {
                // A surface container using the 'background' color from the theme
                SplashScreenSip()
            }
        }
    }
}

@Composable
fun navigation()
{
    
    val navController = rememberNavController()
    NavHost(navController = navController ,
        startDestination = "splash_screen"
    ){
        composable("splash_screen"){

        }

        composable("login_screen"){
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Main Screen", fontSize = 30.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
fun SplashScreenSip(){

    val context = LocalContext.current

    LaunchedEffect(key1 = true ){
        delay(4000)
        context.startActivity(Intent(context, LoginActivity::class.java))
    }

    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(painter = painterResource(id = R.drawable.logooo),
            "",
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
        )
    }

}