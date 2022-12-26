package com.cgm.crud.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cgm.crud.dao.EmployeeDao;
import com.cgm.crud.dto.EmployeeDto;
import com.cgm.crud.entity.Employee;
import com.cgm.crud.form.CreateEmpForm;
import com.cgm.crud.service.EmployeeService;

@Transactional
@Service
public class EmployeeServicesImpl implements EmployeeService{
    @Autowired
    private EmployeeDao employeeDao;

    // add employee
    /**
     *<h2>addEmp</h2>
     *<p>
     *
     *</p>
     *
     *@param empFrom
     */
    public void addEmp(CreateEmpForm empFrom) {
        Employee emp = new Employee();
        emp.setName(empFrom.getName());
        emp.setDepartment(empFrom.getDepartment());
        emp.setAddress(empFrom.getAddress());
        emp.setSalary(empFrom.getSalary());
        employeeDao.addEmployee(emp);
    }

    // get all employee
    /**
     *<h2>getAllEmp</h2>
     *<p>
     *
     *</p>
     *
     *@return
     */
    public List<EmployeeDto> getAllEmp() {
        List<Employee> allEmp = employeeDao.getAllEmp();

        List<EmployeeDto> employee = new ArrayList<EmployeeDto>();
        for (Employee emp : allEmp) {
            EmployeeDto empDto = new EmployeeDto(emp);
            empDto.setId(emp.getId());
            empDto.setName(emp.getName());
            empDto.setDepartment(emp.getDepartment());
            empDto.setAddress(emp.getAddress());
            empDto.setSalary(emp.getSalary());
            // if condition
            employee.add(empDto);
        }

        return employee;
    }

    // get emp by id
    /**
     *<h2>getById</h2>
     *<p>
     *
     *</p>
     *
     *@param id
     *@return
     */
    public Employee getById(int id) {
        return employeeDao.getEmpById(id);
    }

    // update employee
    /**
     *<h2>updateEmp</h2>
     *<p>
     *
     *</p>
     *
     *@param emp
     */
    public void updateEmp(Employee emp) {
        employeeDao.updateEmp(emp);
    }

    // delete employee
    /**
     *<h2>deleteEmployee</h2>
     *<p>
     *
     *</p>
     *
     *@param id
     */
    public void deleteEmployee(int id) {
        employeeDao.deleteEmp(id);
    }
}
