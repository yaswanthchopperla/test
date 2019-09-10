package com.hcl.ex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjOutEx {
	public static void main(String[] args) {
		try {
			FileOutputStream fout;
			fout = new FileOutputStream("c:/files/Objout.txt");
			ObjectOutputStream  objout=new ObjectOutputStream(fout);
			objout.writeObject(new String("date is :"));
			objout.writeObject(new Date());
			objout.close();
			fout.close();
			System.out.println("**object stored**");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
