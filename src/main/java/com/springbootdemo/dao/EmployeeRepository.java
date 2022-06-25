package com.springbootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootdemo.entity.Employee;

// we can expose a different resource name
//@RespositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
