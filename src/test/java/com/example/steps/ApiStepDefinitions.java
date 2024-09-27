package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import com.example.tasks.ApiSteps;

public class ApiStepDefinitions {

    @Steps
    ApiSteps apiSteps;

    @Given("I set the API endpoint")
    public void iSetTheApiEndpoint() {
        apiSteps.setApiEndpoint();
    }

    @When("I send a GET request to the endpoint")
    public void iSendAGetRequestToTheEndpoint() {
        apiSteps.sendGetRequest();
    }

    @Then("I should receive a 200 status code")
    public void iShouldReceiveA200StatusCode() {
        apiSteps.verifyStatusCode();
    }

    @Then("the response body should contain {string} with {string}")
    public void theResponseBodyShouldContain(String key, String value) {
        apiSteps.verifyResponseBody();
    }
}
