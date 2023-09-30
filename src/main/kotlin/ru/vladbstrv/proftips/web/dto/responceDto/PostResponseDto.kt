package ru.vladbstrv.proftips.web.dto.responceDto

import ru.vladbstrv.proftips.model.Post
import java.time.LocalDateTime

data class PostResponseDto(
    val id: Long,
    val title: String,
    val content: String,
    val userId: Long,
    val createdAt: LocalDateTime
)

fun Post.mapToPostResponseDto(): PostResponseDto = PostResponseDto(
    id = id!!,
    title = title,
    content = content,
    userId = user.id!!,
    createdAt = createdAt
)