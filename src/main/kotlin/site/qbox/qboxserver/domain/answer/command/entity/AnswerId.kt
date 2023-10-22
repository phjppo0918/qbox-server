package site.qbox.qboxserver.domain.answer.command.entity

import jakarta.persistence.Embeddable
import java.io.Serializable

@Embeddable
class AnswerId(questionId: Long, writerId: String) : Serializable {
}