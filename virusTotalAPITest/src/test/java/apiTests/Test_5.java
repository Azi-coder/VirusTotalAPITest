package apiTests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class Test_5 {
    String apiKey = "e7f19ca21d76898500686385a2d934681460c77730edb17a59ce705b9cf3a7d4";


    @Test
    public void test_5(){

        given().
                header("x-apikey",apiKey).

        when().
                get("https://www.virustotal.com/api/v3/domains/www.youtube.com/relationships/comment").
        then().
                statusCode(404).
                log().body();
    }
}
