package com.springboot.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	//User validation
	public boolean userValidation(String userName, String password) {
 		return userName.equalsIgnoreCase("deeksha")
				&& password.equalsIgnoreCase("password");
	}

}

