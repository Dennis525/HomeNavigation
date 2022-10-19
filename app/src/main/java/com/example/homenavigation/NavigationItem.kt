package com.example.homenavigation

sealed class NavigationItem(val route:String) {
    object Login: NavigationItem("login")
    object Registration: NavigationItem("registration")
    object Home: NavigationItem("home")
}