package com.hcl.files;

import java.io.File;

public class FileInfo {
  /**
   * Files functions.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    File f1 = new File("D:\\hcljava\\Day4\\Java2\\src\\com\\hcl\\ex\\ChkDemo.java");
    System.out.println(f1.getName());
    System.out.println(f1.getParent());
    System.out.println(f1.getPath());
    File f2 = new File("D:\\hcljava\\Day4\\Java2\\src\\com\\hcl\\ex");
    String[] flist = f2.list();
    for (String string : flist) {
      System.out.println(string);
    }
  }
}
