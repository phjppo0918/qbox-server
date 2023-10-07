package site.qbox.qboxserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class QboxServerApplication

fun main(args: Array<String>) {
    runApplication<QboxServerApplication>(*args)
}
