package com.hcl.inventory;

import java.util.Scanner;

public class CreateStockDaoMain {
  /**
  * add the values.
  * @param args object. 
  */
  public static void main(String[] args) {
    String stid = InventoryBaL.generatestockIdBal();
    Inventory objstock = new Inventory();
    objstock.setStockid(stid);
    Scanner sc = new Scanner(System.in);
    System.out.println("enter item name");
    objstock.setItemName(sc.nextLine());
    System.out.println("enter price:");
    objstock.setPrice(sc.nextInt());
    System.out.println("enter quantity avail");
    objstock.setQuantityAvail(sc.nextInt());
    System.out.println("item added");
    System.out.println(InventoryBaL.createStockBal(objstock));
  }
}
