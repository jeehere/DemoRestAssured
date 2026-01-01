package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignupRequest;

import io.restassured.response.Response;

public class LoginAPITest4 {
	@Test(description="Verify if Signup API is working")
	public void CreateAccountTest()
	{
		 SignupRequest signupreqobj =new SignupRequest.Builderclass().setBPassword("jeevani@1234").setBEmail("jeevanswi@gmail.com").setBFirstName("kill").setBLastName("bill").setBMobileNumber("9878787098").setBUsername("odsiu6")
		.build();
		AuthService authservice = new AuthService();
		
		Response response =authservice.signup(signupreqobj);
		
		System.out.println(response.asPrettyString());
		//System.out.println(loginResponse.getToken());
		
		System.out.println(signupreqobj.getEmail());
		
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
		
	}
}
	