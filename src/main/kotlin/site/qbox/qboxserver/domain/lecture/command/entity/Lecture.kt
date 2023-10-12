package site.qbox.qboxserver.domain.lecture.command.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Lecture(
    @Id val code: String,
    @Column(nullable = false) val name: String,
    @Column(nullable = false) val depart: String
)