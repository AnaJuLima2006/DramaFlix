package com.example.dramaflix.viewmodel

import androidx.lifecycle.ViewModel
import com.example.dramaflix.model.Drama
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class FavoritosViewModel : ViewModel() {

    private val _favoritos = MutableStateFlow<List<Drama>>(emptyList())
    val favoritos: StateFlow<List<Drama>> = _favoritos

    fun alternarFavorito(drama: Drama) {
        _favoritos.update { lista ->
            if (drama in lista) lista - drama else lista + drama
        }
    }

    fun ehFavorito(drama: Drama): Boolean {
        return _favoritos.value.contains(drama)
    }

    fun getFavoritosPorGenero(): Map<String, List<Drama>> {
        return _favoritos.value.groupBy { it.genero }
    }

    fun removerFavorito(drama: Drama) {
        _favoritos.update { lista -> lista - drama }
    }

}
