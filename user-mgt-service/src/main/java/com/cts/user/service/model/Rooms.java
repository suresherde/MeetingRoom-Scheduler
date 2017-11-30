package com.cts.user.service.model;



public class Rooms {

	private Integer roomId;
	
	private String roomName;
	
	private Integer roomStatusId;
	
	

	public Rooms() {
		// TODO Auto-generated constructor stub
	}

	

	public Rooms(Integer roomId, String roomName, Integer roomStatusId) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
		this.roomStatusId = roomStatusId;
	}



	public Integer getRoomId() {
		return roomId;
	}



	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
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
