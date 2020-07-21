package com.pavanilearning.core.inheritance.p1;

public class Person {

	private long id;
	private String name;
	private String city;
	protected String testProtected = "protected-test";
	private String testPrivate = "private-test";
	String defalutAccess = "defaultValue";

	public Person(long id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
		// when argument based constructor is created in a class then complier will not
		// provide/create a default constructor, we have create it manually only if
		// required.
	}

	// public Person(){
	// default constructor is called when we create object , complier will provide
	// default constructor if we don't declare it
	// }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
