package ru.vladbstrv.proftips.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.vladbstrv.proftips.model.Post

@Repository
interface PostRepository: JpaRepository<Post, Long> {

}