package com.allanimt.springboot.studentapi.dao;

import com.allanimt.springboot.studentapi.entity.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//@Repository
//@Qualifier("fakeData")

//This class is just for test (Without using any DB)
public class FakeEmployeeDAOImplementation implements EmployeeDAO {


    private static Map<Integer, Employee> employees;

    static {
        employees = new HashMap<Integer, Employee>() {

            {
                put(1, new Employee("1", "Mohamed", "Frankfut"));
                put(2, new Employee("2", "Allani", "Essen"));
                put(3, new Employee("3", "Tayeb", "Muenschen"));
            }
        };
    }

    @Override
    public Collection<Employee> getAllEmployees() {
        return this.employees.values();
    }

    @Override
    public Employee getEmployeeById(String id) {
        return this.employees.get(id);
    }

    @Override
    public void deleteEmployeeById(String id) {
        this.employees.remove(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        Employee theModifiedEmployee = employees.get(employee.getId());

        theModifiedEmployee.setName(employee.getName());
        theModifiedEmployee.setLocation(employee.getLocation());

        this.employees.put(Integer.parseInt(employee.getId()), employee);
    }

    @Override
    public void insertEmployeeToDB(Employee employee) {
        this.employees.put(Integer.parseInt(employee.getId()), employee);
    }
}
