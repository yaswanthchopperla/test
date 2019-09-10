package com.hcl.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo { 
  /**
  * map keyword program. 
  * @param args String.
  */

  public static void main(String[] args) { 
    Map m = new HashMap();
    m.put("priya", "darshini");
    m.put("laksh", "babbar");
    m.put(" rishab", "hcl");
    m.put("kiruba", "lakshmi");
    String key = "priya";
    String value = (String)m.getOrDefault(key,  "not fopund");
    System.out.println(value);
  }
}
