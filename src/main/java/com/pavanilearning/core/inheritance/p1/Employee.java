package com.pavanilearning.core.inheritance.p1;

import java.util.Date;

public class Employee extends Person {

	private String department;
	private Date joiningDate;

	public Employee(long id, String name, String city, String department, Date joiningDate) {
		super(id, name, city);
		this.department = department;
		this.joiningDate = joiningDate;

	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public void getSomeAccessSpecifier() {
		// System.out.println(testPrivate); class level
		System.out.println(testProtected);
		System.out.println(defalutAccess);
	}

	public String Employee1(String name) {
		System.out.println(name);
		return name;
	}

	protected String Employee1(String name, String city) {
		System.out.println(name + " " + city);
		return name;
	}

}
