package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class GetProductComments {

    public static String url = "https://altashop-api.fly.dev/api/products/14482/comments";

    @Step("now user see the product")
    public String NowUserSeeTheProduct() {
        return url;
    }

    @Step("user want to see the comments")
    public void userWantToSeeTheComments() {
        SerenityRest.given().get(NowUserSeeTheProduct());
    }

    @Step("give Products comment responce")
    public void giveProductsCommentResponce() {
        restAssuredThat(response -> response.statusCode(200));
    }

}
