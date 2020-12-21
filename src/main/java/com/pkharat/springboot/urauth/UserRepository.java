package com.pkharat.springboot.urauth;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	@Query("Select u from User u WHERE u.username = :username")
	public User getUserByUsername(@Param("username") String username);

}
