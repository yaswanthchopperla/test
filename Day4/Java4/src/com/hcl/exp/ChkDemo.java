package com.hcl.exp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChkDemo { 
  public static void main(String[] args) throws FileNotFoundException { 
    FileInputStream f1 = new FileInputStream("C:/hello.txt");
  }
}
