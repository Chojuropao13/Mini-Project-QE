package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginSteps {


    @Steps
    LoginPage loginPage;

    @Given("user on login page")
    public void UserOnLoginPage () throws InterruptedException {
        loginPage.UserOnLoginPage();
    }

    @When("user input valid email")
    public void UserInputValidEmail() throws InterruptedException {
        loginPage.UserInputValidEmail("dragont032@gmail.com");
    }

    @And("user input valid password")
    public void UserInputValidPassword() throws InterruptedException {
        loginPage.UserInputValidPassword("lupamandi00!");
    }

    @And("click login")
    public void ClickLogin() throws InterruptedException {
        loginPage.ClickLogin();
    }

    @Then("user on product page")
    public void UserOnProductPage() throws InterruptedException{
        loginPage.UserOnProductPage();
    }

    @Given("user on page alta")
    public void UserOnPageAlta() throws InterruptedException {
        loginPage.UserOnPageAlta();
    }

    @When("user input email")
    public void UserInputEmail() throws InterruptedException {
        loginPage.UserInputEmail("lupamandi00!");
    }

    @And("user input password")
    public void UserInputPassword() throws InterruptedException {
        loginPage.UserInputPassword("dragont032@gmail.com");
    }

    @And("user click login")
    public void UserClickLogin() throws InterruptedException {
        loginPage.UserClickLogin();
    }

    @Then("user see product page")
    public void UserSeeProductPage() throws InterruptedException {
        loginPage.UserSeeProductPage();
        }
}
