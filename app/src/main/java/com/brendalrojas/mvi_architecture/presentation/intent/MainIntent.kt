package com.brendalrojas.mvi_architecture.presentation.intent

sealed class MainIntent {
    object FetchAnimals: MainIntent()
}