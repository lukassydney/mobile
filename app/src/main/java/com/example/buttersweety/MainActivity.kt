package com.example.buttersweety

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.buttersweety.ui.theme.ButterSweetyTheme
import com.example.buttersweety.ui.theme.Purple200

import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.buttersweety.ui.theme.ButterSweetyTheme
import com.example.buttersweety.ui.theme.Pink
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import io.grpc.Context

class MainActivity : ComponentActivity() {
    private val auth by lazy { Firebase.auth}
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
fun Navigation(navController: NavHostController){
    NavHost(navController  , startDestination = NavigationItem.Home.route ){
        composable(NavigationItem.Home.route){
            DefaultPreview2()
        }
        composable(NavigationItem.Notif.route){
            Notifpage()
        }
        composable(NavigationItem.Setting.route){
            DefaultPreview5()
        }
    }
}

@Composable
fun topApp(){
    TopAppBar(
        title = {Text(text = "Butter Sweety")},
        backgroundColor = Color(0XffFFE2E2),
        contentColor = Color.Black

    )
}

@Composable
fun BottomBar(navController: NavController){
    val item = listOf(
        NavigationItem.Home,
        NavigationItem.Notif,
        NavigationItem.Setting
    )
    BottomNavigation(
        backgroundColor = Color(0XffFFE2E2),
        contentColor = Color.Black
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        item.forEach{item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon),
                    contentDescription = item.title)} ,
                label = { Text(text = item.title)},
                selectedContentColor = Color.Black,
                unselectedContentColor = Color.Black.copy(0.4f),
                alwaysShowLabel = true,
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route){
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route){
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                })

        }
    }

}

@Composable
fun LoginApplication(){

}




