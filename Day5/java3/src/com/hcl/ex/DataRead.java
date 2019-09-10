package com.hcl.ex;
/**
 * program about datinputstream.
 */

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * here reading the data.
 * @author yaswanth
 *
 */
public class DataRead {  
  public static void main(String[] args) { 
    try { 
      DataInputStream din=
					new DataInputStream(new FileInputStream("c:/files/data.txt"));
			int x=din.readInt();
			x++;
			System.out.println(x);
			String name=din.readUTF();
			System.out.println(name);
			double basic=din.readDouble();
			System.out.println(basic);
			boolean flag=din.readBoolean();
			System.out.println(flag);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
