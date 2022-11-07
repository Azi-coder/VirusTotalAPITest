package apiTests;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Test_4 {
    String apiKey = "e7f19ca21d76898500686385a2d934681460c77730edb17a59ce705b9cf3a7d4";

    @Test
    public void test_4(){
        HashMap<String,String> map1 = new HashMap<>();
        map1.put("verdict","harmless");
        HashMap<String,Object> map2 = new HashMap<>();
        map2.put("attributes",map1);
        map2.put("type","vote");
        HashMap<String,Object> map3 = new HashMap<>();
        map3.put("data",map2);

        given().
                header("x-apikey",apiKey).
                body(map3).
        when().
                post("https://www.virustotal.com/api/v3/domains/www.youtube.com/votes").
        then().
                statusCode(200).
                log().all();
    }
}
