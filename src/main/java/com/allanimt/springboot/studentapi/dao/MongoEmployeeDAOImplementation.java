package com.allanimt.springboot.studentapi.dao;

import com.allanimt.springboot.studentapi.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
@Qualifier("MongoData")
public class MongoEmployeeDAOImplementation implements EmployeeDAO {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Collection<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(String id) {
        return employeeRepository.findById(id).get();
    }

    public void deleteEmployeeById(String id) {
        employeeRepository.deleteById(id);
    }

    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void insertEmployeeToDB(Employee employee) {
        employeeRepository.insert(employee);
    }
}
