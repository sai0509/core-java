package com.hcl.employ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg1 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Dept.xml");
		DeptQueryDao d=(DeptQueryDao)ctx.getBean("myDao");
		d.deptshow();
	}

}
