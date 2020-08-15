package com.allanimt.springboot.employeeapi.dao;

import com.allanimt.springboot.employeeapi.entity.Employee;

import java.util.Collection;

public interface EmployeeDAO {
    Collection<Employee> getAllEmployees();

    Employee getEmployeeById(String id);

    void deleteEmployeeById(String id);

    void updateEmployee(Employee employee);

    void insertEmployeeToDB(Employee employee);
}
