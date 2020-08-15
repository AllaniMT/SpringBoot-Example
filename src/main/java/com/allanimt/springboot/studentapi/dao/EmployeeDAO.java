package com.allanimt.springboot.studentapi.dao;

import com.allanimt.springboot.studentapi.entity.Employee;

import java.util.Collection;

public interface EmployeeDAO {
    Collection<Employee> getAllEmployees();

    Employee getEmployeeById(String id);

    void deleteEmployeeById(String id);

    void updateEmployee(Employee employee);

    void insertEmployeeToDB(Employee employee);
}
