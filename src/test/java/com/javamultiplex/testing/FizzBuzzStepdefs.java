package com.javamultiplex.testing;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

/**
 * @author Rohit Agarwal on 22/08/20 5:14 pm
 * @copyright www.javamultiplex.com
 */
public class FizzBuzzStepdefs {
    private FizzBuzz fizzBuzz;
    private String result;
    @Given("Create a FizzBuzz Game Play")
    public void createAFizzBuzzGamePlay() {
        fizzBuzz=new FizzBuzz();
    }

    @When("I play with number {int}")
    public void iPlayWithNumber(int number) {
        result = fizzBuzz.play(number);
    }

    @Then("The result is {string}")
    public void theResultIs(String resultString) {
        Assertions.assertEquals(resultString,result);
    }
}
