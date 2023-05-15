package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateNewProduct {

    public static String url = "https://altashop-api.fly.dev/api/products";



    @Step("I Want to post new user data")
    public String iWantToPostNewUserData() {
        return url;
    }

    @Step("I need Set POST Http request")
    public void NeedSetPostHttpRequest() {

        String body = "{\n" +
                "    \"name\":\"Sony PS5\",\n" +
                "    \"description\":\"play has no limits\",\n" +
                "    \"price\":299,\n" +
                "    \"categories\":[\n" +
                "        1\n" +
                "    ]\n" +
                "}";
        JSONObject requestBody = new JSONObject();
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iWantToPostNewUserData());





    }

        @Step("I got valid HTTP response code 201")
        public void iGotValidHTTPResponseCode201() {

            restAssuredThat(response -> response.statusCode(201));
        }

}
