package com.wire.megaphonebot

import com.wire.xenon.assets.MessageText
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response


@Path("/api/v1/example")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class ExampleResource {

    private val logger: Logger by lazy { LoggerFactory.getLogger(this::class.java) }

    @GET
    fun printHello(): Response {
        val message = MessageText("hola!")

        logger.info(">>> ${message.messageId}")
        return Response.ok("HOOOLA!").build()
    }
}
