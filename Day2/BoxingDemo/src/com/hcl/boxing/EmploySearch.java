package com.hcl.boxing;

public class EmploySearch {
	public Employ show(int empno){
		Employ employ=null;
		if(empno==1){
			employ=new Employ();
			employ.empno=100;
			employ.name="Anubhav";
			employ.basic=8821;
		}
		if(empno==3){
			employ=new Employ();
			employ.empno=102;
			employ.name="prem Reddy";
			employ.basic=84532;
		}
		return employ;
	}
	public static void main(String[] args) {
//		System.out.println(new EmploySearch().show(1));
		EmploySearch obj=new EmploySearch();
		Employ res=obj.show(2);
		if(res!=null){
		System.out.println(res);
		}else{
			System.out.println("employ not found");
		}
	}
}
