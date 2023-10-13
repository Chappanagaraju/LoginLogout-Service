package com.springboot.LoginLogoutService.service;

import org.springframework.stereotype.Service;

@Service
public class LogingService {
 public boolean validateUser(String userid, String password) {
	return userid.equalsIgnoreCase("admin")
			&& password.equalsIgnoreCase("password");
	 
 }
}
