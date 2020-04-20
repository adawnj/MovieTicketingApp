package com.example.user.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.dao.UserDAO;
import com.example.user.entity.UserEntity;
import com.example.user.model.LoginDTO;
import com.example.user.model.LoginResponseDTO;
import com.example.user.model.RequestSignUp;
import com.example.user.model.UserDTO;

@Service
public class UserServicelmpl implements UserService {

	@Autowired
	UserDAO userDAO;

	Logger logger = LoggerFactory.getLogger(this.getClass());
	public List<UserDTO> getUserDetails(String userName) {
		logger.info("Calldetails request for customer {}", userName);
		UserEntity userEntity = userDAO.findByUserName(userName);
		List<UserDTO> userDTO = new ArrayList<UserDTO>();
		userDTO.add(UserDTO.valueOf(userEntity));
		return userDTO;
	}
	
	public RequestSignUp registerUser(RequestSignUp user) {
		UserEntity user1 = new UserEntity();
		if (user.getPassword().equals(user.getConformPassword())) {
			user1.setUserName(user.getUserName());
			user1.setPhoneNumber(user.getPhoneNumber());
			user1.setEmailId(user.getEmailId());
			user1.setAge(user.getAge());
			user1.setPassword(user.getPassword());
			user1.setRole("User");
			userDAO.save(user1);
		}
		else {
			user=null;
		}	
		return user;
	}
	
	public String delete(String userName) {
		String message = null;
		UserEntity user1 = new UserEntity();
		user1 = userDAO.findByUserName(userName);
		if ( user1.getUserName().equals(userName)){
			message = user1.getUserName() + " has been deleted successfully";
			userDAO.delete(user1);	
		}
		return message;

	}
	
	@Override
	public UserEntity validateUser(LoginDTO user) throws Exception {
		UserEntity login = null;
        UserEntity user1=userDAO.findByUserName(user.getUserName());
        if(user1.getPassword().equals(user.getPassword())){
        login = user1;
        }
        
        else {
        	login = null;
        }
       return login;
	}
	

	public UserDTO updateUser(UserDTO user) {
		UserEntity user1 = new UserEntity();
		user1 = userDAO.findByUserName(user.getUserName());
		user1.setUserName(user.getUserName());
		user1.setPassword(user.getPassword());
		user1.setPhoneNumber(user.getPhoneNumber());
		user1.setEmailId(user.getEmailId());
		user1.setAge(user.getAge());
		user1.setRole("User");
		userDAO.save(user1);
		return user;
	}

}

