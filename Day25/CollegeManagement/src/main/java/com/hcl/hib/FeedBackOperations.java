package com.hcl.hib;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FeedBackOperations {
	public static String feedBackId() {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("select max(fid) from FeedBack");
		List<String> lst = q.list();
		String fid="";
		fid = lst.get(0);
		if(lst==null) {
			fid="C001";
		} else {
			//fid = f.getFid();
			int id = Integer.parseInt(fid.substring(1));
			id++;
			String format = String.format("%03d", id);
			fid = "C" + format;
		}
		return fid;
	}
	
	public static List<String> instructors() {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("select distinct instructor from Subjects");
		List<String> lst = q.list();
		return lst;
	}
	
	public static List<String> subjects(String inst) {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("select distinct subject from Subjects where instructor = '" + inst + "'");
		List<String> lst = q.list();
		return lst;
	}
	
	public static String addFeedBack(FeedBack obj) {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(obj);
		t.commit();
		return "FeedBack Recorded Successfully....";
	}
	
	public static List<Count> count(Count obj) {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("select fbvalue,count(*) from FeedBack where instructor = '" + obj.getInstructor() + "'" + "and subject = '" + obj.getSubject() + "'" + "group by fbvalue");
		List lst = q.list();
		List<Count> lst1 = new ArrayList<Count>();
		Count c = null;
		for (Object o : lst) {
			Object[] a = (Object[])o;
			c = new Count();
			c.setFbval(a[0].toString());
			c.setCount(Integer.parseInt(a[1].toString()));
			lst1.add(c);
		}
		
		return lst1;
	}
}
