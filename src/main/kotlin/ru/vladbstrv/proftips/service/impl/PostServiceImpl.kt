package ru.vladbstrv.proftips.service.impl

import org.springframework.stereotype.Service
import ru.vladbstrv.proftips.exception.ResourceNotFoundException
import ru.vladbstrv.proftips.model.Post
import ru.vladbstrv.proftips.repository.PostRepository
import ru.vladbstrv.proftips.service.PostService

@Service
class PostServiceImpl(private val postRepository: PostRepository) : PostService {

    override fun addPost(post: Post) = postRepository.save(post)

    override fun getPostById(postId: Long): Post = postRepository.findById(postId).orElseThrow {
        ResourceNotFoundException("Post not found")
    }

    override fun getAllPosts(): List<Post> = postRepository.findAll()
}