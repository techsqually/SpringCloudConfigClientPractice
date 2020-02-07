package com.techsquelly.practice.dao;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;

import com.techsquelly.practice.models.Employee;
@Component
public class EmployeeCurdDao {
	AtomicInteger c = new AtomicInteger(0);

	public Employee creatEmployeeAtDao() {
		Employee emp = new Employee();
		emp.setEmployId(c.incrementAndGet());
		emp.setDpt("It");
		emp.setName("sanjay");
		emp.setSalary("30Lac");
		return emp;
	}

}
