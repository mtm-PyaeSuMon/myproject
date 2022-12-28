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

    /**
     *<h2>id</h2>
     *<p>
     *id
     *</p> 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
        this.department = empForm.getDepartment();
        this.address = empForm.getAddress();
        this.salary = empForm.getSalary();
    }
}
