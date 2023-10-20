package site.qbox.qboxserver.domain.lecture.query.dto

import site.qbox.qboxserver.domain.lecture.command.entity.Lecture

data class LectureRes(
    val name: String,
    val code: String,
    val departId: Long,
) {
    constructor(lecture: Lecture) : this(lecture.name, lecture.id.code, lecture.id.departId)
}