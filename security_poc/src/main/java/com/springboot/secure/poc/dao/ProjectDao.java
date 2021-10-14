package com.springboot.secure.poc.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.secure.poc.entity.Project;
@Repository
public interface ProjectDao extends CrudRepository<Project, String> {

}
