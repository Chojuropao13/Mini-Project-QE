package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Products.GetProductComments;

public class GetProductCommentsSteps {

    @Steps
    GetProductComments getProductComments;


    @Given("now user see the product")
    public void NowUserSeeTheProducts() {getProductComments.NowUserSeeTheProduct(); }


    @When("user want to see the comments")
    public void userWantToSeeTheComments() {
        getProductComments.userWantToSeeTheComments();
    }

    @Then("give Products comment responce {int}")
    public void giveProductsCommentResponce(int arg0) {
        getProductComments.giveProductsCommentResponce();
    }
}
