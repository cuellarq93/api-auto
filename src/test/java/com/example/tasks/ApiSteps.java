package com.example.tasks;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsString;

public class ApiSteps {

    private String apiEndpoint;
    private Response response;

    @Step("Setting the API endpoint")
    public void setApiEndpoint() {
        apiEndpoint = System.getProperty("api.url");
    }

    @Step("Sending a GET request to the endpoint")
    public void sendGetRequest() {
        response = RestAssured.get(apiEndpoint);
    }

    @Step("Verifying the status code is 200")
    public void verifyStatusCode() {
        assertThat(response.getStatusCode(), equalTo(200));
    }

    @Step("Verifying the response contains 'Hello, World!'")
    public void verifyResponseBody() {
        assertThat(response.getBody().asString(), containsString("Hello, World!"));
    }
}

