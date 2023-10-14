package site.qbox.qboxserver.domain.depart.command

import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import site.qbox.qboxserver.domain.depart.command.dto.CreateDepartReq
import site.qbox.qboxserver.global.dto.IdRes

@RestController
@RequestMapping("departs")
class DepartCtrl(
    private val departSvc: DepartSvc,
) {
    @PostMapping
    fun createDepart(@RequestBody @Valid req: CreateDepartReq) : IdRes<Long>
     = departSvc.create(req)
}