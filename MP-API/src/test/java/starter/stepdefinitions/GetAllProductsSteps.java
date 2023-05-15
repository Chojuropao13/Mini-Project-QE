package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Products.Get_all_products;

public class GetAllProductsSteps {

    @Steps
    Get_all_products getAllProducts;


    @Given("I set Get Auth endpoint")
    public void ISetGetAuthEndpoint() {
        getAllProducts.ISetGetAuthEndPoint();
    }


    @When("I Set GET Http request")
    public void iSetGETHttpRequest() {
        getAllProducts.iSetGETHttpRequest();
    }

    @And("I receive valid data for detail all products")
    public void iReceiveValidDataForDetailAllProducts() {
        getAllProducts.iReceiveValidDataForDetailAllProducts();
    }

    @Then("I receive valid HTTP response code {int}")
    public void iReceiveValidHTTPResponseCode(int arg0) {
        getAllProducts.iReceiveValidHTTPResponseCode();
    }
}
