package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmp {
  /**
   * Sorted set.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    SortedSet s = new TreeSet();
    s.add(new Emp(1, "sai", 45698));
    s.add(new Emp(2, "yash", 58962));
    s.add(new Emp(3, "laksh", 55698));
    s.add(new Emp(4, "uttam", 45698));
    s.add(new Emp(4, "satya", 45367));
    System.out.println("Sorted data");
    s.forEach(System.out::println);
  }
}
