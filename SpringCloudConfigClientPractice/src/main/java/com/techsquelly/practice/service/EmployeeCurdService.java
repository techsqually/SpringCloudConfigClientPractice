package com.techsquelly.practice.service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.techsquelly.practice.dao.EmployeeCurdDao;
import com.techsquelly.practice.models.Employee;
@Service
public class EmployeeCurdService {

	@Autowired
	EmployeeCurdDao employeeCurdDao;
	public Employee createEmployee(){
		
		Employee emp12=employeeCurdDao.creatEmployeeAtDao();

		return emp12;
		
		
	}

}
