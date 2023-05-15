package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Products.DeleteAProduct;

public class DeleteAProductSteps {

    @Steps
    DeleteAProduct deleteAProduct;

    @Given("I set can DELETE data")
    public void iSetCanDELETEData() { deleteAProduct.iSetCanDELETEData(); }

    @When("I can set DELETE Http Request")
    public void iCanSetDELETEHttpRequest() {deleteAProduct.iCanSetDELETEHttpRequest(); }

    @Then("give Http code {int}")
    public void giveHttpCode(int arg0) {deleteAProduct.giveHttpCode(); }

















}
