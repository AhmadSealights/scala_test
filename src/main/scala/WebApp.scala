import cask.MainRoutes

object WebApp extends MainRoutes {
    @cask.get("/")
    def hello() = {
        "Hello, World!"
    }

    // Any additional routes can be defined here

    // Initialize the Cask server
    override def main(args: Array[String]): Unit = {
        super.main(args)
    }
}

// This is necessary for the fat JAR to identify the entry point
object Main {
    def main(args: Array[String]): Unit = {
        WebApp.main(args)
    }
}
