package site.qbox.qboxserver.domain.question.command

import jakarta.validation.Valid
import org.springframework.security.core.Authentication
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import site.qbox.qboxserver.domain.question.command.dto.CreateQuestionReq
import site.qbox.qboxserver.global.dto.IdRes

@RestController
@RequestMapping("questions")
class QuestionCtrl(
    private val questionSvc: QuestionSvc
) {
    @PostMapping
    fun createQuestion(
        @RequestBody @Valid req: CreateQuestionReq,
        auth: Authentication
    ): IdRes<Long> =
        questionSvc.create(req, auth.name)
}