package com.hcl.ex;
/**
 * Ex1 is about Exception.
 * @author sai kumar.
 */

public class Ex1 {
  /**
   * Main method starts.
   * @param args for passing arguments.
   
   */
  public static void main(String[] args) {
    try {
      return;
    } catch (Exception e) {
      System.out.println("Hi");
    } finally {
      System.out.println("finally");
    }
  }
}

