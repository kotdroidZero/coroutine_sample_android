package com.kotdroid.coroutinesample.repository

import com.kotdroid.coroutinesample.models.PostModel
import com.kotdroid.coroutinesample.network.RetrofitBuilder
import retrofit2.Retrofit

/**
 * @AUTHOR Amandeep Singh
 * @DATE   18/05/2021
 */
class PostRepository {

    suspend fun getPosts():List<PostModel> = RetrofitBuilder.api.getPost()
}