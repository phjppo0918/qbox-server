package site.qbox.qboxserver.domain.univ.command

import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import site.qbox.qboxserver.domain.univ.command.dto.CreateUnivReq
import site.qbox.qboxserver.global.dto.IdRes

@RestController
@RequestMapping("univ")
class UnivCtrl(
    private val univSvc: UnivSvc,
) {
    @PostMapping
    fun createUniv(@RequestBody @Valid req: CreateUnivReq): IdRes<String> =
        univSvc.create(req)
}