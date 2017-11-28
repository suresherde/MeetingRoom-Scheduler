package com.cts.room.service.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.room.service.entity.Room;
import com.cts.room.service.entity.RoomScheduler;





public interface RoomSchedulerRepository extends JpaRepository<RoomScheduler, Integer>{
	
	@Query(value="select * from room_scheduler where room_scheduler_start_dtg between ?1 and ?2", nativeQuery=true)
	List<RoomScheduler> findByRoomSchedulerStartDtg(java.util.Date roomSchedulerStartDtg, java.util.Date roomSchedulerEndDtg);
	
	@Query(value="select * from room_scheduler where room_scheduler_start_dtg = ?1  and room_scheduler_end_dtg= ?2", nativeQuery=true)
	List<RoomScheduler> findByRoomSchedulerStartEndDtg(java.util.Date roomSchedulerStartDtg, java.util.Date roomSchedulerEndDtg);

	

}