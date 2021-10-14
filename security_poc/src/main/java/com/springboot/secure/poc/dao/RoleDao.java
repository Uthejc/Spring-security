package com.springboot.secure.poc.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.secure.poc.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
