package com.hcl.ast;
/**
 * Assert Statement Demo.
 * @author sai kumar.
 */

public class AssertDemo {
  /**
   * increment function.
   */
  public void incr() {
    int basic = 30000;
    for (int i = 0;i < 8;i++) {
      basic = basic + 4000;
      assert basic < 48000;
      System.out.println("Salary" + basic);
    }
  }
  /**
   * Main method.
   * @param args for passing arguments.
   */
  
  public static void main(String[] args) {
    new AssertDemo().incr();
  }
}
