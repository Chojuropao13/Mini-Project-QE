package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductById {

    protected static String url = "https://altashop-api.fly.dev/api/products/14484";


    @Step("I set Getid to get some data")
    public String SetGetidToGetSomeData() {
        return url;
    }

    @Step("I need Set GetId Http request")
    public void iNeedSetGetIdHttpRequest() {
        SerenityRest.given().get(SetGetidToGetSomeData());
    }

    @Step("I see Http response code {int}")
    public void iSeeHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

















}
