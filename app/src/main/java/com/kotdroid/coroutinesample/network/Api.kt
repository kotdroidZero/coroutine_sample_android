package com.kotdroid.coroutinesample.network

import com.kotdroid.coroutinesample.models.PostModel
import retrofit2.http.GET

/**
 * @AUTHOR Pushkar Srivastava
 * @DATE   18/05/2021
 */
interface Api {

    @GET("posts")
    suspend fun getPost():List<PostModel>
}