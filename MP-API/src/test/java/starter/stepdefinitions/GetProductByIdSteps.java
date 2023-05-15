package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Products.GetProductById;

public class GetProductByIdSteps {

    @Steps
    GetProductById getProductById;

    @Given("I set Getid to get some data")
    public void SetGetidToGetSomeData() {
        getProductById.SetGetidToGetSomeData();
    }


    @When("I need Set GetId Http request")
    public void iNeedSetGetIdHttpRequest() {
        getProductById.iNeedSetGetIdHttpRequest();
    }

    @Then("I see Http response code {int}")
    public void iSeeHttpResponseCode200(int arg0) {
        getProductById.iSeeHttpResponseCode200();
    }












}
