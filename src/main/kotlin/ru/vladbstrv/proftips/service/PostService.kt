package ru.vladbstrv.proftips.service

import ru.vladbstrv.proftips.model.Post

interface PostService {

    fun addPost(post: Post): Post
    fun getPostById(postId: Long): Post
    fun getAllPosts(): List<Post>
}