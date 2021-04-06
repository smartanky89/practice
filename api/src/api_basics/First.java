package api_basics;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class First {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String responseString = given().queryParam("Key", "qaclick123").relaxedHTTPSValidation().header("Content-Type","application/json").body(Payload.addPlacePayload()).
		when().post("/maps/api/place/add/json").
		then().assertThat().statusCode(200).body("scope",equalTo("APP")).header("Server","Apache/2.4.18 (Ubuntu)").extract().asString();
		System.out.println(responseString);
		JsonPath js = new JsonPath(responseString);
		String placeId = js.getString("place_id");
		System.out.println(placeId);
	}

}
