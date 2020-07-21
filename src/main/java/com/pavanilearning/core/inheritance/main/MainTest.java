package com.pavanilearning.core.inheritance.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.pavanilearning.core.inheritance.p1.Employee;
import com.pavanilearning.core.inheritance.p1.Person;
import com.pavanilearning.core.inheritance.p2.Contract;

public class MainTest {

	public static void main(String[] args) {
		Person person = new Person(1, "pavani", "Bangalore");
		Employee employee = new Employee(2, "Jeeva", "Raichur", "home", new Date());
		Contract contract = new Contract(3, "keyur", "Hyderbad", new Date());
		// Employee e1 = new Person(1,"pavani", "Bangalore");
		// System.out.println(e1.getCity()); //we cannot create a child class as a
		// reference object , instead we can create for parent class.
		// System.out.println(e1.getId());

		Person p1 = new Employee(2, "Jeeva", "Raichur", "home", new Date());
		System.out.println(p1.getCity());
		System.out.println(((Employee) p1).getDepartment());
		List<String> l1 = new ArrayList<>();

		// for abstract class we cannot create object.

		// abstract class is in completed class, it contains abstract method with out
		// body so we cannot instantiate the class.
		// App app1 =new App();

		Person person1 = new Person(1, "pavani", "Bangalore");

		System.out.println(person == person1);// address location it compares

		System.out.println(person.equals(person1)); //

		person1.setCity("Hyd"); // state of the object

	}

}
