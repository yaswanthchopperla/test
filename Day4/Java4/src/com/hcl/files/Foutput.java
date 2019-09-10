package com.hcl.files;
/**
 * file output.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * about file output.
 * @author yaswanth.
 *
 */

public class Foutput { 
  /**
  * main program.
  * @param args file.
  */

  public static void main(String[] args) { 
    FileInputStream src;
    FileOutputStream tar;
    try {
      src = new FileInputStream("D:/hcljava/Day4/Java4/src/com/hcl/files/FileInfo.java");
      tar = new FileOutputStream("c:/files/output.txt");
      int ch;
      while ((ch = src.read()) != -1) { 
        tar.write((char)ch);
      }
      src.close();
      tar.close();
      System.out.println("**file copied**");
    } catch (FileNotFoundException e) { 
      e.printStackTrace();
    } catch (IOException e) { 
      e.printStackTrace();
    }
  }
}
