package apiTests;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Test_2 {
    String apiKey = "e7f19ca21d76898500686385a2d934681460c77730edb17a59ce705b9cf3a7d4";
    String ip = "192.168.1.20";

    @Test
    public void test_2() {

        /*
        //Daha önceki denemeler(başarısız)

        JSONObject object_1 = new JSONObject();
        object_1.put("text", "Malicioussss");
        JSONObject object_2 = new JSONObject();
        object_2.put("type", "comment");
        object_2.put("attributes", object_1.toJSONString());
        JSONObject object = new JSONObject();
        object.put("data",object_2.toJSONString());
        Map<String,String> map = new HashMap<String,String>();
        map.put("data",object_2.toJSONString());
        object = new JSONObject(map);
        */

        HashMap<String, String> map1 = new HashMap<String, String>();
        map1.put("text", "Maliciousseess");
        HashMap<String, Object> map2 = new HashMap<String, Object>();
        map2.put("type", "comment");
        map2.put("attributes", map1);
        HashMap<String, Object> map3 = new HashMap<String, Object>();
        map3.put("data", map2);

        System.out.println(map3);

        given()
                .header("x-apikey", apiKey)
                .body(map3).
                when().
                post("https://www.virustotal.com/api/v3/ip_addresses/" + ip + "/comments").
                then()
                .statusCode(200)
                .log().all();
    }
}
