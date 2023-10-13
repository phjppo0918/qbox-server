package site.qbox.qboxserver.domain.depart.command.dto

import jakarta.validation.constraints.NotBlank

class CreateDepartReq(
    @NotBlank name: String,
    @NotBlank univId: String,
)
