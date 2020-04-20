package com.example.booking.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.booking.entity.UserEntity;

@Repository
@Transactional
public interface UserDAO extends JpaRepository<UserEntity, Integer> {

	UserEntity findByUserName(String userName);



}
