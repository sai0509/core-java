package com.hcl.boxing;

public class StudentTest {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.sno=1;
		s1.name="sai";
		s1.city="delhi";
		s1.cgp=7.4;
		
		Student s2=new Student();
		s2.sno=2;
		s2.name="yash";
		s2.city="delhi";
		s2.cgp=7.5;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}
