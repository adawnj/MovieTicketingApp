package com.example.user.service;

import java.util.List;

import com.example.user.entity.UserEntity;
import com.example.user.model.LoginDTO;
import com.example.user.model.LoginResponseDTO;
import com.example.user.model.RequestSignUp;
import com.example.user.model.UserDTO;

public interface UserService {

	List<UserDTO> getUserDetails(String userName);
	RequestSignUp registerUser(RequestSignUp requestSignup);
	String delete(String userName);
	UserEntity  validateUser(LoginDTO user) throws Exception;
	UserDTO updateUser(UserDTO user);
}