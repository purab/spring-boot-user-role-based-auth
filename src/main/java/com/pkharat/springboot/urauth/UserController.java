package com.pkharat.springboot.urauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class UserController {
	
	
	
	@GetMapping("/")
	public String HomePage() {
		
		
		
		
		return "index";
	}

}
