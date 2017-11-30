package com.cts.room.service.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="room", catalog="room_scheduler")
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="room_id")
	private Integer roomId;
	
	@Column(name="room_name")
	private String roomName;
	@Column(name="room_status_id")
	private Integer roomStatusId;
	

	public Room(String roomName, Integer roomStatusId) {
		super();
		this.roomName = roomName;
		this.roomStatusId = roomStatusId;
	}
	
	
	public Room() {
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
