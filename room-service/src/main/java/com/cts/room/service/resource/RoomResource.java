package com.cts.room.service.resource;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.room.service.RoomServiceApplication;
import com.cts.room.service.entity.Room;
import com.cts.room.service.model.Rooms;
import com.cts.room.service.repository.RoomRepository;
import com.cts.room.service.service.RoomService;

@RestController
@RequestMapping("/rest/db/room")
public class RoomResource {
	private static final Logger logger = LogManager.getLogger(RoomResource.class);
	
	
	@Autowired
	RoomRepository roomRepository;
	@Autowired
	RoomService roomService;
	
	@GetMapping("/getRoomByName/{roomName}")
	public List<Room> getRoomByName(@PathVariable("roomName") final String roomName){
		
		return  roomRepository.findByRoomName(roomName);
	}
	
	@GetMapping("/getAllRoom")
	public List<Room> getAllRoom(){
		return  roomRepository.findAll();
	}
	
	@GetMapping("/getRoomById/{roomId}")
	public List<Room> getRoomById(@PathVariable("roomId") final Integer roomId){
		return  roomRepository.findByRoomId(roomId);
	}
	
	@GetMapping("/getRoomByStatus/{roomStatusId}")
	public List<Room> getRoomByStatusId(@PathVariable("roomStatusId") final Integer roomStatusId){
		return  roomRepository.findByRoomStatusId(roomStatusId);
	}
		
	@PostMapping("/addRoom")
	public List<Room> addRoom(@RequestBody final Rooms rooms){
		logger.info("A New room will be added "+rooms.getRoomName());
		
	        
		Room room = roomService.addRoom(rooms);
		roomRepository.save(room);
		return roomRepository.findByRoomName(rooms.getRoomName());
	}
	
	@PostMapping("/deleteRoom")
	public boolean deleteRoom(@RequestBody final Rooms rooms){
		
		List <Room> room = getRoomByName(rooms.getRoomName());
		
		roomRepository.delete(room.get(0).getRoomId());
		return true;
	}
	
	// Edit
	
	//Update
	

}
