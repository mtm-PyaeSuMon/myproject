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
        super();
    }
}
