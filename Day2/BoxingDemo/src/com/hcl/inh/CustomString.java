package com.hcl.inh;

public class CustomString {
//	static String name;
	public void length(){
		String s1="sai";
		String s2="sai";
		int i=0,j=0;
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		for(char c:arr1){
			i++;
		}
		System.out.println("length of string s1 is : " +i);
		for(char d:arr2){
			j++;
		}
		System.out.println("length of string s2 is : " +j);
		if(i==j){
		for(int k=0;k<=i;k++){
			if(arr1[k]==arr2[k]){
				System.out.println("strings are equal");
			}else{
				System.out.println("strings are not equal");
			}
		}
		}else{
			System.out.println("strings length are not equal");
			
		}
	
	}
	public static void main(String[] args) {
		new CustomString().length();
	}
	
}
