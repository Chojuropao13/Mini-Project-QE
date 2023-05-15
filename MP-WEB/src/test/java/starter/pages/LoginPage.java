package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By emailfield() { return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input"); }

    private By password() { return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input"); }

    private By loginpage() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/button/span"); }

    private By product() {
        return By.xpath("/html/body/div/div");
    }


    @Step
    public void UserOnLoginPage () {
        open();
        $(loginpage()).shouldBeVisible();
    }

    @Step
    public void UserInputValidEmail(String email) throws InterruptedException {
        open();
        $(emailfield()).type(email);
        Thread.sleep(2000);
    }

    @Step
    public void UserInputValidPassword(String password) throws InterruptedException {
        $(password()).type(password);
        Thread.sleep(2000);
    }

    @Step
    public void ClickLogin() throws InterruptedException {
        $(loginpage()).click();
        Thread.sleep(2000);
    }

    @Step
    public void UserOnProductPage() throws InterruptedException {
        Thread.sleep(2000);
        $(product()).shouldBeVisible();

    }

    @Step
    public void UserOnPageAlta() throws InterruptedException {
        open();
        $(loginpage()).shouldBeVisible();
    }

    @Step
    public void UserInputEmail(String email) throws InterruptedException {
        open();
        $(emailfield()).type(email);
        Thread.sleep(1000);
    }

    @Step
    public void UserInputPassword(String password) throws InterruptedException {
        $(password()).type(password);
        Thread.sleep(1000);
    }

    @Step
    public void UserClickLogin() throws InterruptedException {
        $(loginpage()).click();
        Thread.sleep(1000);
    }

    @Step
    public void UserSeeProductPage() throws InterruptedException {
        Thread.sleep(2000);
        $(product()).shouldBeVisible();
    }
}
