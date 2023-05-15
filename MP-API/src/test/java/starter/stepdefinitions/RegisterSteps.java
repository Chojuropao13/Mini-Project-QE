package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Authentication.Register;

public class RegisterSteps {

    @Steps
    Register register;

    @Given("user on register")
    public void UserOnRegister() {
        register.UserOnRegister();
    }


    @When("user request register the end point")
    public void userRequestRegisterTheEndPoint() {
        register.userRequestRegisterTheEndPoint();
    }

    @And("user input information")
    public void UserInputInformation() {
        register.UserInputInformation();

    }


    @Then("user success login and give response code 200")
    public void userSuccessLoginAndGiveResponseCode200() {
        register.userSuccessLoginAndGiveResponseCode();
    }
}
