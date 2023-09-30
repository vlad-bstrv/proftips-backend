package ru.vladbstrv.proftips.web.contoller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.vladbstrv.proftips.service.PostService
import ru.vladbstrv.proftips.service.UserService
import ru.vladbstrv.proftips.web.dto.requestDto.PostRequestDto
import ru.vladbstrv.proftips.web.dto.requestDto.mapToPost
import ru.vladbstrv.proftips.web.dto.responceDto.PostResponseDto
import ru.vladbstrv.proftips.web.dto.responceDto.mapToPostResponseDto

@RestController
@RequestMapping("/api/v1/posts")
class PostController(
    private val postService: PostService,
    private val userService: UserService
) {

    @PostMapping
    fun createPost(@RequestBody postRequestDto: PostRequestDto): PostResponseDto =
        postService.addPost(postRequestDto.mapToPost(userService.getUserById(1))).mapToPostResponseDto()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): PostResponseDto = postService.getPostById(id).mapToPostResponseDto()

    @GetMapping
    fun getAllPosts(): List<PostResponseDto> = postService.getAllPosts().map { it.mapToPostResponseDto() }
}