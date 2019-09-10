package com.hcl.hotel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Room")
public class Room {
    private String RoomID;
    private String type;
    private String status;
    private int CostPerDay;
    @Id
    @Column(name="RoomID")
	public String getRoomID() {
		return RoomID;
	}
	public void setRoomID(String roomID) {
		RoomID = roomID;
	}
	@Column(name="type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Column(name="status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column(name="CostPerDay")
	public int getCostPerDay() {
		return CostPerDay;
	}
	public void setCostPerDay(int costPerDay) {
		CostPerDay = costPerDay;
	}
    
}
