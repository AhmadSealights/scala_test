package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Assert;

import java.io.IOException;

public class ApiTestSteps {

    private CloseableHttpClient httpClient;
    private CloseableHttpResponse response;

    @Given("The API server is running")
    public void the_api_server_is_running() {
        httpClient = HttpClients.createDefault();
        try {
            Thread.sleep(1000);// Sleep for 30 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Slept for 30 seconds!");
    }

    @When("I request {string}")
    public void i_request(String url) throws IOException {
        HttpGet request = new HttpGet(url);
        response = httpClient.execute(request);
    }

    @Then("The response status should be {int}")
    public void the_response_status_should_be(int statusCode) throws IOException {
        Assert.assertEquals(statusCode, response.getStatusLine().getStatusCode());
        response.close();
    }

    @Then("The response should be an error")
    public void the_response_should_be_an_error() throws IOException {
        Assert.assertNotEquals(200, response.getStatusLine().getStatusCode());
        response.close();
    }
    
    @Then("The second response status should be {string}")
    public void the_hello_response_status_should_be(String name) throws IOException {
        String m="Hello, " + name;
        String n=EntityUtils.toString(response.getEntity());
        Assert.assertEquals(m,n);
        response.close();
    }

}
