package com.hcl.employee.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.employee.model.Employee;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
   
	@Autowired
	private SessionFactory ss;
	
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return ss.getCurrentSession().createQuery("from Employee").list();
	}

}
