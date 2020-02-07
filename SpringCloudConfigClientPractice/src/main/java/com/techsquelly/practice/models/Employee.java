package com.techsquelly.practice.models;

import org.springframework.beans.factory.annotation.Value;

public class Employee implements Comparable<Employee> {
	long  employId;
	String Name;
	String Salary;
	@Value("${Message: Default Hello}")
	String Message;
	
	
	String Dpt;

	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public long getEmployId() {
		return employId;
	}
	public void setEmployId(long employId) {
		this.employId = employId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public String getDpt() {
		return Dpt;
	}
	public void setDpt(String dpt) {
		Dpt = dpt;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (employId ^ (employId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employId != other.employId)
			return false;
		return true;
	}
	@Override
	public int compareTo(Employee o) {
		if(this.employId>o.employId)
			return 1;
		else if(this.employId<o.employId) 
			return -1;
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
