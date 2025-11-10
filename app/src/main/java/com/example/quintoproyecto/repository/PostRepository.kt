package com.example.quintoproyecto.repository

import com.example.quintoproyecto.data.model.Post
import com.example.quintoproyecto.data.remote.RetrofitInstance


class PostRepository {
    suspend fun getPosts(): List<Post> {
        return RetrofitInstance.api.getPosts()
    }
}