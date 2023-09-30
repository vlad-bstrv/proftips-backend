package ru.vladbstrv.proftips.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*

@Entity
@Table(name = "_user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,
    @Column(unique = true, nullable = false)
    val username: String,
    @Column(unique = true, nullable = false)
    val email: String,
    @Column(nullable = false)
    val password: String,
    val imageUrl: String = "url image",
    @JsonIgnore
    @OneToMany(mappedBy = "user")
    val posts: List<Post>,
)
