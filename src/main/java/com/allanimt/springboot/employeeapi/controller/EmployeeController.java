package com.allanimt.springboot.employeeapi.controller;

import com.allanimt.springboot.employeeapi.entity.Employee;
import com.allanimt.springboot.employeeapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService studentService;


    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public Collection<Employee> bringAllEmployees() {
        return this.studentService.fetchAllEmployees();
    }

    @RequestMapping(value = {"/{EmployeeId}"}, method = RequestMethod.GET)
    public Employee bringEmployeeById(@PathVariable("EmployeeId") String id) {
        return this.studentService.fetchEmployeebyId(id);
    }


    @RequestMapping(value = {"/{EmployeeId}"}, method = RequestMethod.DELETE)
    public void deleteEmployeeById(@PathVariable("EmployeeId") String id) {
        this.studentService.removeEmployeeById(id);
    }


    @RequestMapping(value = {"", "/"}, method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateTheEmployee(@RequestBody Employee employee) {
        this.studentService.updateEmployee(employee);
    }


    @RequestMapping(value = {"", "/"}, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void inesertEmployee(@Valid @RequestBody Employee employee) {
        this.studentService.insertEmployeeToDB(employee);
    }
}
