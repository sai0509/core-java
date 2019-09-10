package com.hcl.hib;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No : ");
		int empno = sc.nextInt();
		Configuration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from Employ where empno = " + empno);
		List<Employ> lst = q.list();
		Employ e = lst.get(0);
		if (e != null) {
			System.out.println("Enter Employ Name : ");
			e.setName(sc.next());
			System.out.println("Enter Employ Department : ");
			e.setDept(sc.next());
			System.out.println("Enter Employ Designation : ");
			e.setDesig(sc.next());
			System.out.println("Enter Employ Salary : ");
			e.setBasic(Integer.parseInt(sc.next()));
			Transaction t = s.beginTransaction();
			t.commit();
			System.out.println("Record Updated...");
		} else {
			System.out.println("Record Not Found...");
		}
	}
}
