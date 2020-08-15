package com.allanimt.springboot.employeeapi.service;

import com.allanimt.springboot.employeeapi.dao.MongoEmployeeDAOImplementation;
import com.allanimt.springboot.employeeapi.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EmployeeService {

    @Autowired
    private MongoEmployeeDAOImplementation mongoEmployeeDAOImplementation;

    /*
    @Autowired
    @Qualifier("fakeData")
    @Qualifier("MongoData")
    private EmployeeDAO employeeDAO;
    */

    public Collection<Employee> fetchAllEmployees() {
        return this.mongoEmployeeDAOImplementation.getAllEmployees();
    }

    //hier kommt filter
    public Employee fetchEmployeebyId(String id) {
        return this.mongoEmployeeDAOImplementation.getEmployeeById(id);
    }

    public void removeEmployeeById(String id) {
        this.mongoEmployeeDAOImplementation.deleteEmployeeById(id);
    }

    public void updateEmployee(Employee employee) {
        this.mongoEmployeeDAOImplementation.updateEmployee(employee);
    }

    public void insertEmployeeToDB(Employee employee) {
        this.mongoEmployeeDAOImplementation.insertEmployeeToDB(employee);
    }

}
