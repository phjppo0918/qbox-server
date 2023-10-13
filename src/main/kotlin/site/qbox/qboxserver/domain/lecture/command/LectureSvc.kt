package site.qbox.qboxserver.domain.lecture.command

import site.qbox.qboxserver.domain.lecture.command.dto.CreateLectureReq
import site.qbox.qboxserver.domain.lecture.command.entity.Lecture
import site.qbox.qboxserver.global.annotation.CommandService
import site.qbox.qboxserver.global.dto.IdRes

@CommandService
class LectureSvc(
    private val lectureRepo: LectureRepo,
) {
    fun create(req: CreateLectureReq): IdRes<String> {
        val savedLecture = lectureRepo.save(Lecture(req.code, req.name, req.departId))
        return IdRes(savedLecture.code)
    }
}