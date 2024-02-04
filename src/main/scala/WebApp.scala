import cask.MainRoutes

object WebApp extends MainRoutes {
    @cask.get("/")
    def hello() = {
        "Hello, World!"
    }
    @cask.get("/")
    def hello() = {
        "Hello, World!"
    }

    override def port: Int = 8080

    initialize()
}
