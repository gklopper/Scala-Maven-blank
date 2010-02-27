package calculator

import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FlatSpec

@RunWith(classOf[JUnitRunner])
class CalculatorTest extends FlatSpec with ShouldMatchers {

  "The Calculator" should "add two numbers together" in {
    Calculator.add(5, 4) should equal (9)
  }
}