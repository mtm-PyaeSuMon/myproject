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
        super();
    }
}
