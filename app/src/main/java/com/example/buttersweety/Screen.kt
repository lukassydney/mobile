package com.example.buttersweety

sealed class Screen(val route:String){
    object MainScreen: Screen(route = "MainScreen")
    object LoginScreen: Screen(route = "login_screen")
    object SplashScreen: Screen(route = "Splash_screen")

}
