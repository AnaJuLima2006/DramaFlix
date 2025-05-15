package com.example.dramaflix.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Shuffle
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.example.dramaflix.model.sorteiaDrama
import androidx.compose.material3.Icon
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.dramaflix.viewmodel.FavoritosViewModel


@Composable
fun DoramaScreen(
    navController: NavHostController,
    genero: String,
    favoritosViewModel: FavoritosViewModel = viewModel()
){
    var drama by remember { mutableStateOf(sorteiaDrama(genero)) }
    val favoritos by favoritosViewModel.favoritos.collectAsState()
    val isFavorito = favoritos.contains(drama)

    fun sortearNovoDrama() {
        drama = sorteiaDrama(genero)
        // isFavorito será atualizado pelo LaunchedEffect
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color.Black, Color(0xFF8B0000))
                )
            )
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(32.dp))
        Text(
            text = "DramaFlix",
            style = MaterialTheme.typography.headlineLarge,
            color = Color.White,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .clickable {
                    navController.navigate("genero") {
                        popUpTo("favoritos") { inclusive = true }
                        launchSingleTop = true
                    }
                }
        )
        Spacer(modifier = Modifier.height(16.dp))

        Image(
            painter = painterResource(id = drama.imageResId),
            contentDescription = drama.titulo,
            modifier = Modifier
                .height(250.dp)
                .clip(RoundedCornerShape(12.dp))

        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(24.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 8.dp)
        ) {
            IconButton(onClick = { sortearNovoDrama() }) {
                Icon(
                    imageVector = Icons.Default.Shuffle,
                    contentDescription = "Sortear",
                    tint = Color.White,
                    modifier = Modifier.size(36.dp)
                )
            }

            IconButton(onClick = {
                favoritosViewModel.alternarFavorito(drama)
            }) {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Favorito",
                    tint = if (isFavorito) Color.Red else Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }

            IconButton(onClick = { navController.navigate("favoritos") }) {
                Icon(
                    imageVector = Icons.Default.List,
                    contentDescription = "Favoritos",
                    tint = Color.White,
                    modifier = Modifier.size(36.dp)
                )
            }
        }


        Spacer(modifier = Modifier.height(16.dp))

        // Título
        Text(
            text = drama.titulo,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Gênero
        Text(
            text = "Gênero: ${drama.genero}",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Sinopse
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = drama.sinopse,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier
                .size(width = 330.dp, height = 250.dp)
                .background(Color.Gray.copy(alpha = 0.3f), shape = RoundedCornerShape(8.dp))
                .padding(12.dp)
        )
    }
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