package com.hcl.files;
/**
 * program about file read
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * in this programm we discussed about file read and if file not there means give exception.
 * @author yaswanth.
 *
 */

public class FileRead { 
  /**
  * main code.
  * @param args file.
  */
	
  public static void main(String[] args) { 
    File f1 = new File("D:/hcljava/Day4/Java4/src/com/hcl/files/FileInfo.java");
    try {
      FileReader fr = new FileReader(f1);
      int ch;
      while ((ch = fr.read()) !=  -1) {  
      System.out.print((char)ch);
      }
	  } catch (FileNotFoundException e) { 
      e.printStackTrace();
	  } catch (IOException e) { 
	  e.printStackTrace();
	}
  }
}
