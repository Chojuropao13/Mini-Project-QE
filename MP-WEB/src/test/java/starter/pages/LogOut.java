package starter.pages;

import io.cucumber.java.pa.ਜਦੋਂ;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LogOut extends PageObject  {

    private By emailfield() { return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input"); }

    private By password() { return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input"); }

    private By loginpage() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/button/span"); }


    private By icon() { return By.xpath("/html/body/div/div[1]/header/div/button[2]/span"); }

    private By out() { return By.xpath("/html/body/div/div[2]/div/div[2]/div[2]"); }





    @Step
    public void AUserOnLoginPage() throws InterruptedException {
        open();
        $(loginpage()).shouldBeVisible();
    }

    @Step
    public void aUserInputValidUsername(String email) throws InterruptedException {
        open();
        $(emailfield()).type(email);
        Thread.sleep(1000);
    }

    @Step
    public void aUserInputValidPassword(String password) throws InterruptedException {
        $(password()).type(password);
        Thread.sleep(2000);
    }

    @Step
    public void userClickBuutton() throws InterruptedException {
        $(loginpage()).click();
        Thread.sleep(2000);
    }

    @Step
    public void lookAtTheMenuLogOut() throws InterruptedException {
        $(icon()).click();
        Thread.sleep(2000);
    }

    @Step
    public void userClickToLogout() throws InterruptedException {
        $(out()).click();
        Thread.sleep(2000);
    }



}
