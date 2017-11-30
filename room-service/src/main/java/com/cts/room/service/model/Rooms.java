package com.cts.room.service.model;



public class Rooms {

	
	private String roomName;
	
	private Integer roomStatusId;
	
	

	public Rooms() {
		// TODO Auto-generated constructor stub
	}

	public Rooms(String roomName, Integer roomStatusId) {
		super();
		this.roomName = roomName;
		this.roomStatusId = roomStatusId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public Integer getRoomStatusId() {
		return roomStatusId;
	}

	public void setRoomStatusId(Integer roomStatusId) {
		this.roomStatusId = roomStatusId;
	}
	
}
