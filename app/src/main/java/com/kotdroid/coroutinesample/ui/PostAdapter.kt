package com.kotdroid.coroutinesample.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kotdroid.coroutinesample.R
import com.kotdroid.coroutinesample.models.PostModel
import kotlinx.android.synthetic.main.row_item_post.view.*


/**
 * @AUTHOR Pushkar Srivastava
 * @DATE   18/05/2021
 */
class PostAdapter :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val postList = mutableListOf<PostModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PostViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.row_item_post, null, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PostViewHolder).bindPost(postList[position])
    }

    override fun getItemCount(): Int {
        return postList.size;
    }

    fun updatePost(list: List<PostModel>) {
        postList.clear()
        postList.addAll(list)
        notifyDataSetChanged()
    }

    class PostViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindPost(data: PostModel) {

            itemView.apply {
                tvId.text = data.id.toString()
                tvDes.text = data.body
                tvTitle.text = data.title
            }
        }

    }
}