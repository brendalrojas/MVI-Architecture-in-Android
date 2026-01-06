package com.brendalrojas.mvi_architecture.data.remote.api

class AnimalRepo(private val api: AnimalApi) {
    suspend fun getAnimals() = api.getAnimals()
}