package lesson17;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TestLesson17 {
    private final String rawText = "This is expected to be sent back as part of response body.";

    @Test(description = "postman-echo-GET")
    public void testGetRequest() {
        Response response = given()
                .baseUri("https://postman-echo.com")
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .extract().response();

        response.then().statusCode(200);
        response.then().body("args.foo1", Matchers.equalTo("bar1"));
        response.then().body("args.foo2", Matchers.equalTo("bar2"));
    }

    @Test(description = "postman-echo-POST-raw-text")
    public void testPostRequestRawText() {
        Response response = given()
                .baseUri("https://postman-echo.com")
                .body(rawText)
                .when()
                .post("/post")
                .then()
                .extract().response();

        response.then().statusCode(200);
        String responseBody = response.body().jsonPath().getString("data");
        Assert.assertEquals(responseBody, rawText);
    }

    @Test(description = "postman-echo-POST-form-data")
    public void testPostRequestFromData() {
        Map<String, String> params = new HashMap<>();
        params.put("foo1", "bar1");
        params.put("foo2", "bar2");

        Response response = given()
                .baseUri("https://postman-echo.com")
                .contentType(ContentType.URLENC.withCharset("UTF-8"))
                .formParams(params)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .extract().response();
        response.then().body("form.foo1", Matchers.equalTo("bar1"));
        response.then().body("form.foo2", Matchers.equalTo("bar2"));
    }

    @Test(description = "postman-echo-PUT")
    public void testPutRequest() {
        Response response = given()
                .baseUri("https://postman-echo.com")
                .body(rawText)
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .extract().response();
        String responseData = response.jsonPath().getString("data");
        Assert.assertEquals(rawText, responseData);
    }

    @Test(description = "postman-echo-PATCH")
    public void testPatchRequest() {
        Response response = given()
                .baseUri("https://postman-echo.com")
                .body(rawText)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .extract().response();
        String responseData = response.jsonPath().getString("data");
        Assert.assertEquals(rawText, responseData);
    }

    @Test(description = "postman-echo-DELETE")
    public void testDeleteRequest() {
        Response response = given()
                .baseUri("https://postman-echo.com")
                .body(rawText)
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .extract().response();
        String responseData = response.jsonPath().getString("data");
        Assert.assertEquals(rawText, responseData);
    }
}