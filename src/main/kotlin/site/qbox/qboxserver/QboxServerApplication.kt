package site.qbox.qboxserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@EnableAsync
@SpringBootApplication
class QboxServerApplication

fun main(args: Array<String>) {
    runApplication<QboxServerApplication>(*args)
}
