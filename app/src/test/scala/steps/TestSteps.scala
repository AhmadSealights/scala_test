package steps;

import io.cucumber.scala.{EN, ScalaDsl}
import server.functions.externalfunctions
import server.functions.internalfunctions

class CombineStringsSteps extends ScalaDsl with EN {

  var result: String = _

  Given("""Wait for a bit""") { () =>
    Thread.sleep(3000);
  }

  When("""Request func second with {string}""") { (req: String) =>
    result = externalfunctions.second(req)
  }

  When("""Request func traitexample""") { () =>
    result = internalfunctions.traitexample()
  }

  Then("""the result should be {string}""") { (expectedResult: String) =>
    System.out.println(s"The result is $result")
    assert(result == expectedResult);
  }
}
