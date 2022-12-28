package com.cgm.crud.form;

import javax.validation.constraints.NotEmpty;

import com.cgm.crud.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *<h2>CreateEmpFormClass</h2>
 *<p>
 *Process for DisplayingCreateEmpForm
 *</p>
 *
 * @author PyaeSuMon
 *
 */
@Data
@AllArgsConstructor
public class CreateEmpForm {
    /**
     *<h2>name</h2>
     *<p>
     *name
     *</p> 
     */
    @NotEmpty(message = "Name cannot be empty")
    private String name;
    
    /**
     *<h2>department</h2>
     *<p>
     *department
     *</p> 
     */
    @NotEmpty(message = "Department cannot be empty")
    private String department;
    
    /**
     *<h2>address</h2>
     *<p>
     *address
     *</p> 
     */
    @NotEmpty(message = "Address cannot be empty")
    private String address;
    
    //@NotEmpty(message = "Salary cannot be empty")
    /**
     *<h2>salary</h2>
     *<p>
     *salary
     *</p> 
     */
    private int salary;

    public CreateEmpForm() {
        super();
    }

    /**
     *<h2>Constructor for CreateEmpForm</h2>
     *<p>
     *Constructor for CreateEmpForm
     *</p>
     * @param emp
     */
    public CreateEmpForm(Employee emp) {
        this.name = emp.getName();
        this.department = emp.getDepartment();
        this.address = emp.getAddress();
        this.salary = emp.getSalary();
    }
}
