package com.spring.boot.ss.services;

import java.util.List;

import com.spring.boot.ss.models.User;


public interface UserService {
	
	// Save operation
    User saveDepartment(User user);
  
    // Read operation
    List<User> fetchDepartmentList();
  
    // Update operation
    User updateDepartment(User user,
                                Integer UserID);
  
    // Delete operation
    void deleteUserById(Integer UserId);

}	
