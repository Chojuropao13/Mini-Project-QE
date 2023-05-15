package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteAProduct {

    protected static String url = "https://altashop-api.fly.dev/api/products/14484";

    @Step("I set can DELETE data")
    public String iSetCanDELETEData() {
        return url;
    }

    @Step("I can set DELETE Http Request")
    public void iCanSetDELETEHttpRequest() {
        SerenityRest.given().delete(iSetCanDELETEData());
    }

    @Step("give Http code {int}")
    public void giveHttpCode() {
        restAssuredThat(response -> response.statusCode(404));
    }
















}
