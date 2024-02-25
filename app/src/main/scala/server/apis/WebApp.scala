package server.apis

import server.functions.externalfunctions
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
    @cask.get("/twolayer")
    def twolayer(s: String) = {
        externalfunctions.second(s);
    }
    @cask.get("/caseclass")
    def caseclass(name: String,age: Int) = {
        externalfunctions.caseclass(name,age);
    }

    override def port: Int = 8080

    initialize()
}
