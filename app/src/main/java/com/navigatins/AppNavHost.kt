package com.navigatins

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lewishr.zawadimart.data.UserDatabase
import com.lewishr.zawadimart.repository.UserRepository
import com.lewishr.zawadimart.ui.screens.about.AboutScreen
import com.lewishr.zawadimart.ui.screens.auth.LoginScreen
import com.lewishr.zawadimart.ui.screens.auth.RegisterScreen
import com.lewishr.zawadimart.ui.screens.dashboard.DashBoardScreen
import com.lewishr.zawadimart.ui.screens.form.FormScreen
import com.lewishr.zawadimart.ui.screens.home.HomeScreen
import com.lewishr.zawadimart.ui.screens.intents.IntentsScreen
import com.lewishr.zawadimart.ui.screens.item.ItemScreen
import com.lewishr.zawadimart.ui.screens.service.ServiceScreen
import com.lewishr.zawadimart.ui.screens.splash.SplashScreen
import com.lewishr.zawadimart.ui.screens.start.StartScreen
import com.lewishr.zawadimart.viewmodel.AuthViewModel


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {
    var context = LocalContext.current

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
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)

        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)

        }
        composable(ROUT_HAMMALIA) {
            HammaliaScreen(navController)

        }
        composable(ROUT_FORM) {
            FormScreen(navController)

        }
        composable(ROUT_LOGOAPP) {
            LogoappScreen(navController)

        }
        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }






    }


}

@Composable
fun LogoappScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun HammaliaScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}