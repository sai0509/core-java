package com.hcl.java;

public class Enum2 {
  DayName day;
  
  public Enum2(DayName day) {
    this.day = day;
  }
  /**
   * enumerations.
   * @param args for passing arguments.
   */
  
  public static void main(String[] args) {
    String day = "WEDNESDAY";
    Enum2 obj = new Enum2(DayName.valueOf(day));
    System.out.println(day
    );
  }
}
