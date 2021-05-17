package com.kotdroid.coroutinesample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.kotdroid.coroutinesample.R
import com.kotdroid.coroutinesample.repository.PostRepository
import com.kotdroid.coroutinesample.utils.toggleVisibility
import com.kotdroid.coroutinesample.viewmodels.PostViewModel
import com.kotdroid.coroutinesample.viewmodels.PostViewModelFactory
import kotlinx.android.synthetic.main.activity_post.*


/**
 * @AUTHOR Pushkar Srivastava
 * @DATE   18/05/2021
 */
class PostActivity : AppCompatActivity() {

    private val postAdapter by lazy { PostAdapter() }
    private lateinit var postViewModel: PostViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)

        // get view model
        postViewModel = ViewModelProvider(this, PostViewModelFactory(PostRepository()))[PostViewModel::class.java]


        // set adapter
        rvData.adapter = postAdapter

        // get post
        postViewModel.getPost()

        // observe data
        postViewModel.postMutableLiveData.observe(this, {
            // update adapter
            postAdapter.updatePost(it)

            rvData.toggleVisibility()
            pbProgressBar.toggleVisibility()

        })


    }
}