package com.spring.boot.ss.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.ss.models.*;

public interface UserRepository extends JpaRepository<User,Integer> {
	
	
	

}
