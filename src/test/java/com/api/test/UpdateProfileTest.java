package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagement;
import com.api.models.request.LoginRequest;
import com.api.models.request.Profilerequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserManagementResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {
	@Test(description="UpdateProfileTest ")
	public void UpdateProfileTestmethod()
	{
		AuthService authserviceobj = new AuthService();
		
		LoginRequest loginreqobj = new LoginRequest("jeevaniswagger","jeevani123@");
		Response responseobj = authserviceobj.login(loginreqobj);
		System.out.println(responseobj.asPrettyString());
		LoginResponse loginresponseobj = responseobj.as(LoginResponse.class);
		System.out.println(loginresponseobj.getToken());
		
		
		
		
		 Profilerequest profilereqobj =new Profilerequest.Builder().setEmail("jeeva3ar@gmail.com")
				.setFirstName("Jeevani").setLastName("Arun").setMobileNumber("7449105146").build();
		 
	
		
		UserManagement usermanagementobj = new UserManagement();
		responseobj = usermanagementobj.updateProfile(loginresponseobj.getToken(),profilereqobj);
		System.out.println(responseobj.asPrettyString());
		//UserManagementResponse usermanagementresponseobje = responseobj.as(UserManagementResponse.class);
		//System.out.println(usermanagementresponseobje.getUsername());
	}
	
}
