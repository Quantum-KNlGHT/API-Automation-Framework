package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPasswordTest {
	
	@Test(description = "Verify if forgotPassword API is working")
	void forgotPasswordTest() {
		AuthService authService = new AuthService();
		Response response = authService.forgotPassword("1shlokarubymine@gmail.com");
		System.out.println(response.asPrettyString());
	}

}
