package com.hcl.files;
/**
 * program about files.
 */

import java.io.File;
/**
 * in this class we print  file name and file path. 
 * @author yaswanth
 *
 */

public class FileInfo { 
  /**
  * basic code.
  * @param args file.
  */
  public static void main(String[] args) {  
    File f1 = new File("D:/hcljava/Day4/Java4/src/com/hcl/files/FileInfo.java");
    System.out.println("file name" + f1.getName());
    System.out.println("full name" + f1.getAbsolutePath());
    File f2 = new File("D:/hcljava/Day4/Java4/src/com/hcl/files");
    String[] files = f2.list();
    for (String string : files) { 
      System.out.println(string);
    }
  }
}
