package com.example.dramaflix.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Shuffle
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.dramaflix.R


@Composable
fun GeneroScreen(navController: NavHostController) {

    val generos = listOf("Ação", "Comédia", "Drama", "Ficção", "Terror", "Romance", "Fantasia", "Thriller")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color.Black, Color(0xFF8B0000))
                )
            )
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "DramaFlix",
            style = MaterialTheme.typography.headlineLarge,
            color = Color.White,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = "Descubra seu próximo dorama favorito! Navegue pelos gêneros e encontre o que mais combina com você.",
            style = MaterialTheme.typography.headlineSmall,
            color = Color.White.copy(alpha = 0.8f),
            modifier = Modifier.padding(bottom = 4.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .weight(1f),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            items(generos) { genero ->
                Button(
                    onClick = { navController.navigate("dorama/$genero") },
                    modifier = Modifier
                        .height(80.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Gray.copy(alpha = 0.4f)),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text(genero.uppercase(), style = MaterialTheme.typography.headlineSmall)
                }
            }

            // Botão ALEATÓRIO
            item {
                IconButton(
                    onClick = {
                        val generoAleatorio = generos.random()
                        navController.navigate("dorama/$generoAleatorio")
                    },
                    modifier = Modifier
                        .size(80.dp)
                        .background(Color.Gray.copy(alpha = 0.4f), shape = RoundedCornerShape(16.dp))
                ) {
                    Icon(
                        imageVector = Icons.Filled.Shuffle,
                        contentDescription = "Aleatório",
                        tint = Color.White,
                        modifier = Modifier.size(40.dp)
                    )
                }
            }

            // Botão FAVORITOS
            item {
                IconButton(
                    onClick = { navController.navigate("favoritos") },
                    modifier = Modifier
                        .size(80.dp)
                        .background(Color.Gray.copy(alpha = 0.4f), shape = RoundedCornerShape(16.dp))
                ) {
                    Icon(
                        imageVector = Icons.Filled.List,
                        contentDescription = "Favoritos",
                        tint = Color.White,
                        modifier = Modifier.size(40.dp)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))
        Image(
            painter = painterResource(id = R.drawable.logod_f),
            contentDescription = "DramaFlix Logo",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(width = 2.dp, color = Color.White, shape = CircleShape)
        )
        Text(
            text = "© 2025 DramaFlix",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.LightGray,
            modifier = Modifier.padding(bottom = 16.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GeneroScreenPreview() {
    GeneroScreen(navController = rememberNavController())
}