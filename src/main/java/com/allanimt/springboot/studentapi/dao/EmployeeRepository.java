package com.allanimt.springboot.studentapi.dao;

import com.allanimt.springboot.studentapi.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
