package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class Get_all_products {

    public static String url = "https://altashop-api.fly.dev/api/products";


    @Step("I set Get Auth endpoint")
    public String ISetGetAuthEndPoint() {
        return url + "products";
    }

    @Step("iSetGETHttpRequest")
    public void iSetGETHttpRequest() {
        SerenityRest.given().get(ISetGetAuthEndPoint());
    }

    @Step("iReceiveValidDataForDetailAllProducts")
    public void iReceiveValidDataForDetailAllProducts() {
        restAssuredThat(response -> response.log().all());

    }

    @Step("iReceiveValidHTTPResponseCode")
    public void iReceiveValidHTTPResponseCode() {
        restAssuredThat(response -> response.statusCode(200));
    }

}
