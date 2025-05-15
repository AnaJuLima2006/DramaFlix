package com.example.dramaflix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dramaflix.screens.DoramaScreen
import com.example.dramaflix.screens.FavoritosScreen
import com.example.dramaflix.screens.GeneroScreen
import com.example.dramaflix.screens.SplashScreen
import com.example.dramaflix.ui.theme.AppTypography
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.dramaflix.viewmodel.FavoritosViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme(
                typography = AppTypography
            ) {
                DramaFlixApp()
            }
        }
    }
}

@Composable
fun DramaFlixApp() {
    val navController = rememberNavController()
    val favoritosViewModel: FavoritosViewModel = viewModel() // Instância compartilhada

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { paddingValues ->
        AppNavHost(navController, favoritosViewModel, modifier = Modifier.padding(paddingValues))
    }
}



@Composable
fun AppNavHost(
    navController: NavHostController,
    favoritosViewModel: FavoritosViewModel,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = "splash",
        modifier = modifier
    ) {
        composable("splash") { SplashScreen(navController) }
        composable("genero") { GeneroScreen(navController) }
        composable("dorama/{genero}") { backStackEntry ->
            val genero = backStackEntry.arguments?.getString("genero") ?: ""
            DoramaScreen(navController, genero, favoritosViewModel)
        }
        composable("favoritos") {
            FavoritosScreen(navController, favoritosViewModel)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen(navController = rememberNavController())
}

@Preview(showBackground = true)
@Composable
fun GeneroScreenPreview() {
    GeneroScreen(navController = rememberNavController())
}

@Preview(showBackground = true)
@Composable
fun DoramaScreenPreview() {
    val favoritosViewModel = FavoritosViewModel()
    DoramaScreen(
        navController = rememberNavController(),
        genero = "Ação",
        favoritosViewModel = favoritosViewModel
    )
}

@Preview(showBackground = true)
@Composable
fun FavoritosScreenPreview() {
    val favoritosViewModel = FavoritosViewModel()
    FavoritosScreen(
        navController = rememberNavController(),
        favoritosViewModel = favoritosViewModel
    )
}
