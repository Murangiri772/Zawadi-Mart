package com.navigatins

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lewishr.zawadimart.ui.screens.about.AboutScreen
import com.lewishr.zawadimart.ui.screens.dashboard.DashBoardScreen
import com.lewishr.zawadimart.ui.screens.home.HomeScreen
import com.lewishr.zawadimart.ui.screens.intents.IntentsScreen
import com.lewishr.zawadimart.ui.screens.item.ItemScreen
import com.lewishr.zawadimart.ui.screens.start.StartScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_HOME
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)

        }
        composable(ROUT_START) {
            StartScreen(navController)

        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)

        }
        composable(ROUT_INTENTS) {
            IntentsScreen(navController)

        }
        composable(ROUT_DASHBOARD) {
            DashBoardScreen(navController)

        }


    }


}