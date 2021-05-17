package com.kotdroid.coroutinesample.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kotdroid.coroutinesample.models.PostModel
import com.kotdroid.coroutinesample.repository.PostRepository
import kotlinx.coroutines.launch

/**
 * @AUTHOR Amandeep Singh
 * @DATE   18/05/2021
 */
class PostViewModel(private val postRepository: PostRepository) : ViewModel() {

    val postMutableLiveData = MutableLiveData<List<PostModel>>()


    fun getPost() {

        // send data from background to UI-thread
        viewModelScope.launch {
            val response = postRepository.getPosts()

            postMutableLiveData.value = response
        }
    }
}