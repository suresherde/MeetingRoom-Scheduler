package com.cts.room.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.room.service.entity.Room;



public interface RoomRepository extends JpaRepository<Room, Integer> {
	 List<Room> findByRoomName(String roomName);
	 List<Room> findByRoomId(Integer roomId);
	 List<Room> findByRoomStatusId(Integer roomStatusId);
}
