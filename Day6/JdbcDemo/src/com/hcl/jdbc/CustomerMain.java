package com.hcl.jdbc;

import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CustomerMain {
  static ResourceBundle rb = ResourceBundle.getBundle("project");
  /**
  * delete customer.
  */

  public  static void deleteCustomer() { 
    int custId;
    Scanner sc = new Scanner(System.in);
    System.out.println(rb.getString("custid"));
    custId = sc.nextInt();
    CustomerBaL obj = new CustomerBaL();
    String res = obj.deleteCustomerBal(custId);
    System.out.println(res);
  }
  /**
  * show customer.
  */

  public static void showCustomer() { 
    CustomerBaL obj = new CustomerBaL();
    List<Customer> lstcustomer = obj.showCustomerBal();
    for (Customer customer : lstcustomer) {
      System.out.println(customer);
    }
  }
  /**
  * update customer.  
  */

  public static void updateCustomer() { 
    Customer objcustomer = new Customer();
    Scanner sc = new Scanner(System.in);
    System.out.println(rb.getString("custid"));
    objcustomer.setCustId(Integer.parseInt(sc.nextLine()));
    System.out.println(rb.getString("custname"));
    objcustomer.setCustName(sc.nextLine());
    System.out.println(rb.getString("custap"));
    objcustomer.setAnnualPremium(Integer.parseInt(sc.nextLine()));
    System.out.println(rb.getString("custmp"));
    objcustomer.setModalPremium(Integer.parseInt(sc.nextLine()));
    System.out.println(rb.getString("custpy"));
    objcustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
    CustomerBaL obj1 = new CustomerBaL();
    String res = obj1.updateCustomerBal(objcustomer);
    System.out.println(res);
  }
  /**
  * searchcustomer.
  */

  public static void searchCustomer() { 
    int custId;
    Scanner sc = new Scanner(System.in);
    custId = sc.nextInt();
    CustomerBaL obj = new CustomerBaL(); 
    Customer objcustomer = obj.searchCustomerBal(custId);
    if (objcustomer != null) { 
      System.out.println(objcustomer);
    } else {
      System.out.println(rb.getString("notfound"));
    }
  }

  public static void writeCustomerFile() {
    new CustomerBaL().writeCustomerFileBal();
  }

  public static void readCustomerFile() {
    new CustomerBaL().readCustomerFileBal();
  }
  /**
  * add customer.
  */

  public static void addCustomer() {
    Customer objcustomer = new Customer();
    Scanner sc = new Scanner(System.in);
    System.out.println(rb.getString("custid"));
    objcustomer.setCustId(Integer.parseInt(sc.nextLine()));
    System.out.println(rb.getString("custname"));
    objcustomer.setCustName(sc.nextLine());
    System.out.println(rb.getString("custap"));
    objcustomer.setAnnualPremium(Integer.parseInt(sc.nextLine()));
    System.out.println(rb.getString("custmp"));
    objcustomer.setModalPremium(Integer.parseInt(sc.nextLine()));
    System.out.println(rb.getString("custpy"));
    objcustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
    CustomerBaL obj = new CustomerBaL();
    try { 
      boolean res = obj.addCustomerBal(objcustomer);
      if (res == true) { 
        System.out.println(rb.getString("added"));
      }
    } catch (CustomerException e) {
      System.out.println(e.getMessage());
    }
  }
  /**
   * main function.
   * @param args strings.
   */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int yn;
    do { 
      System.out.println("Options");
      System.out.println("---------");
      System.out.println("1. Add customer");
      System.out.println("2. Show customer");
      System.out.println("3. Search customer");
      System.out.println("4. Update customer");
      System.out.println("5. Delete customer");
      System.out.println("6. writecustomerfile()");
      System.out.println("7. readcustomerfile()");
      System.out.println("8. Exit");
      System.out.println(rb.getString("choice"));
      yn = sc.nextInt();
      switch (yn) {
        case 1 : 
          addCustomer();
          break;
        case 2 :
          showCustomer();
          break;
        case 3 :
          searchCustomer();
          break;
        case 4 : 
          updateCustomer();
          break;
        case 5 : 
          deleteCustomer();
          break;
        case 6 : 
          writeCustomerFile();
          break;
        case 7 :
          readCustomerFile();
          break;
        case 8 :
          return;
        default : 
          System.out.println(rb.getString("invalid"));
      }
    } while (yn != 8);
  }
}




