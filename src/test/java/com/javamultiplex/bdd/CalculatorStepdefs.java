package com.javamultiplex.bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

/**
 * @author Rohit Agarwal on 22/08/20 5:49 pm
 * @copyright www.javamultiplex.com
 */
public class CalculatorStepdefs {
    private Calculator calculator;
    private int result;

    @Given("You have a calculator")
    public void yourHaveACalculator() {
        calculator=new Calculator();
    }

    @When("Operator is {string}, first number is {int} and second number is {int}")
    public void operatorIsFirstNumberIsAndSecondNumberIs(String operator, int number1, int number2) {
        result=calculator.calculate(operator.charAt(0),number1,number2);
    }

    @Then("The result is {int}")
    public void theResultIs(int output) {
        Assertions.assertEquals(output, result);
    }
}
