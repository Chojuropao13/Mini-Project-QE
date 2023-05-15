package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class NegativeProduct extends PageObject {

    private By emailfield() { return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input"); }

    private By password() { return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input"); }

    private By loginpage() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/button/span"); }


    private By productku() {
        return By.xpath("Power Ranger Mystic Force");
    }

    private By buckets() { return By.xpath("/html/body/div/div/header/div/button[1]/span/span"); }



    @Step
    public void AsAUserOnHomePagee() throws InterruptedException {
        open();
        $(loginpage()).shouldBeVisible();
    }

    @Step
    public void UserInputtUsernamee(String email) throws InterruptedException {
        open();
        $(emailfield()).type(email);
        Thread.sleep(1000);
    }

    @Step
    public void UserInputtPasswordd(String password) throws InterruptedException {
        $(password()).type(password);
        Thread.sleep(1000);
    }

    @Step
    public void clickkButtonn() throws InterruptedException {
        $(loginpage()).click();
        Thread.sleep(1000);
    }

    @Step
    public void userClickProductt() throws InterruptedException {
        $(productku()).click();
        Thread.sleep(1000);
    }

    @Step
    public void itemGoesToBuckett() throws InterruptedException {
        $(buckets()).click();
        Thread.sleep(1000);
    }




}
