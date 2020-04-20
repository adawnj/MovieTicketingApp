package com.example.booking.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user",schema="public")
public class UserEntity implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "userid")
	Integer userId;
	@Column(name="username",nullable = false)
	String userName;
	@Column(name="password", nullable = false)
	String password;
	@Column(name="phonenumber", nullable = false)
	long phoneNumber;
	@Column(name="emailid", nullable = false)
	String emailId;
	@Column(name="age", nullable = false)
	Integer age;
	@Column(name="role", nullable = false)
	String role;
	
	public UserEntity() {
		super();
	}

	public Integer getUserId() {
        return userId;
    }
    
	public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
    public long getPhoneNumber(){
	return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber){
	this.phoneNumber = phoneNumber;
    }
    public String getEmailId(){
	return emailId;
    }
    public void setEmailId(String emailId){
	this.emailId = emailId;
    }
    public Integer getAge(){
	return age;
    }
    public void setAge(Integer age){
	this.age = age; 
    } 
    public String getRole(){
	return role;
    }
    public void setRole(String role){
	this.role = role;
    }
}
