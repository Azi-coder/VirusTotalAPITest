package apiTests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class Test_3 {
    String apiKey = "e7f19ca21d76898500686385a2d934681460c77730edb17a59ce705b9cf3a7d4";

    @Test
    public void test_3(){

        given().
                header("x-apikey",apiKey).
                formParam("url","https://www.youtube.com/").
        when().
                post("https://www.virustotal.com/api/v3/urls").
        then().

                statusCode(200).
                log().all();
    }

    @Test
    public void test_3_2(){
        given().
                header("x-apikey",apiKey).
        when().
                get("https://www.virustotal.com/api/v3/urls/dbae2d0204aa489e234eb2f903a0127b17c712386428cab12b86c5f68aa75867").
        then().
                statusCode(200).
                log().all();
    }
}
