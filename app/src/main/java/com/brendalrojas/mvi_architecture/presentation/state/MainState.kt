package com.brendalrojas.mvi_architecture.presentation.state

import com.brendalrojas.mvi_architecture.domain.model.Animal

sealed class MainState {
    object Idle: MainState()
    object Loading: MainState()
    data class Animals(val animals: List<Animal>): MainState()
    data class Error(val error: String?): MainState()
}