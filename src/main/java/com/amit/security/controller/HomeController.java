package com.amit.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "<center><h1>Welcome..</h1><hr>http://localhost:8080/sigin</hr>"
				+ "<hr>http://localhost:8080/signup</hr>"
				+ "<h3>Public Access: </h3>http://localhost:8080/api/test/all"
				+ "<h3>User: </h3>http://localhost:8080/api/test/user"
				+ "<h3>Employee: </h3>http://localhost:8080/api/test/emp"
				+ "<h3>Admin: </h3>http://localhost:8080/api/test/admin";
	}
}
