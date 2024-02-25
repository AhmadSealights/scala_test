package server.functions

object  externalfunctions{
    def second(s: String):String = {
        return s"$s second"
    }
    def caseclass(n: String,a: Int):String = {
        case class Person(name: String, age: Int)
        val person = Person(n, a)
        //These two methods are to get coverage of the methods inhereted by the product class
        val namefield = person.productElementNames.next()//returns "Name"
        val agefield=person.productElementName(0)// returns "Age"
        person match {
        case Person(name, age) => return(s"$namefield: $name, $agefield: $age")
        }
    }
}