package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GetUserInformationSteps {

    @Steps
    GetAllProductsSteps getAllProductsSteps;

    @Given("user want to get information")
    public void UserWantToGetInformation() {}


    @When("user request HTTPS for information")
    public void userRequestHTTPSForInformation() {
    }

    @Then("the status code is {int}")
    public void theStatusCodeIs(int arg0) {
    }
}
