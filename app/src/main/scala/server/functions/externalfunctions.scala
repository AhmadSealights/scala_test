package server.functions

object  externalfunctions{
    def second(s: String):String = {
        return s"$s second"
    }
    def caseclass(n: String,a: Int):String = {
        case class Person(name: String, age: Int)
        val person = Person(n, a)

        person match {
        case Person(name, age) => return(s"Name: $name, Age: $age")
        }
    }
}