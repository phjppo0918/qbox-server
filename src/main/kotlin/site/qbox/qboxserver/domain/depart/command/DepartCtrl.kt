package site.qbox.qboxserver.domain.depart.command

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("departs")
class DepartCtrl(
    private val departSvc: DepartSvc,
)