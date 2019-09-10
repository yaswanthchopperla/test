package com.hcl.inventory;

import java.util.Scanner;

public class SearchStockIdMain {
  /**
  * search main function.
  * @param args string.
  */

  public static void main(String[] args) { 
    String stid;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter stockid");
    stid = sc.nextLine();
    Inventory objstock = InventoryBaL.searchstockIdBal(stid);
    if (objstock != null) { 
      System.out.println(objstock.getItemName());
      System.out.println(objstock.getPrice());
      System.out.println(objstock.getQuantityAvail());
    } else {
      System.out.println("*** stock not found**");
    }
  }
}
