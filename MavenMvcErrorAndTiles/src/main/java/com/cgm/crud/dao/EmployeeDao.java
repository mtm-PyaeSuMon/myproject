package com.cgm.crud.dao;

import java.util.List;
import com.cgm.crud.entity.Employee;

/**
 *<h2>EmployeeDaoClass</h2>
 *<p>
 *Process for DisplayingEmployeeDao
 *</p>
 *
 * @author PyaeSuMon
 *
 */
public interface EmployeeDao {

    /**
     *<h2>addEmployee
     *<p>
     *
     *</p>
     *
     * @param emp
     *@return void
     */
    public void addEmployee(Employee emp);

    /**
     *<h2>getAllEmp
     *<p>
     *
     *</p>
     *
     * @return
     *@return List<Employee>
     */
    public List<Employee> getAllEmp();

    /**
     *<h2>getEmpById
     *<p>
     *
     *</p>
     *
     * @param id
     * @return
     *@return Employee
     */
    public Employee getEmpById(int id);

    /**
     *<h2>updateEmp
     *<p>
     *
     *</p>
     *
     * @param emp
     *@return void
     */
    public void updateEmp(Employee emp);

    /**
     *<h2>deleteEmp
     *<p>
     *
     *</p>
     *
     * @param id
     *@return void
     */
    public void deleteEmp(int id);
}
