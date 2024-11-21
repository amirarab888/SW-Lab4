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
    private String errorMessage;

    @Before
    public void before() {
        calculator = new Calculator();
        errorMessage = null;
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

    @Then("I expect the result {double} for add")
    public void iExpectTheResult(double arg0) {
        Assert.assertEquals(arg0, result, 0.1);
    }

    @When("I multiple the two values")
    public void iMultipleTheTwoValues() {
        result = calculator.mul(value1, value2);
    }

    @Then("I expect the result {double} for mul")
    public void iExpectTheResultForMul(double arg0) {
        Assert.assertEquals(arg0, result, 0.1);
    }

    @Given("Two input values for division, {double} and {double}")
    public void givenTwoInputValuesForDivision(double arg0, double arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("I divide the two values")
    public void whenIDivideTheTwoValues() {
        try {
            result = calculator.divide(value1, value2);
            errorMessage = null;
        } catch (ArithmeticException e) {
            errorMessage = e.getMessage();
        }
    }

    @Then("the division result should be {double}")
    public void thenTheDivisionResultShouldBe(double expected) {
        Assert.assertNull("Expected numeric result but got error: " + errorMessage, errorMessage);
        Assert.assertEquals(expected, result, 0.0001);
    }

    @Then("division should give error {string}")
    public void thenDivisionShouldGiveError(String expectedError) {
        Assert.assertNotNull("Expected error message but got numeric result: " + result, errorMessage);
        Assert.assertEquals(expectedError, errorMessage);
    }
}