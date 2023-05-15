package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductRatings {

    public static String url = "https://altashop-api.fly.dev/api/products/14484";


    @Step("user see the product")
    public String UserSeeTheProducts() {
        return url ;
    }

    @Step("user give ratings for the products")
    public void userGiveRatingsForTheProducts() {
        SerenityRest.given().get(UserSeeTheProducts());
    }

    @Step("users view product-related ratings")
    public void usersViewProductRelatedRatings() {
        restAssuredThat(response -> response.log().all());
    }

    @Step("give responce code")
    public void giveResponceCode() {
        restAssuredThat(response -> response.statusCode(200));
    }















}
