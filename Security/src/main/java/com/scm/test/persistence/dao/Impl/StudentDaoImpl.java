package com.scm.test.persistence.dao.Impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scm.test.persistence.dao.StudentDao;
import com.scm.test.persistence.entity.Student;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public void addStudent(Student student) {
		sessionFactory.getCurrentSession().save(student);
		
	}

	@Override
	public List<Student> getAllStudent() {
		Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Student", Student.class).list();
	}

	@Override
	public Student findByEmail(String email) {
		 	Session session = sessionFactory.getCurrentSession();
	        String userQuery = "SELECT s FROM Student s WHERE s.email = :email";
	        Query<Student> query = session.createQuery(userQuery, Student.class);
	        query.setParameter("email", email);
	        return query.uniqueResult();
	}

}
