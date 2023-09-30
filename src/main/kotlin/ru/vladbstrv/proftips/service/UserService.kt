package ru.vladbstrv.proftips.service

import ru.vladbstrv.proftips.model.User

interface UserService {

    fun addUser(user: User): User
    fun getUserById(userId: Long): User
}