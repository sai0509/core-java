package com.hcl.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
  /**
   * date format.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    Date dt = new Date();
    System.out.println(dt);
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    System.out.println(sdf.format(dt));
    String strdate = "09/06/2019 ";
    try {
      Date obj = sdf.parse(strdate);
      System.out.println(obj);
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}
