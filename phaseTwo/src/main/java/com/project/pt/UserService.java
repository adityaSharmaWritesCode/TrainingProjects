package com.project.pt;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* TODO : 
 * login()
 * register()
 * updatePassword()
 * getAllUsers()
 * getUserById()
 * getAllPurchase()
 * getPurchaseReportByDat()
 * getPurchaseReportByCategory()
 * */

@Service
public class UserService {

	@Autowired
	UserRepository urepo;
	
	public String getUserByUsername(String username) {
		try {
			Optional<UserEntity> user = urepo.findByUsername(username);
			if(user.isPresent()) {
				return user.get().toString();
			} else {
				return "User does not exist.";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "Could not find user successfully. Try again.";
		}
	}

	public List<UserEntity> getAllUsers(){
		try {
			return urepo.findAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public String loginUser(UserEntity details) {
		try {
			Optional<UserEntity> user = urepo.findByUsername(details.getUsername());
			if(user.isPresent())
			{
				if(user.get().getPassword().equals(details.getPassword())) {
					return "Successfully logged in!";
				} else {
					return "Invalid Password.";
				}
			} else {
				return "Username does not exist.";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "Could not log in successfully. Try again.";
		}
	}
	
	public String registerUser(UserEntity details) {
		try {
			Optional<UserEntity> check = urepo.findByUsername(details.getUsername());
			if(check.isPresent())
				return "Username already exists.";
			urepo.save(details);
			return "Registered Successfully!";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "Could not register user successfully. Try again.";
		}
	}
	
	public String updatePassword(UserEntity details) {
		try {
			Optional<UserEntity> user = urepo.findByUsername(details.getUsername());
			if(!user.isPresent()) {
				return "Invalid Credentials";
			}
			user.get().setPassword(details.getPassword());
			urepo.save(user.get());
			return "Succesfully updated!";

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "Could not update password. Try again.";
		}
	}

//	public UserEntity getUserById(int id) {
//		try {
//			Optional<UserEntity> user = urepo.findById(id);
//			if(!user.isPresent()) {
//				System.out.println("No such user present");
//				return null;
//			}
//			return user.get();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			return null;
//		}
//	}

}
