package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

//import static io.restassured.RestAssured.*;


public class LoginAPITest {
	
	@Test(description = "Verify if the login API is working")
	public void loginTest() {
		Response response = given().baseUri("http://64.227.160.186:8080")
				.header("Content-Type","application/json")
				.body("{\"username\": \"string\",  \"password\": \"string\"}")
				.post("/api/auth/login");
		
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.statusCode(), 200);
	}
	
	@Test(description = "Verify if the reqres GET API is working")
	public void reqresTest() {
		//RestAssured.baseURI = "https://reqres.in"; 
		//baseURI = "https://reqres.in";
		//Response response = RestAssured.given().queryParam("page", "2")
		Response response = given().baseUri("https://reqres.in")
				.queryParam("page", "2")
				.when().get("api/users");
		//.then().assertThat().statusCode(200);
		
		//System.out.println(response.asPrettyString());
		Assert.assertEquals(response.statusCode(),200);
		
		
	}
	
}
