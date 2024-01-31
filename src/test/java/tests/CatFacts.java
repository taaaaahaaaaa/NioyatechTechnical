package tests;

import baseUrl.baseURL;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CatFacts extends baseURL {

    static Response response;

    @Test
    public void getAllFacts(){

        specification.pathParam(
                "factsPath", "facts");

        response = given()
                .spec(specification)
                .when()
                .get("{factsPath}");

        System.out.println("RESPONSE:");
        response.prettyPrint();
        response.then().assertThat().statusCode(200);
    }

    @Test
    public void getAFactRandomly(){

        specification.pathParam(
                "factPath", "fact");

        response = given()
                .spec(specification)
                .when()
                .get("{factPath}");

        System.out.println("RESPONSE:");
        response.prettyPrint();
        response.then().assertThat().statusCode(200);
    }
}
