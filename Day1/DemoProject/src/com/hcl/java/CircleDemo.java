package com.hcl.java;

public class CircleDemo {
  /**
   * Calculating area and circumference of the circle.
   * @param radius for passing arguments.
   */

  public void calc(double radius) {
    double area;
    double circ;
    area = Math.PI * Math.pow(radius,2);
    circ = 2 * Math.PI * radius;
    System.out.println("Area of Circle is " + area);
    System.out.println("circumference is" + circ);
  }
  
  /**
   * Main method.
   * @param args for passing arguments.
   */
 
  public static void main(String[] args) {
    double radius = 12.5;
    CircleDemo obj = new CircleDemo();
    obj.calc(radius);
  }
}
