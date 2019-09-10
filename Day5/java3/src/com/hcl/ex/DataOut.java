package com.hcl.ex;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOut {
  /**
  * datoutputstream.
  * @param args file.
  */
  public static void main(String[] args) { 
    try { 
      DataOutputStream dout = 
          new DataOutputStream(new FileOutputStream("c:/files/data.txt"));
      dout.writeInt(12);
      dout.writeUTF("hcl");
      dout.writeDouble(5646.8);
      dout.writeBoolean(true);
      dout.close();
      System.out.println("** file created**");
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
