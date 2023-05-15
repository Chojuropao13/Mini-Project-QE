package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class login {

    protected static String url = "https://altashop-api.fly.dev/api/auth/login";

    @Step("user on login page")
    public String UserOnLoginPage() {
        return url  + "auth/login";
    }

    @Step("user request HTTPS")
    public void userRequestHTTPS() {

        String body = "{\n" +
                "    \"email\":\"MysticForce@mail.com\",\n" +
                "    \"password\":\"123123\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(UserOnLoginPage());


    }


    @Step("give the status code 200")
    public void giveTheStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }






}
