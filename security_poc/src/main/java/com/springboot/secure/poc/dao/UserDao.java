package com.springboot.secure.poc.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.secure.poc.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String>{

	
}
