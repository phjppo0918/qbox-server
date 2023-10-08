package site.qbox.qboxserver.domain.member.query.dto

import site.qbox.qboxserver.domain.member.command.entity.Member


data class MemberRes(
    val email: String,
    val nickname: String
) {
    constructor(member: Member) : this(member.email, member.nickname)
}