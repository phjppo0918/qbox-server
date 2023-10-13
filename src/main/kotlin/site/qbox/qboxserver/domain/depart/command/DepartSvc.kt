package site.qbox.qboxserver.domain.depart.command

import site.qbox.qboxserver.global.annotation.CommandService

@CommandService
class DepartSvc(
    private val departRepo: DepartRepo,
)