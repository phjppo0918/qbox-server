package site.qbox.qboxserver.domain.lecture.command

import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import site.qbox.qboxserver.domain.lecture.command.dto.CreateLectureReq
import site.qbox.qboxserver.global.dto.IdRes

@RestController
@RequestMapping("lectures")
class LectureCtrl(
    private val lectureSvc: LectureSvc,
) {
    @PostMapping
    fun createLecture(@RequestBody @Valid req: CreateLectureReq): IdRes<String> =
        lectureSvc.create(req)
}