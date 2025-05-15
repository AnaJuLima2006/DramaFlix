package com.example.dramaflix.screens

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.dramaflix.viewmodel.FavoritosViewModel

@Composable
fun FavoritosScreen(
    navController: NavHostController,
    favoritosViewModel: FavoritosViewModel = viewModel()
) {
    val favoritos = favoritosViewModel.favoritos.collectAsState().value
    val favoritosPorGenero = favoritos.groupBy { it.genero }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(Color(0xFF0D0D0D), Color(0xFF550000))
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                Text(
                    text = "DramaFlix",
                    style = MaterialTheme.typography.headlineLarge,
                    color = Color.White,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .clickable {
                            navController.navigate("genero") {
                                popUpTo("favoritos") { inclusive = true }
                                launchSingleTop = true
                            }
                        }
                )

                IconButton(
                    onClick = { navController.popBackStack() },
                    modifier = Modifier.align(Alignment.CenterStart)
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Voltar",
                        tint = Color.White
                    )
                }
            }

            if (favoritos.isEmpty()) {
                Text(
                    text = "Nenhum dorama favoritado ainda.",
                    color = Color.White,
                    style = MaterialTheme.typography.bodyLarge
                )
            } else {
                favoritosPorGenero.forEach { (genero, lista) ->
                    if (lista.isNotEmpty()) {
                        Text(
                            text = genero,
                            style = MaterialTheme.typography.titleLarge,
                            color = Color.White,
                            modifier = Modifier.padding(vertical = 8.dp)
                        )

                        lista.forEach { drama ->
                            var expanded by remember { mutableStateOf(false) }

                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 4.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.White.copy(alpha = 0.1f)
                                ),
                                shape = RoundedCornerShape(12.dp),
                                elevation = CardDefaults.cardElevation(4.dp)
                            ) {
                                Row(
                                    verticalAlignment = Alignment.Top, // Alinha ao topo
                                    modifier = Modifier.padding(8.dp)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .height(100.dp)
                                            .aspectRatio(0.75f)
                                            .clip(RoundedCornerShape(12.dp))
                                    ) {
                                        Image(
                                            painter = painterResource(id = drama.imageResId),
                                            contentDescription = drama.titulo,
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier.fillMaxSize()
                                        )
                                    }

                                    Spacer(modifier = Modifier.width(8.dp))

                                    Column(
                                        modifier = Modifier
                                            .weight(1f)
                                            .animateContentSize()
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier.fillMaxWidth()
                                        ) {
                                            Text(
                                                text = drama.titulo,
                                                style = MaterialTheme.typography.titleMedium,
                                                color = Color.White,
                                                modifier = Modifier.weight(1f)
                                            )

                                            IconButton(onClick = {
                                                favoritosViewModel.removerFavorito(drama)
                                            }) {
                                                Icon(
                                                    imageVector = Icons.Filled.Favorite,
                                                    contentDescription = "Desfavoritar",
                                                    tint = Color.Red
                                                )
                                            }
                                        }

                                        val previewLength = 50
                                        val sinopsePreview = if (drama.sinopse.length > previewLength)
                                            drama.sinopse.take(previewLength) + "..."
                                        else
                                            drama.sinopse

                                        Text(
                                            text = if (expanded) drama.sinopse else sinopsePreview,
                                            color = Color.White,
                                            style = MaterialTheme.typography.bodyMedium,
                                            modifier = Modifier.padding(top = 4.dp)
                                        )

                                        if (drama.sinopse.length > previewLength) {
                                            Text(
                                                text = if (expanded) "Ver menos" else "Ver mais",
                                                color = Color.Cyan,
                                                style = MaterialTheme.typography.bodySmall,
                                                modifier = Modifier
                                                    .padding(top = 4.dp)
                                                    .clickable { expanded = !expanded }
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
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
