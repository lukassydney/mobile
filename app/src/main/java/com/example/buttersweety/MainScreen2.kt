package com.example.buttersweety

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.buttersweety.ui.theme.ButterSweetyTheme
import com.example.buttersweety.ui.theme.Purple200

class MainScreen2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreenSip()

        }
    }
}

@Composable
fun MainScreenSip(){
    val navController = rememberNavController()
    Scaffold(
        topBar = { topApp()},

        bottomBar = { BottomBar(navController)},
        content = {padding->
            Box(modifier = Modifier.padding(padding)){
                Navigation(navController = navController)
            }
        },
        backgroundColor = Purple200
    )
}