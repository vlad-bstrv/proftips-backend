package ru.vladbstrv.proftips.web.dto.responceDto

import ru.vladbstrv.proftips.model.User

data class UserResponseDto(
    val id: Long,
    val username: String,
    val email: String,
    val posts: List<PostResponseDto>,
)

fun User.mapToUserResponseDto(): UserResponseDto = UserResponseDto(
    id = id!!,
    username = username,
    email = email,
    posts = posts.map {
        it.mapToPostResponseDto()
    }
)