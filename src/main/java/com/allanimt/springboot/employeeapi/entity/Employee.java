package com.allanimt.springboot.employeeapi.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Document(collection = "employees")
public class Employee {

    @Id
    private String id;

    @NotNull(message = "Name is required")
    @Size(min = 3, message = "Name must at least 3 character")
    private String name;

    @NotNull(message = "Location is required")
    @Size(min = 3, message = "Location must at least 3 character")
    private String location;

    public Employee(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
