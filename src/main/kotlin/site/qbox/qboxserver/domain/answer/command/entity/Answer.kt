package site.qbox.qboxserver.domain.answer.command.entity

import jakarta.persistence.EmbeddedId
import jakarta.persistence.Entity
import site.qbox.qboxserver.global.entity.BaseEntity

@Entity
class Answer(
    var content: String,
    @EmbeddedId val id: AnswerId,
) : BaseEntity() {
    constructor(content: String, questionId: Long, writerId: String) :
            this(content, AnswerId(questionId, writerId))

}