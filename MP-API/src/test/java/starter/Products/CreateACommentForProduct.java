package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateACommentForProduct {


    public static String url = "https://altashop-api.fly.dev/api/products/14482/comments";

    @Step("I Want to post new comment")
    public String IWantToPostNewComment() {
        return url ;
    }

    @Step("i was given a Http")
    public void iWasGivenAHttp() {
        SerenityRest.given().get(IWantToPostNewComment());
    }

    @Step("I got HTTP response code")
    public void iGotHTTPResponseCode() {
        restAssuredThat(response -> response.statusCode(200));
    }

}
