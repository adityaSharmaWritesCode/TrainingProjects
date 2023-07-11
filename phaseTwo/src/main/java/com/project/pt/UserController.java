package com.project.pt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Admin APIs : 

// 1. Products	
// 2. [READ ONLY] Users
// 3. [READ ONLY] Transactions
// 4. Login, Password Change

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService us;
	
	@GetMapping("/get")
	public String getUserByUsername(@RequestParam String username) {
		return us.getUserByUsername(username);
	}
	
	@GetMapping("/get/all")
	public List<UserEntity> getAllUsers(){
		return us.getAllUsers();
	}
	
	@GetMapping("/login")
	public String login(@RequestBody UserEntity user) {
		return us.loginUser(user);
	}
	
	@PostMapping("/register")
	public String register(@RequestBody UserEntity user) {
		return us.registerUser(user);
	}
	
	@PostMapping("/update")
	public String updatePassword(@RequestBody UserEntity user) {
		return us.updatePassword(user);
	}
}
