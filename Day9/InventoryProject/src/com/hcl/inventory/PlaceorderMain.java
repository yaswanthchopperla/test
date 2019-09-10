package com.hcl.inventory;

import java.util.Scanner;

public class PlaceorderMain {
  /**
  * place order main function.
  * @param args string.
  */

  public static void main(String[] args) {
    String stid;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter stock id :");
    stid = sc.nextLine();
    System.out.println("enter orderedquantity : ");
    int orderedquantity;
    orderedquantity = Integer.parseInt(sc.nextLine());
    System.out.println(InventoryBaL.placeorderbal(stid, orderedquantity));
  }
}
