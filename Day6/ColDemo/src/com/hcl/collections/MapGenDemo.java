package com.hcl.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapGenDemo {
  /**
  * genric for both integer and string.
  * @param args string and int.
  */
  public static void main(String[] args) {
    Map<Integer,String> m = new Hashtable<Integer,String>();
    m.put(1, "darshini");
    m.put(2, "vinod");
    m.put(3, "raghu");
    m.put(4, "hema");
    m.put(5, "sai");
    int key;
    String result;
    System.out.println("enter key");
    Scanner sc = new Scanner(System.in);
    key = sc.nextInt();
    result = m.getOrDefault(key, "not found");
    System.out.println(result);
  }
}
