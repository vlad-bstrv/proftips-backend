package ru.vladbstrv.proftips.service.impl

import org.springframework.stereotype.Service
import ru.vladbstrv.proftips.exception.ResourceNotFoundException
import ru.vladbstrv.proftips.model.User
import ru.vladbstrv.proftips.repository.UserRepository
import ru.vladbstrv.proftips.service.UserService

@Service
class UserServiceImpl(private val userRepository: UserRepository) : UserService {

    override fun addUser(user: User) = userRepository.save(user)

    override fun getUserById(userId: Long): User = userRepository.findById(userId).orElseThrow{
        ResourceNotFoundException("User not found")
    }
}