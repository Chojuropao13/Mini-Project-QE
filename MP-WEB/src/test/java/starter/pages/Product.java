package starter.pages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class Product extends PageObject  {

    private By emailfield() { return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[1]/div/div[1]/div/input"); }

    private By password() { return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[2]/div/div[1]/div/input"); }

    private By loginpage() {
        return By.xpath("/html/body/div/div/main/div/div/div/div[2]/form/div[3]/button/span"); }

    private By product() {
        return By.xpath("/html/body/div/div/main/div/div/div[2]/div/div[1]/div/div[3]/div[2]/button[2]");
    }

    private By buckets() { return By.xpath("/html/body/div/div/header/div/button[1]/span/span"); }

    private By bayar() { return By.xpath("/html/body/div/div/main/div/div/div[2]/button"); }

    private By transaksi() { return By.xpath("/html/body/div/div/main/div"); }


    @Step
    public void AsAUserOnHomepage() throws InterruptedException {
        open();
        $(loginpage()).shouldBeVisible();
    }

    @Step
    public void UserInputUsernamee(String email) throws InterruptedException {
        open();
        $(emailfield()).type(email);
        Thread.sleep(1000);
    }

    @Step
    public void UserInputPasswordd(String password) throws InterruptedException {
        $(password()).type(password);
        Thread.sleep(1000);
    }

    @Step
    public void ClickkButton() throws InterruptedException {
        $(loginpage()).click();
        Thread.sleep(1000);
    }

    @Step
    public void UserClickProduct() throws InterruptedException {
        $(product()).click();
        Thread.sleep(1000);
    }

    @Step
    public void ItemGoesToBucket() throws InterruptedException {
        $(buckets()).click();
        Thread.sleep(1000);
    }

    @Step
    public void IWantToPay() throws InterruptedException {
        $(bayar()).click();
        Thread.sleep(1000);
    }


    @Step
    public void ISeeAllPurchaseTrasactions() throws InterruptedException {
        $(transaksi()).shouldBeVisible();
        Thread.sleep(2000);
    }
}
