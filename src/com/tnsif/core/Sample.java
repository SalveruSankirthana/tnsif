package com.tnsif.core;

 class Student {
    String name;
	int age;
	int roll_number;
	
	
}
public class Sample
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.name="sankirthana";
		s1.age=22;
		s1.roll_number=92;
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.roll_number);
	} 
}
