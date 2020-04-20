package com.example.user.model;

import com.example.user.entity.UserEntity;

public class UserDTO {

	private String userName;
	private long phoneNumber;
	private String emailId;
	private Integer age;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	} 
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public static UserDTO valueOf(UserEntity user) {
		// TODO Auto-generated method stub
		UserDTO userDTO = new UserDTO();
		userDTO.setUserName(user.getUserName());
		userDTO.setAge(user.getAge());
		userDTO.setEmailId(user.getEmailId());
		userDTO.setPhoneNumber(user.getPhoneNumber());
		userDTO.setPassword(user.getPassword());
		return userDTO;
	}
}
