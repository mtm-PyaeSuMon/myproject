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
    
    /**
     *<h2>hiberneteTemplate</h2>
     *<p>
     *hiberneteTemplate
     *</p> 
     */
    @Autowired
    private HibernateTemplate hiberneteTemplate;

    /**
     *<h2>sessionFactory</h2>
     *<p>
     *sessionFactory
     *</p> 
     */
    @Autowired
    private SessionFactory sessionFactory;
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
    
    @Override
    public List<Employee> getAllEmp() {
        return hiberneteTemplate.loadAll(Employee.class);
    }
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
