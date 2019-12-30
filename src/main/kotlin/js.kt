

//@JsModule("socket.io")
//external fun

@JsModule("http")
external object Http {
    val maxHeaderSize: Number
    fun createServer(options: dynamic /* tls.SecureContextOptions & tls.TlsOptions & http.ServerOptions */= definedExternally, requestListener: (req: dynamic, res: dynamic) -> dynamic = definedExternally /* null */): dynamic
}




fun main() {
  println("Kotlin rocks!")
  leftPad("1.3.50", 50)

  httpserver()



  /*
  val express = js("express")
  val app = express()

  app.get("/", { req, res ->
    res.type("text/plain")
    res.send("i am a beautiful butterfly")
  })

  app.listen(3000, {
    println("Listening on port 3000")
  })
*/
}

fun httpserver() {
//  val http = js("require('http')")
  val port = 3000

  println(http.STATUS_CODES[404])
  println(Http.maxHeaderSize)


  val server = Http.createServer(requestListener = { request, response ->
    console.log(request.url)
    println("Request received")
    response.end("Hello Node.js Server!\n")
  })

  server.listen(port, { err ->
    if (err) {
      console.log("something bad happene", err)
    }

    console.log("server is listening on ${port}")
  })

  println("After http listen")
}

fun socketserver() {
  val io = js("require('socket.io')")()
  println(io.eventNames())
  io.on("connection",  { client ->
    println("Connected")
    println(client)
//    client.emit("something")
  })
  println("Before listen")
  io.listen(3000)
  println("After listen")
}

fun sockethttpserver() {
  val http = js("require('http')")

  val server = http.createServer()
  val socketio = js("require('socket.io')")
  val io = socketio(server)

  io.on("connection",  { client ->
    println("Connected")
    println(client)
    client.on("event", { data -> println("Event")})
    client.on("disconnect", { -> println("Disconnect") /* … */ })

  })
  println("Before listen")
  server.listen(3000)
  println("After listen")
}
