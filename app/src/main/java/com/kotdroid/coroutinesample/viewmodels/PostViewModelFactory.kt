package com.kotdroid.coroutinesample.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kotdroid.coroutinesample.repository.PostRepository

/**
 * @AUTHOR Amandeep Singh
 * @DATE   18/05/2021
 */
@Suppress("UNCHECKED_CAST")
class PostViewModelFactory(private val postRepository: PostRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PostViewModel(postRepository) as T
    }
}