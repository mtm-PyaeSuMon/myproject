package com.cgm.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.cgm.crud.form.CreateEmpForm;

import lombok.Getter;
import lombok.Setter;

/**
 *<h2>EmployeeClass</h2>
 *<p>
 *Process for DisplayingEmployee
 *</p>
 *
 * @author PyaeSuMon
 *
 */
@Getter
@Setter
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;
    private String email;
    private String password;
    private String type;
    private String department;
    private String address;
    private int salary;
    public Employee() {
        super();
    }
    /**
     *<h2>Constructor for Employee</h2>
     *<p>
     *Constructor for Employee
     *</p>
     * @param empForm
     */
    public Employee(CreateEmpForm empForm) {
        this.name = empForm.getName();
        this.email=empForm.getEmail();
        this.password=empForm.getPassword();
        this.type=empForm.getType();
        this.department = empForm.getDepartment();
        this.address = empForm.getAddress();
        this.salary = empForm.getSalary();
    }
}
