package com.example.buttersweety

sealed class NavigationItem(var route:String, var icon:Int, var title:String){
    object Home: NavigationItem("Home",R.drawable.ic_baseline_home_24, "home")
    object Notif: NavigationItem("Notifikasi",R.drawable.ic_baseline_notifications_24, "Notifikasi")
    object Setting: NavigationItem("Setting",R.drawable.ic_baseline_settings_24, "setting")
}
