package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest {
	
	@Test(description = "Verify if SignUp API is working")
	public void createAccount() {
		SignUpRequest signUpRequest = new SignUpRequest.Builder().email("1shlokarubymine@gmail.com")
				.userName("test3146")
				.firstName("test")
				.lastName("testing")
				.password("Test@123")
				.mobileNumber("7456283624").build();
		
		AuthService authService = new AuthService();
		Response response = authService.signup(signUpRequest);
		
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
		
		
	}

}
