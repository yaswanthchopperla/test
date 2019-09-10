package com.hcl.inventory;

public class AddStock {
private String stid;
private String itemname;
private int price;
private int qtyavail;
public String getStid() {
	return stid;
}
public void setStid(String stid) {
	this.stid = stid;
}
public String getItemname() {
	return itemname;
}
public void setItemname(String itemname) {
	this.itemname = itemname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQtyavail() {
	return qtyavail;
}
public void setQtyavail(int qtyavail) {
	this.qtyavail = qtyavail;
}
public String AddStock() {
	Inventory objstock=new Inventory();
	String stid=InventoryBaL.generatestockIdBal();
	objstock.setStockid(stid);
	objstock.setItemName(itemname);
	objstock.setPrice(price);
	objstock.setQuantityAvail(qtyavail);
	return InventoryBaL.createStockBal(objstock);
}
}
