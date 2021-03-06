package com.hcl.files;
/**
 * file write.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * program about write afile in target file.
 * @author yaswanth.
 *
 */

public class FileWriteEx {
  /**
  * main program.
  * @param args file.
  */

  public static void main(String[] args) { 
    File src;
    File tar;
    FileReader fr;
    FileWriter fw;
    src = new File("D:/hcljava/Day4/Java4/src/com/hcl/files/FileInfo.java");
    tar = new File("c:/files/target.txt");
    try {
      fr = new FileReader(src);
      fw = new FileWriter(tar);
      int ch;
      while ((ch = fr.read()) != -1) {  
        fw.write((char)ch);
      }
      fr.close();
      fw.close();
    } catch (FileNotFoundException e) { 
      e.printStackTrace();
    } catch (IOException e) { 
      e.printStackTrace();
    }
  }
}
