package site.qbox.qboxserver.domain.lecture.command

import org.springframework.data.jpa.repository.JpaRepository
import site.qbox.qboxserver.domain.lecture.command.entity.Lecture

interface LectureRepo : JpaRepository<Lecture, String>