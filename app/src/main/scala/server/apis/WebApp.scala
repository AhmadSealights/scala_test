package server.apis

import cask.MainRoutes


object WebApp extends MainRoutes {
    @cask.get("/")
    def hello() = {
        "Hello, World!"
    }
    @cask.get("/s/:name")
    def s(name: String) = {
        "Hello, " + name
    }

    override def port: Int = 8080

    initialize()
}
