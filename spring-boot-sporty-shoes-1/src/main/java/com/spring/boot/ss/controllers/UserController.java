package com.spring.boot.ss.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.ss.models.*;
import com.spring.boot.ss.services.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService service;
	
	// Save operation
    @PostMapping("/user")
    public User saveDepartment(
        @Validated @RequestBody User user)
    {
        return service.saveDepartment(user);
    }
  
    // Read operation
    @GetMapping("/user")
    public List<User> fetchDepartmentList()
    {
        return service.fetchDepartmentList();
        		}
  
    // Update operation
    @PutMapping("/user/{id}")
    public User
    updateUser(@RequestBody User user,
                     @PathVariable("id") Integer userID)
    {
        return service.updateDepartment(user, userID);
    }
  
    // Delete operation
    @DeleteMapping("/user/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                       Integer userID)
    {
        service.deleteUserById(
            userID);
  
        return "Deleted Successfully";
    }
}
