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
    /**
     *<h2>id</h2>
     *<p>
     *id
     *</p> 
     */
    private int id;
    /**
     *<h2>name</h2>
     *<p>
     *name
     *</p> 
     */
    private String name;
    /**
     *<h2>email</h2>
     *<p>
     *email
     *</p> 
     */
    private String email;
    /**
     *<h2>password</h2>
     *<p>
     *password
     *</p> 
     */
    private String password;
    /**
     *<h2>type</h2>
     *<p>
     *type
     *</p> 
     */
    private String type;
    /**
     *<h2>department</h2>
     *<p>
     *department
     *</p> 
     */
    private String department;
    /**
     *<h2>address</h2>
     *<p>
     *address
     *</p> 
     */
    private String address;
    /**
     *<h2>salary</h2>
     *<p>
     *salary
     *</p> 
     */
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

