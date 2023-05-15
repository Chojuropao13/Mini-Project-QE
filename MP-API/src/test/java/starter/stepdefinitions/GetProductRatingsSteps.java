package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Products.GetProductRatings;

public class GetProductRatingsSteps {

    @Steps
    GetProductRatings getProductRatings;


    @Given("user see the product")
    public void UserSeeTheProducts() {
        getProductRatings.UserSeeTheProducts();
    }


    @When("user give ratings for the products")
    public void userGiveRatingsForTheProducts() {
        getProductRatings.userGiveRatingsForTheProducts();
    }

    @And("users view product-related ratings")
    public void usersViewProductRelatedRatings() {
        getProductRatings.usersViewProductRelatedRatings();
    }

    @Then("give responce code {int}")
    public void giveResponceCode(int arg0) {
        getProductRatings.giveResponceCode();
    }
}
