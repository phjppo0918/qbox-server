package site.qbox.qboxserver.domain.question.command.dto

import jakarta.validation.constraints.NotBlank

data class CreateQuestionReq(
    @NotBlank val title: String,
    @NotBlank val content: String,
    @NotBlank val lectureCode: String,
)
