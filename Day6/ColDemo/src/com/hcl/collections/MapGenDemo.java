package com.hcl.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapGenDemo {
	public static void main(String[] args) {
		Map<Integer,String> m = new Hashtable<Integer,String>();
		m.put(1, "Darshni");
		m.put(2, "laksh");
		m.put(3, "Hema");
		m.put(4, "Vinod");
		m.put(5, "Raghu");
		
		int key ;
		String result;
		System.out.println("Enter Key : ");
		Scanner sc = new Scanner(System.in);
		key = sc.nextInt();
		result = m.getOrDefault(key, "Not found");
		System.out.println(result);
		
	}

}
