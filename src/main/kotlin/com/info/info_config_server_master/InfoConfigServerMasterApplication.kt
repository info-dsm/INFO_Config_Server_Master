package com.info.info_config_server_master

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class InfoConfigServerMasterApplication

fun main(args: Array<String>) {
    runApplication<InfoConfigServerMasterApplication>(*args)
}
