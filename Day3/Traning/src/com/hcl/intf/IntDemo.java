package com.hcl.intf;
/**
 * interface demo.
 * @author yaswanth.
 * 
 *
 */

///**
//* interface demo.
//* @author yaswanth.
//*
//*/

public class IntDemo { 
  /**
  * main program.
  * @param args arr.
  */
  public static void main(String[] args) {
    Itraining[] arr = new Itraining[] { 
      new Hema(),new Keerthana()
    };
    for (Itraining i : arr) { 
      i.name();
      i.email();
    }
  }
}
