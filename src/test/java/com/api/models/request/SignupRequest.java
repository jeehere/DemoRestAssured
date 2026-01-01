package com.api.models.request;

import java.util.List;

public class SignupRequest {
	private String password;
    public SignupRequest(String password, String firstName, String lastName, String username, String mobileNumber,
			String email) {
		super();
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}



	private String firstName;
    private String lastName;
    private String username;
    private String mobileNumber;
    private String email;
    @Override
	public String toString() {
		return "SignupRequest [password=" + password + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", username=" + username + ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
    
    
    public static class Builderclass{
    	private String password;
        
		public Builderclass setBPassword(String password) {
			this.password = password;
			return this;
		}
		
		public Builderclass setBFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public Builderclass setBLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public Builderclass setBUsername(String username) {
			this.username = username;
			return this;
		}
		
		public Builderclass setBMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
			return this;
		}
		
		public Builderclass setBEmail(String email) {
			this.email = email;
			return this;
		}
		private String firstName;
        private String lastName;
        private String username;
        private String mobileNumber;
        private String email;
        
        public SignupRequest build() {
        	
        	SignupRequest signupreqobj = new SignupRequest(password, firstName, lastName, username, mobileNumber, email);
        	return signupreqobj;
        }
        
    }

}
