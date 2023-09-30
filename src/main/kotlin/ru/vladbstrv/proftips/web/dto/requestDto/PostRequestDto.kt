package ru.vladbstrv.proftips.web.dto.requestDto

import ru.vladbstrv.proftips.model.Post
import ru.vladbstrv.proftips.model.User
import java.time.LocalDateTime

data class PostRequestDto(
    val title: String,
    val content: String,
)

fun PostRequestDto.mapToPost(user: User): Post = Post(
    title = title,
    content = content,
    createdAt = LocalDateTime.now(),
    user = user
)