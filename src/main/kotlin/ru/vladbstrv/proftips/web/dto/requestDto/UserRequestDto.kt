package ru.vladbstrv.proftips.web.dto.requestDto

import ru.vladbstrv.proftips.model.User

data class UserRequestDto(
    val username: String,
    val email: String,
    val password: String,
)

fun UserRequestDto.mapToUser(): User = User(
    username = username,
    email = email,
    password = password,
    posts = emptyList()
)
