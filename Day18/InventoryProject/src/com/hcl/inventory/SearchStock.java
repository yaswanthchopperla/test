package com.hcl.inventory;

public class SearchStock {
 private String stid;

public String getStid() {
	return stid;
}

public void setStid(String stid) {
	this.stid = stid;
}
 public Inventory SearchStock() {
	 return InventoryBaL.searchstockIdBal(stid);
 }
}
