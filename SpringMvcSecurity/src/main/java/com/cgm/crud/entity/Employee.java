package com.cgm.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.cgm.crud.form.CreateEmpForm;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String name;
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
        this.department = empForm.getDepartment();
        this.address = empForm.getAddress();
        this.salary = empForm.getSalary();
    }
}
