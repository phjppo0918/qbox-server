package site.qbox.qboxserver.global.entity

import jakarta.persistence.Column
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@EntityListeners(AuditingEntityListener::class)
@MappedSuperclass
abstract class BaseEntity {
    @CreatedDate
    @Column(updatable = false)
    val createdAt: LocalDateTime? = null

    @LastModifiedDate
    @Column(updatable = false)
    val updatedAt: LocalDateTime? = null

    var isDeleted: Boolean = false

    val isUpdated: Boolean
        get() = createdAt != updatedAt
}