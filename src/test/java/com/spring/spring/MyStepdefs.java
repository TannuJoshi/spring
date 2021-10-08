package com.spring.spring;

import com.spring.demo.FizzBuzz;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.jupiter.api.Assertions;

public class MyStepdefs {
    FizzBuzz fizzBuzz;
    String result;
    @Given("^Create a FizzBuzz game play$")
    public void createAFizzBuzzGamePlay() {
        fizzBuzz=new FizzBuzz();
    }

    @When("^I play with number (\\d+)$")
    public void iPlayWithNumber(int number) {
         result = fizzBuzz.play(number);
    }

    @Then("^The result is Fizz$")
    public void theResultIsFizz() {
        Assertions.assertEquals(result,"Fizz");
    }

    @Then("^The result is Buzz$")
    public void theResultIsBuzz() {
        Assertions.assertEquals(result,"Buzz");
    }

    @Then("^The result is FizzBuzz$")
    public void theResultIsFizzBuzz() {
        Assertions.assertEquals(result,"FizzBuzz");
    }
}
