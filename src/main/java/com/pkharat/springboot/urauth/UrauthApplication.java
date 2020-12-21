package com.pkharat.springboot.urauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.authentication.UserDetailsRepositoryReactiveAuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class UrauthApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(UrauthApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		try {
			User user = new User();		
			user.setUsername("purab");
			user.setPassword(passwordEncoder.encode("purab"));
			user.setEnabled(true);
			
			Role role = new Role("ADMIN");
			Role role1 = new Role("USER");		
			
			user.getRoles().add(role);
			user.getRoles().add(role1);
			
			//repo.save(user);
		 } catch (Exception e) {
	           throw new Exception( "internal saving error");
	     }
		
		
	}

	
	
}
