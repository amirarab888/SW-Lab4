import org.example.Calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;

import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private double value1;
    private double value2;
    private double result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("Two input values, {double} and {double}")
    public void twoInputValuesAnd(double arg0, double arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("I add the two values")
    public void iAddTheTwoValues() {
        result = calculator.add(value1, value2);
    }

    @Then("I expect the result {double}")
    public void iExpectTheResult(double arg0) {
        Assert.assertEquals(arg0, result, 0.1);
    }
}
