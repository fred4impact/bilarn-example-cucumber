package com.bilarn.cucumber;

import Pojo.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {

    private int x;
    private int y;
    private int sum;


    @Given("x={int}")
    public void x(Integer int1) {
        x = int1;
    }

    @Given("y={int}")
    public void y(Integer int1) {

        y = int1;
    }

    @When("I add up x and y")
    public void i_add_up_x_and_y() {

        Calculator calc = new Calculator();
          sum = calc.add(x,y);
    }

    @Then("I should get result as {int}")
    public void i_should_get_result_as(Integer int1) {

        assertEquals(int1, sum);

    }



}
