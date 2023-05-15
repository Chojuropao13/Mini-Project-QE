package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Products.CreateACommentForProduct;

public class CreateACommentForProductSteps {


    @Steps
    CreateACommentForProduct createACommentForProduct;


    @Given("I Want to post new comment")
    public void IWantToPostNewComment() { createACommentForProduct.IWantToPostNewComment(); }

    @When("i was given a Http")
    public void iWasGivenAHttp() {
        createACommentForProduct.iWasGivenAHttp();
    }

    @Then("I got HTTP response code {int}")
    public void iGotHTTPResponseCode(int arg0) {
        createACommentForProduct.iGotHTTPResponseCode();
    }

}
