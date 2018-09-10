package com.deanhealth.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class StepDefinition {

    private Controller controller;
    private String results;

    @Given("the process is setup")
    public void assignVars() {
        controller = new Controller();
    }

    @When("the process is run")
    public void runProcess() {
        results = controller.helloWorld();
    }

    @Then("^I validate the \"([^\"]*)\"$")
    public void validateResult(String inputResult) {
        Assert.assertEquals(inputResult, results);
    }
}
