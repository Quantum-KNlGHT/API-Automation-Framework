package com.api.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileRequestTest {
	
	@Test(description = "Verify if get profile api is working")
	public void getProfile() {
		AuthService authService = new AuthService();
		Response response= authService.login(new LoginRequest("test3146", "Test@123"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		String token = loginResponse.getToken();
		System.out.println("Token:" +token);
		
		
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		Response getProfileResponse = userProfileManagementService.getProfile(token);
		System.out.println(getProfileResponse.asPrettyString());
		Assert.assertEquals(getProfileResponse.statusCode(),200);
		
		UserProfileResponse userProfileResponse = getProfileResponse.as(UserProfileResponse.class);
		System.out.print(userProfileResponse.getEmail());
	
	}

}
