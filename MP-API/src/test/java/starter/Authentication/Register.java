package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Register {

    public static String url = "https://altashop-api.fly.dev/api/auth/register";

    @Step("user on register")
    public String UserOnRegister() { return url; }

    @Step("user request register the end point")
    public void userRequestRegisterTheEndPoint() {
        SerenityRest.given().get(UserOnRegister());
    }

    @Step("user input information")
    public void UserInputInformation() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "MysticForce@mail.com");
        requestBody.put("password",123123);
        requestBody.put("fullname","Michael Ivan");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(UserOnRegister());


    }


    @Step("user success login and give response code")
    public void userSuccessLoginAndGiveResponseCode() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
