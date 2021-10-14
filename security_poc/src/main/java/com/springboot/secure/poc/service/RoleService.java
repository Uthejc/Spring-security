package com.springboot.secure.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.secure.poc.dao.RoleDao;
import com.springboot.secure.poc.entity.Role;

@Service
public class RoleService {

	@Autowired
	private  RoleDao roleDao;
	
	public Role createNewRole(Role role) {
		return roleDao.save(role);
	}
}
