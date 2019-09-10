package com.hcl.ex;
/**
 * Throw Exceptions.
 * @author sai kumar.
 */

public class ThrEx {
  /**
   * Show method starts.
   * @param x for passing arguments
   */
  public void show(int x) {
    boolean flag = true;
    if (x < 0) {
      flag = false;
      throw new NumberFormatException("Negative Numbers not allowed");
    }
    if (x == 0) {
      flag = false;
      throw new ArithmeticException("Zero is invalid");
    }
    if (x > 0) {
      System.out.println(x);
    }
  }

  /**
   * Main method starts.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    //new ThrEx().show(12);
    int n = 12;
    try {
      new ThrEx().show(n);
    } catch (NumberFormatException e) {
      System.out.println(e.getMessage());
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

