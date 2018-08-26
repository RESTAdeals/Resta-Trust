package com.resta.mvp

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
@RequestMapping("/api")
class RestaController {

    @Autowired
    private lateinit var rpc : NodeRPCConnection

    @GetMapping("/date")
    fun getDate() = mapOf("Date" to LocalDateTime.now())

    @GetMapping("/myinfo")
    fun myInfo() = rpc.proxy.nodeInfo().legalIdentities.first().name

    @GetMapping("/peers")
    fun getPeers() = rpc.proxy.networkMapSnapshot().map { it.legalIdentities.map { it.name.x500Principal.getName() } }
}