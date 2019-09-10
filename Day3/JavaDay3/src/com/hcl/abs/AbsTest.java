package com.hcl.abs;

public class AbsTest {
  /**
   * Abstrct inheritance.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    Animal[] arr1 = new Animal[]{
      new Lion(),
      new Crocodile()
    };
    for (Animal animal : arr1) {
      //System.out.println(animal);
      animal.name();
      animal.type();
    }
  }
}
