package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignupRequest;

import io.restassured.response.Response;

public class Forgotpassword {
	@Test(description="Verify if Signup API is working")
	public void CreateAccountTest()
	{
		
		AuthService authservice = new AuthService();
		
		Response response =authservice.forgotPassword("jeeva@gmail.com");
		
		System.out.println(response.asPrettyString());
		//System.out.println(loginResponse.getToken());
		
		//System.out.println(signupreqobj.getEmail());
		
		//Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
		
	}
}
	