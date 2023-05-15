package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.NegativeProduct;
import starter.pages.Product;

public class ProductSteps {

    @Steps
    Product product;

    @Steps
    NegativeProduct negativeProduct;


    @Given("as a user on homepage")
    public void AsAUserOnHomepage() throws InterruptedException {
        product.AsAUserOnHomepage();
    }

    @When("user input usernamee")
    public void UserInputUsernamee() throws InterruptedException {
        product.UserInputUsernamee("dragont032@gmail.com");
    }

    @And("user input passwordd")
    public void UserInputPasswordd() throws InterruptedException{
        product.UserInputPasswordd("lupamandi00!");
    }

    @And("clickk button")
    public void ClickkButton() throws InterruptedException {
        product.ClickkButton();
    }

    @And("user click product")
    public void UserClickProduct() throws InterruptedException {
        product.UserClickProduct();
    }

    @And("item goes to bucket")
    public void ItemGoesToBucket() throws InterruptedException {
        product.ItemGoesToBucket();
    }

    @And("i want to pay")
    public void IWantToPay() throws InterruptedException{
        product.IWantToPay();
    }

    @Then("I see all purchase transactions")
    public void ISeeAllPurchaseTrasactions() throws InterruptedException {
        product.ISeeAllPurchaseTrasactions();
    }

    @Given("as a user on homepagee")
    public void AsAUserOnHomePagee() throws InterruptedException {
        negativeProduct.AsAUserOnHomePagee();
    }

    @When("user inputt usernamee")
    public void UserInputtUsernamee() throws InterruptedException {
        negativeProduct.UserInputtUsernamee("dragont032@gmail.com");
    }

    @And("user inputt passwordd")
    public void UserInputtPasswordd() throws InterruptedException {
        negativeProduct.UserInputtPasswordd("lupamandi00!");
    }


    @And("clickk buttonn")
    public void clickkButtonn() throws InterruptedException {
        negativeProduct.clickkButtonn();
    }

    @And("user click productt")
    public void userClickProductt() throws InterruptedException {
        negativeProduct.userClickProductt();
    }

    @Then("item goes to buckett")
    public void itemGoesToBuckett() throws InterruptedException {
        negativeProduct.itemGoesToBuckett();
    }
}
