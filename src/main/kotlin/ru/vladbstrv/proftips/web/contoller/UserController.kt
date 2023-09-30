package ru.vladbstrv.proftips.web.contoller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.vladbstrv.proftips.service.UserService
import ru.vladbstrv.proftips.web.dto.requestDto.UserRequestDto
import ru.vladbstrv.proftips.web.dto.requestDto.mapToUser
import ru.vladbstrv.proftips.web.dto.responceDto.UserResponseDto
import ru.vladbstrv.proftips.web.dto.responceDto.mapToUserResponseDto

@RestController
@RequestMapping("/api/v1/users")
class UserController(private val userService: UserService) {

    @PostMapping("/register")
    fun registerUser(@RequestBody userRequestDto: UserRequestDto) =
        userService.addUser(userRequestDto.mapToUser()).mapToUserResponseDto()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): UserResponseDto =
        userService.getUserById(id).mapToUserResponseDto()
}