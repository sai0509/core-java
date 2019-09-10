package com.hcl.ast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmploy {
  /**
   * object output stream.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    try {
      FileOutputStream fout = new FileOutputStream("c:/files/employ.txt");
      ObjectOutputStream objout = new ObjectOutputStream(fout);
      Employ e = new Employ(1, "Anupam", 45698);
      objout.writeObject(e);
      objout.close();
      fout.close();
      System.out.println("Employ details stored....");
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
