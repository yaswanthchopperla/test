package com.hcl.inventory;

public class InventoryBaL {
  public static String placeorderbal(String stid,int orderedquantity) { 
    return new InventoryDaO().placeorderDao(stid, orderedquantity);
  }

  public static int generateordernoBal() { 
    return new InventoryDaO().generateordernoDao();
  }
  
  public static Inventory searchstockIdBal(String stid) { 
    return new InventoryDaO().searchstockDao(stid);
  }

  public static String generatestockIdBal() { 
    return new InventoryDaO().generateStockIdDao(); 
  }

  public static String createStockBal(Inventory objstock) { 
    return new InventoryDaO().createStockDao(objstock);
  }
}
