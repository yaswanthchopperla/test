package com.hcl.demo;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class InternalizationDemo {

	public static void main(String[] args) {
      double d=345554.434;
      NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);
      NumberFormat nf1=NumberFormat.getInstance(Locale.US);
      NumberFormat nf2=NumberFormat.getInstance(Locale.CHINA);
      System.out.println("Italian Representation of   :"+nf.format(d));
      System.out.println("US Representation of        :"+nf1.format(d));
      System.out.println("China Representation of     :"+nf2.format(d));
      
      DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT,Locale.CHINA);
      System.out.println("Short format of date :"+df.format(new Date()));
      
      DateFormat df1=DateFormat.getDateInstance(DateFormat.SHORT,Locale.CANADA);
      System.out.println("Short format of date :"+df1.format(new Date()));
      
      DateFormat df2=DateFormat.getDateInstance(DateFormat.LONG,Locale.ITALY);
      System.out.println("Short format of date :"+df2.format(new Date()));
	}

}
