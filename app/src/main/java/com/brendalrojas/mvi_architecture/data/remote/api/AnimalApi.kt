package com.brendalrojas.mvi_architecture.data.remote.api

import com.brendalrojas.mvi_architecture.domain.model.Animal
import retrofit2.http.GET

interface AnimalApi{
    @GET("animals.json")
    suspend fun getAnimals(): List<Animal>
}