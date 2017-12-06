package com.cts.room.service.repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.room.service.entity.Room;
import com.cts.room.service.entity.RoomScheduler;





public interface RoomSchedulerRepository extends JpaRepository<RoomScheduler, Integer>{
	
	@Query(value="select * from room_scheduler join room using (room_id) "
			+ "where room_scheduler_id = ?1 ", nativeQuery=true)
	List<RoomScheduler> findByRoomSchedulerId(int roomSchedulerId);
	
	@Query(value="select * from room_scheduler where room_scheduler_start_dtg between ?1 and ?2", nativeQuery=true)
	List<RoomScheduler> findByRoomSchedulerStartDtg(LocalDateTime roomSchedulerStartDtg, LocalDateTime roomSchedulerEndDtg);
	
	
	@Query(value="select * from room_scheduler where room_scheduler_start_dtg = ?1  and room_scheduler_end_dtg= ?2", nativeQuery=true)
	List<RoomScheduler> findByRoomSchedulerStartEndDtg(LocalDateTime roomSchedulerStartDtg, LocalDateTime roomSchedulerEndDtg);
	
	@Query(value="select * from room_scheduler where room_scheduler_start_dtg = ?1  and room_scheduler_end_dtg= ?2 and login_id= ?3", nativeQuery=true)
	List<RoomScheduler> findByRoomSchedulerStartEndDtgLoginId(LocalDateTime roomSchedulerStartDtg, LocalDateTime roomSchedulerEndDtg, Integer loginId);
	
	@Query(value="select * from room_scheduler join room using (room_id) "
			+ "where room_name = ?1 and "
			+ "room_scheduler_start_dtg >= ?2  and room_scheduler_end_dtg <= ?3", nativeQuery=true)
	List<RoomScheduler> findByRoomSchedulerByDtgAndRoom(String roomName, LocalDateTime roomSchedulerStartDtg, LocalDateTime roomSchedulerEndDtg);
	
	@Query(value="delete from room_scheduler "
			+ "where login_id = ?1 and "
			+ "room_scheduler_start_dtg = ?2  and room_scheduler_end_dtg = ?3", nativeQuery=true)
	void deleteScheduleByDatesAndByLoginId(Integer loginId,LocalDateTime roomSchedulerStartDtg, LocalDateTime roomSchedulerEndDtg);

	

}
