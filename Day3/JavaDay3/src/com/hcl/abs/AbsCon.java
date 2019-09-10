package com.hcl.abs;

public class AbsCon {
  /**
   * Abstract constructor.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    Employ obj1 = new Janani(1,"Janani",77553);
    Employ obj2 = new Raghu(2,"Raghu",95543);
    Employ[] arrEmploy = new Employ[]{obj1,obj2};
    for (Employ employ : arrEmploy) {
      System.out.println(employ);
    }
  }
}
