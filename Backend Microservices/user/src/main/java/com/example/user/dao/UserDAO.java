package com.example.user.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.entity.UserEntity;
import com.example.user.model.RequestSignUp;

@Repository
@Transactional
public interface UserDAO extends JpaRepository<UserEntity, Integer> {

	UserEntity findByUserName(String userName);
	UserEntity findByUserId(Integer userId);
	
}
