package com.hcl.ex;
/**
 * Class Ex3 is about Exception Handling.
 * @author saikumar.
 */

public class Ex3 {
  /**
   * Main method begins.
   * @param args for accesing arguments.
   */
  public static void main(String[] args) {
    try {
      System.out.println("A");
      throw new NullPointerException();
    } catch (ArithmeticException e) {
      System.out.println(e);
    } catch (NullPointerException e) {
      //System.out.println("Error");
      throw new NumberFormatException();
    } catch (NumberFormatException e) {
      System.out.println("rethrown error");
    }
  }
}

