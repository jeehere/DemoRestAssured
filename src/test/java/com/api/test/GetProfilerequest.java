package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagement;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserManagementResponse;

import io.restassured.response.Response;

public class GetProfilerequest {
	@Test(description="Get profile works fine")
	public void GetProfilerequesttest() {
	
	LoginRequest loginrequestobj = new LoginRequest("jeevaniswagger","jeevani123@");
	AuthService authservobj = new AuthService();
	Response responseobj =authservobj.login(loginrequestobj);
	
	LoginResponse loginresponseobj = responseobj.as(LoginResponse.class);
	System.out.println(responseobj.asPrettyString());
	System.out.println("-----------------------------------------------------");
	
	UserManagement usermanagementobj = new UserManagement();
	responseobj = usermanagementobj.getProfile(loginresponseobj.getToken());
	//UserManagementResponse UserManagementResponseobj =responseobj.as(UserManagementResponse.class);
	//System.out.println(UserManagementResponseobj.getId());
	System.out.println(responseobj.asPrettyString());
	}
}
