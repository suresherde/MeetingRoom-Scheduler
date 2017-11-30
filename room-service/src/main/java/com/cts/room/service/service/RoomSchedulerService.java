package com.cts.room.service.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.cts.room.service.entity.Room;
import com.cts.room.service.entity.RoomScheduler;
import com.cts.room.service.model.RoomSchedulers;
import com.cts.room.service.model.Rooms;

@Service
public class RoomSchedulerService {

	private RoomScheduler roomScheduler; 
	
	public RoomScheduler addSchedule(RoomSchedulers roomSchedulers){
		roomScheduler= new RoomScheduler();
		roomScheduler.setRoomSchedulerId(roomSchedulers.getRoomSchedulerId());
		roomScheduler.setRooms(roomSchedulers.getRooms());	
		roomScheduler.setLoginId(roomSchedulers.getLoginId());
		roomScheduler.setSubject(roomSchedulers.getSubject());
		roomScheduler.setRoomSchedulerStartDtg(roomSchedulers.getRoomSchedulerStartDtg());
		roomScheduler.setRoomSchedulerEndDtg(roomSchedulers.getRoomSchedulerEndDtg());
		return roomScheduler;
	}
	
	public Date adding23Hours(Date fromDate){
		Date newDate = new Date(fromDate.getTime() +  85800000L );
		return newDate;
	}

}
