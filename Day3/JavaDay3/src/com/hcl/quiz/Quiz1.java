package com.hcl.quiz;

public class Quiz1 {
	public static void main(String[] args) {
		Object[] arr=new Object[]{
				12,"Welcome",12.5,"HCL",'A',true,11,11.6,"Bangalore"
		};
		for (Object object : arr) {
//			if(object instanceof Integer){
//				System.out.println(object);
//		}
			if(object instanceof String){
				System.out.println(object);
			}
		}
	}
}

