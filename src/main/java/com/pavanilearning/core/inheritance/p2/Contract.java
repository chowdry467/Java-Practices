package com.pavanilearning.core.inheritance.p2;

import java.util.Date;

import com.pavanilearning.core.inheritance.p1.Person;

public class Contract extends Person {

	private Date contractEndDate;

	public Contract(long id, String name, String city, Date contractEndDate) {
		super(id, name, city);
		this.contractEndDate = contractEndDate;
	}

	public Date getContractEndDate() {
		return contractEndDate;
	}

	public void setContractEndDate(Date contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	public void getSomeAccessSpecifier() {
		// System.out.println(testPrivate); //accessible only at class level.
		System.out.println(testProtected);
		// System.out.println(defalutAccess); ->default value cannot be access outside
		// the package, it is accessible with the created package
	}

}
