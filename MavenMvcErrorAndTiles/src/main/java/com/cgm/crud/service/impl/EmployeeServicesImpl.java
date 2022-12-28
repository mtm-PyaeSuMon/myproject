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
import com.cgm.crud.service.EmployeeServices;

/**
 *<h2>EmployeeServicesImplClass</h2>
 *<p>
 *Process for DisplayingEmployeeServicesImpl
 *</p>
 *
 * @author PyaeSuMon
 *
 */
@Transactional
@Service
public class EmployeeServicesImpl implements EmployeeServices {
    @Autowired
    private EmployeeDao employeeDao;

    /**
     *<h2>addEmp</h2>
     *<p>
     *
     *</p>
     *
     *@param empFrom
     */
    @Override
    public void addEmp(CreateEmpForm empFrom) {
        Employee emp = new Employee();
        emp.setName(empFrom.getName());
        emp.setDepartment(empFrom.getDepartment());
        emp.setAddress(empFrom.getAddress());
        emp.setSalary(empFrom.getSalary());
        employeeDao.addEmployee(emp);
    }

    /**
     *<h2>getAllEmp</h2>
     *<p>
     *
     *</p>
     *
     *@return
     */
    @Override
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
            employee.add(empDto);
        }

        return employee;
    }

    /**
     *<h2>getById</h2>
     *<p>
     *
     *</p>
     *
     *@param id
     *@return
     */
    @Override
    public Employee getById(int id) {
        return employeeDao.getEmpById(id);
    }

    /**
     *<h2>updateEmp</h2>
     *<p>
     *
     *</p>
     *
     *@param emp
     */
    @Override
    public void updateEmp(Employee emp) {
        employeeDao.updateEmp(emp);
    }

    /**
     *<h2>deleteEmployee</h2>
     *<p>
     *
     *</p>
     *
     *@param id
     */
    @Override
    public void deleteEmployee(int id) {
        employeeDao.deleteEmp(id);
    }
}
