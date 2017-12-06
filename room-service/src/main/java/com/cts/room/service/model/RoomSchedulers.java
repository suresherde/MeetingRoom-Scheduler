package com.cts.room.service.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.cts.room.service.entity.Room;

public class RoomSchedulers {
		
	private LocalDateTime  roomSchedulerStartDtg;
	
	private LocalDateTime  roomSchedulerEndDtg;
	
	private Integer loginId;
	
	private Room rooms;
	
	private String subject;
	
	private Integer roomSchedulerId;

	


	public Integer getRoomSchedulerId() {
		return roomSchedulerId;
	}

	public void setRoomSchedulerId(Integer roomSchedulerId) {
		this.roomSchedulerId = roomSchedulerId;
	}

	

	public LocalDateTime getRoomSchedulerStartDtg() {
		return roomSchedulerStartDtg;
	}

	public void setRoomSchedulerStartDtg(LocalDateTime roomSchedulerStartDtg) {
		this.roomSchedulerStartDtg = roomSchedulerStartDtg;
	}

	public LocalDateTime getRoomSchedulerEndDtg() {
		return roomSchedulerEndDtg;
	}

	public void setRoomSchedulerEndDtg(LocalDateTime roomSchedulerEndDtg) {
		this.roomSchedulerEndDtg = roomSchedulerEndDtg;
	}

	public Integer getLoginId() {
		return loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}

	public Room getRooms() {
		return rooms;
	}

	public void setRooms(Room rooms) {
		this.rooms = rooms;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
