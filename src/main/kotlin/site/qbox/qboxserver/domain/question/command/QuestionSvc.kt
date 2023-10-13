package site.qbox.qboxserver.domain.question.command

import site.qbox.qboxserver.domain.question.command.dto.CreateQuestionReq
import site.qbox.qboxserver.domain.question.command.entity.Question
import site.qbox.qboxserver.global.annotation.CommandService
import site.qbox.qboxserver.global.dto.IdRes

@CommandService
class QuestionSvc(
    private val questionRepo: QuestionRepo
) {
    fun create(req: CreateQuestionReq, writer: String): IdRes<Long> {

        val savedQuestion = questionRepo.save(Question(req.title, req.content, writer))
        return IdRes(savedQuestion.id)
    }
}