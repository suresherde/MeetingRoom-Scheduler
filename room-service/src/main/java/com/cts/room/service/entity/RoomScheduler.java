package com.cts.room.service.entity;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="room_scheduler",catalog="room_scheduler")

public class RoomScheduler {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="room_scheduler_id")
	private Integer roomSchedulerId;
	
	@Column(name="room_scheduler_start_dtg")
	//@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime roomSchedulerStartDtg;
	
	@Column(name="room_scheduler_end_dtg")
	//@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime roomSchedulerEndDtg;
	@Column(name="login_id")
	
	private Integer loginId;
	
	@Column(name="room_scheduler_subject")
	private String subject;
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@ManyToOne
	@JoinColumn(name="room_id", referencedColumnName="room_id")
	private Room rooms;
		
	
	public RoomScheduler() {
		
	}

	public Room getRooms() {
		return rooms;
	}

	public void setRooms(Room rooms) {
		this.rooms = rooms;
	}

	
	
	public RoomScheduler(LocalDateTime roomSchedulerStartDtg, LocalDateTime roomSchedulerEndDtg, Integer loginId,
			String subject, Room rooms) {
		super();
		this.roomSchedulerStartDtg = roomSchedulerStartDtg;
		this.roomSchedulerEndDtg = roomSchedulerEndDtg;
		this.loginId = loginId;
		this.subject = subject;
		this.rooms = rooms;
	}

	public Integer getRoomSchedulerId() {
		return roomSchedulerId;
	}
	
	public void setRoomSchedulerId(Integer roomSchedulerId) {
		this.roomSchedulerId = roomSchedulerId;
	}
	
	
	public Integer getLoginId() {
		return loginId;
	}
	
	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
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

}
