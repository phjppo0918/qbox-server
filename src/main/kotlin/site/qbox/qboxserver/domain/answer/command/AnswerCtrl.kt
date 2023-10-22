package site.qbox.qboxserver.domain.answer.command

import org.springframework.security.core.Authentication
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import site.qbox.qboxserver.domain.answer.command.dto.CreateAnswerReq

@RestController
@RequestMapping("answers")
class AnswerCtrl(
    private val answerSvc: AnswerSvc,
) {
    @PostMapping
    fun createAnswer(@RequestBody req: CreateAnswerReq, auth: Authentication) =
        answerSvc.create(req, auth.name)
}