package com.cgm.crud.dto;

import com.cgm.crud.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *<h2>EmployeeDtoClass</h2>
 *<p>
 *Process for DisplayingEmployeeDto
 *</p>
 *
 * @author PyaeSuMon
 *
 */
@AllArgsConstructor
@Data
public class EmployeeDto {
    private int id;
    private String name;
    private String email;
    private String password;
    private String type;
    private String department;
    private String address;
    private int salary;

    /**
     *<h2>Constructor for EmployeeDto</h2>
     *<p>
     *Constructor for EmployeeDto
     *</p>
     * @param emp
     */
    public EmployeeDto(Employee emp) {
        if (emp == null) {
            emp = new Employee();
        }
        this.id = emp.getId();
        this.name = emp.getName();
        this.email = emp.getEmail();
        this.password = emp.getPassword();
        this.type = emp.getType();
        this.department = emp.getDepartment();
        this.address = emp.getAddress();
        this.salary = emp.getSalary();
    }
}

