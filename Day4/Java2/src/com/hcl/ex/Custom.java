package com.hcl.ex;
/**
 * CustomExceptions.
 * @author saikumar.
 */

public class Custom {
  /**
   *  adding two numbers.
   * @param a for first integer.
   * @param b for second integer.
   * @throws NegativeException for negative value.
   * @throws NumberZeroException zero values.
   */
  public void sum(int a,int b) throws NegativeException, NumberZeroException {
    int c;
    boolean flag = true;
    if (a < 0 || b < 0) {
      flag = false;
      throw new NegativeException("Negative Numbers not Allowed");
    }
    if (a == 0 || b == 0) {
      flag = false;
      throw new NumberZeroException("Zero is Invalid");
    }
    if (flag == true) {
      c = a + b;
      System.out.println("Sum is " + c);
    }
  }
  
  /**
   * Mian method starts.
   * @param args for passing integers.
   */
  public static void main(String[] args) {
    int a = 5;
    int b = 12;
    try {
      new Custom().sum(a, b);
    } catch (NegativeException | NumberZeroException e) {
      e.printStackTrace();
    }
  }
}


