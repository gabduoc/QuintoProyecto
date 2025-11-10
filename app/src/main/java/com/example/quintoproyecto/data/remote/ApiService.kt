package com.example.quintoproyecto.data.remote
import com.example.quintoproyecto.data.model.Post
import retrofit2.http.GET

interface ApiService {

    @GET("/posts")
    suspend fun getPosts(): List<Post>
}