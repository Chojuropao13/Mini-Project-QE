package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Authentication.login;

public class loginsteps {

    @Steps
    login login;


    @Given("user on login page")
    public void UserOnLoginPage() { login.UserOnLoginPage() ; }


    @When("user request HTTPS")
    public void userRequestHTTPS() { login.userRequestHTTPS();
    }

    @Then("give the status code 200")
    public void giveTheStatusCode() { login.giveTheStatusCode200();

    }
}
