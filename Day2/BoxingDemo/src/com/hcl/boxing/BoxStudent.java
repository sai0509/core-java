package com.hcl.boxing;

public class BoxStudent {
	public void show(Object ob){
		Student s=(Student)ob;
		System.out.println(s);
	}
	public static void main(String[] args) {
		Student obj1=new Student();
		obj1.sno=1;
		obj1.name="sai";
		obj1.city="delhi";
		obj1.cgp=7.6;
		new BoxStudent().show(obj1);
		
	}

}
