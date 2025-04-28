package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

@Listeners(com.api.listeners.TestListener.class)
public class LoginAPITest3 {
	
	@Test(description = "Verify if the login API is working")
	void loginTest() {
		LoginRequest loginRequest = new LoginRequest("string", "string");
		AuthService authService = new AuthService();
		//Response response = authService.login("{\"username\": \"string\",  \"password\": \"string\"}");
		Response response = authService.login(loginRequest);
		
		//Assert.assertEquals(response.getStatusCode(), 200);
		
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.getType());
		System.out.println(loginResponse.getId());
		System.out.println(loginResponse.getUsername());
		System.out.println(loginResponse.getEmail());
		System.out.println(loginResponse.getRoles());
		
		Assert.assertTrue(loginResponse.getToken() != null);
		Assert.assertEquals(loginResponse.getType(), "Bearer");
		Assert.assertEquals(loginResponse.getId(), 38);
		Assert.assertEquals(loginResponse.getUsername(), "string");
		Assert.assertEquals(loginResponse.getEmail(), "bac@gmail.com");
		Assert.assertTrue(loginResponse.getRoles() != null);
		


		
		
	}

}
