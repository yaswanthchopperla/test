package com.hcl.inventory;

public class PlaceOrder {
private String stid;
private int OQ;
public String getStid() {
	return stid;
}
public void setStid(String stid) {
	this.stid = stid;
}
public int getOQ() {
	return OQ;
}
public void setOQ(int oQ) {
	OQ = oQ;
}
public String PlceOrder() {
	return InventoryBaL.placeorderbal(stid, OQ);
}
}
