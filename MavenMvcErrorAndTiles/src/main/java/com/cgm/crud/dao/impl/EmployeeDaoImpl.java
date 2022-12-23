package com.cgm.crud.dao.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cgm.crud.dao.EmployeeDao;
import com.cgm.crud.entity.Employee;

/**
 *<h2>EmployeeDaoImplClass</h2>
 *<p>
 *Process for DisplayingEmployeeDaoImpl
 *</p>
 *
 * @author PyaeSuMon
 *
 */
@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private HibernateTemplate hiberneteTemplate;

    @Autowired
    private SessionFactory sessionFactory;

    // add employee
    /**
     *<h2>addEmployee</h2>
     *<p>
     *
     *</p>
     *
     *@param emp
     */
    @Override
    public void addEmployee(Employee emp) {
        sessionFactory.getCurrentSession().save(emp);
    }

    // get all employee
    @Override
    public List<Employee> getAllEmp() {
        return hiberneteTemplate.loadAll(Employee.class);
    }

    // get employee by id
    /**
     *<h2>getEmpById</h2>
     *<p>
     *
     *</p>
     *
     *@param id
     *@return
     */
    @Override
    public Employee getEmpById(int id) {
        Employee emp = hiberneteTemplate.get(Employee.class, id);
        return emp;
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
    @Override
    public void updateEmp(Employee emp) {
        hiberneteTemplate.update(emp);
    }

    // delete employee
    /**
     *<h2>deleteEmp</h2>
     *<p>
     *
     *</p>
     *
     *@param id
     */
    @Override
    public void deleteEmp(int id) {
        hiberneteTemplate.delete(hiberneteTemplate.load(Employee.class, id));
    }
}
