package apiTests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Test_1 {
    String apiKey = "e7f19ca21d76898500686385a2d934681460c77730edb17a59ce705b9cf3a7d4";
    String ip = "192.168.1.20";

    @Test
    public void test_Step_1() {
        baseURI = "https://www.virustotal.com/api";
        given().
                header("x_apikey", apiKey).when().get("/v3/ip_addresses/" + ip).
        then().
                statusCode(200)
                .body("data.attributes.last_analysis_stats.malicious", equalTo(0))
                .log().all();
    }
}


