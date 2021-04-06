package api_basics;

public class Payload {
	public static String addPlacePayload() {
		return "{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Cohen house\",\r\n" + 
				"  \"phone_number\": \"(+91) 777 893 3937\",\r\n" + 
				"  \"address\": \"30, side layout, cohen 09\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"bags shop\",\r\n" + 
				"    \"shop\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://ankur.com\",\r\n" + 
				"  \"language\": \"French-IN\"\r\n" + 
				"}";
	}
}
