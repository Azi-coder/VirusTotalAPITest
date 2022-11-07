package apiTests;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Test_6 {
    String apiKey = "e7f19ca21d76898500686385a2d934681460c77730edb17a59ce705b9cf3a7d4";
    String ip = "192.168.1.20";

    @Test
    public void test_6(){

        HashMap<String,String> map1 = new HashMap<String,String>();
        map1.put("verdict","harmless");
        HashMap<String,Object> map2 = new HashMap<String,Object>();
        map2.put("attributes",map1);
        map2.put("type","vote");
        HashMap<String,Object> map3 = new HashMap<String,Object>();
        map3.put("data",map2);

        given().
                header("x-apikey",apiKey).
                body(map3).
        when().
                post("https://www.virustotal.com/api/v3/domains/www.youtube.com/votes").
        then().
                statusCode(409).
                log().body();
    }
}
