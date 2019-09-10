package com.hcl.ast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteStudent {
  /**
   * object output stream.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    try {
      FileOutputStream fout = new FileOutputStream("c:/files/student.txt");
      ObjectOutputStream objout = new ObjectOutputStream(fout);
      Student s = new Student(1, "sai", "kurnool", 6.2);
      objout.writeObject(s);
      System.out.println("student object cretated...");
      objout.close();
      fout.close();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
