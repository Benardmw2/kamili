package com.ben.trial.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ben.trial.ui.theme.screens.home.Home
import com.ben.trial.ui.theme.screens.login.Login
import com.ben.trial.ui.theme.screens.register.Register

@Composable
fun AppNavHost(modifier: Modifier,navController: NavHostController = rememberNavController(),startDestination: String= ROUTE_LOGIN) {
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_HOME){
            Home(navController )
        }
        composable(ROUTE_LOGIN){
            Login(navController )
        }
        composable(ROUTE_REGISTER){
            Register(navController)
        }
        composable(ROUTE_CATER){
            Register(navController)
        }
        composable(ROUTE_PA){
            Register(navController)
        }
        composable(ROUTE_TENT){
            Register(navController)
        }
    }
}