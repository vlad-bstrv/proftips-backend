package ru.vladbstrv.proftips.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
data class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,
    val title: String,
    val content: String,
    val createdAt: LocalDateTime,
    @ManyToOne
    @JoinColumn(name = "user_id")
    val user: User,
)
