package com.cts.room.service.service;

import org.springframework.stereotype.Service;

import com.cts.room.service.entity.Room;
import com.cts.room.service.model.Rooms;

@Service
public class RoomService {

	public Room addRoom(Rooms rooms){
		
		Room room = new Room();
		room.setRoomName(rooms.getRoomName());
		room.setRoomStatusId(rooms.getRoomStatusId());
		
		return room;
		
	}
	
}
