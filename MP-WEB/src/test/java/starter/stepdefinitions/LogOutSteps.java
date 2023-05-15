package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LogOut;

public class LogOutSteps {

    @Steps
    LogOut logOut;


    @Given("a user on login page")
    public void AUserOnLoginPage() throws InterruptedException {
        logOut.AUserOnLoginPage();
    }


    @When("a user input valid username")
    public void aUserInputValidUsername() throws InterruptedException  {
        logOut.aUserInputValidUsername("dragont032@gmail.com");
    }

    @And("a user input valid password")
    public void aUserInputValidPassword() throws InterruptedException  {
        logOut.aUserInputValidPassword("lupamandi00!");
    }

    @And("user click buutton")
    public void userClickBuutton() throws InterruptedException  {
        logOut.userClickBuutton();
    }

    @And("look at the menu log out")
    public void lookAtTheMenuLogOut() throws InterruptedException  {
        logOut.lookAtTheMenuLogOut();
    }

    @Then("user click to logout")
    public void userClickToLogout() throws InterruptedException  {
        logOut.userClickToLogout();
    }
}
