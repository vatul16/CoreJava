package com.edubridge.classobject;

/*
 * Create a class named 'Student' with String variable 'name' and 
 * integer variable 'roll_no'. Assign the value of roll_no as '2' 
 * and that of name as "John" by creating an object of the class Student.
 * */

public class Student {
	
	String name;
	int roll_no;

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.roll_no = 2;
		s1.name = "John";
		
		System.out.println("Student Roll No.: " + s1.roll_no + "\nStudent Name: " + s1.name);

	}

}
