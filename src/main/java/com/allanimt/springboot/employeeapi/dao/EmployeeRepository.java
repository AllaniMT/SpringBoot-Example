package com.allanimt.springboot.employeeapi.dao;

import com.allanimt.springboot.employeeapi.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
