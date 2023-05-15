package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Products.CreateNewProduct;

public class CreateNewProductSteps {

    @Steps
    CreateNewProduct createNewProduct;


    @Given("I Want to post new user data")
    public void IWantToPostNewUserData() {
        createNewProduct.iWantToPostNewUserData();
    }

    @When("I need Set POST Http request")
    public void NeedSetPostHttpRequest() {
        createNewProduct.NeedSetPostHttpRequest();
    }

    @Then("I got valid HTTP response code {int}")
    public void iGotValidHTTPResponseCode201(int arg0) {
        createNewProduct.iGotValidHTTPResponseCode201();
    }



}
