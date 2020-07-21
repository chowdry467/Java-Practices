package com.pavanilearning.core.inheritance.main;

public class StringTest {

	public static void main(String[] args) {

		String s1 = "s1";
		String s2 = "s1";

		// System.out.println(s1 == s2);
		// System.out.println(s1.equals(s2));

		s1 = s1.concat("hee");// immutable
		// s1 = s1 + "hee";

		// s2 = "heloo";

		/*
		 * System.out.println(s1);
		 * 
		 * String s = new String("Heelo"); String ss = new String("Heelo");
		 * 
		 * System.out.println(s.equals(ss));
		 * 
		 * System.out.println(s == ss);
		 */

		mutiableExample example = new mutiableExample();
		example.setId(1);
		example.setName("Pavani");
		example.setCity("Bangalore");

		ImmuteableExample example2 = new ImmuteableExample(example);
		example.setCity("Hyderbad");

		System.out.println(example2.getMu().getCity());

	}

}
