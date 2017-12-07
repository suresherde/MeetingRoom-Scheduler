package com.cts.room.service.resource;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cts.room.service.entity.RoomScheduler;
import com.cts.room.service.model.RoomSchedulers;

import com.cts.room.service.repository.RoomSchedulerRepository;
import com.cts.room.service.service.RoomSchedulerService;

@RestControllerAdvice
@RequestMapping("/rest/db/room")
public class RoomSchedulerResource {
	
	@Autowired
	private RoomSchedulerRepository roomSchedulerRepository;
	@Autowired
	private RoomSchedulerService roomSchedulerService;
	

	public RoomSchedulerResource(RoomSchedulerRepository roomSchedulerRepository) {
		this.roomSchedulerRepository = roomSchedulerRepository;
	}
	
	
	public RoomSchedulerResource() {
		// TODO Auto-generated constructor stub
	}


	@GetMapping("/getAllSchedule")
	public List<RoomScheduler> getAll(){
		return roomSchedulerRepository.findAll();
	}
	
	@GetMapping("/getScheduleByStartDate/{roomSchedulerStartDtg}")
	public List<RoomScheduler> getAllByStartDate(@PathVariable("roomSchedulerStartDtg") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDateTime fromDate){
		return roomSchedulerRepository.findByRoomSchedulerStartDtg(fromDate,roomSchedulerService.adding23Hours(fromDate));
	}
	
	@GetMapping("/getScheduleById/{roomSchedulerId}")
	public List<RoomScheduler> getScheduleById(@PathVariable("roomSchedulerId") final Integer roomSchedulerId){
		
		System.out.println("roomSchedulerId====="+roomSchedulerId);
		
		return roomSchedulerRepository.findByRoomSchedulerId(roomSchedulerId);
	}
	
	
	
	@PostMapping("/addScheduler")
	public List<RoomScheduler> addSchedule(@RequestBody final RoomSchedulers roomSchedulers){
		RoomScheduler roomScheduler = roomSchedulerService.addSchedule(roomSchedulers);
		roomSchedulerRepository.save(roomScheduler);
		return roomSchedulerRepository.findAll();
	}
	
	@PostMapping("/getScheduleByStartEndTime")
	public List<RoomScheduler> getSchedule(@RequestBody final RoomSchedulers roomSchedulers){
		RoomScheduler roomScheduler = roomSchedulerService.addSchedule(roomSchedulers);
		return roomSchedulerRepository.findByRoomSchedulerStartEndDtg(roomScheduler.getRoomSchedulerStartDtg(),roomScheduler.getRoomSchedulerEndDtg());
	}
	
	@PostMapping("/getScheduleByStartEndTimeAndLoginId")
	public List<RoomScheduler> getScheduleByTimeAndLoginId(@RequestBody final RoomSchedulers roomSchedulers){
		RoomScheduler roomScheduler = roomSchedulerService.addSchedule(roomSchedulers);
		return roomSchedulerRepository.findByRoomSchedulerStartEndDtgLoginId(roomScheduler.getRoomSchedulerStartDtg(),roomScheduler.getRoomSchedulerEndDtg(),roomScheduler.getLoginId());
	}
	
	@PostMapping("/getSchedulerByDatesByRoomName")
	public List<RoomScheduler> getSchedulerByDatesByRoomName(@RequestBody final RoomSchedulers roomSchedulers){
		RoomScheduler roomScheduler = roomSchedulerService.addSchedule(roomSchedulers);
		return roomSchedulerRepository.findByRoomSchedulerByDtgAndRoom(roomScheduler.getRooms().getRoomName(), roomScheduler.getRoomSchedulerStartDtg(),
				roomScheduler.getRoomSchedulerEndDtg());
		
	}
	
	@PostMapping("/updateScheduler")
	public List<RoomScheduler> updateSchedule(@RequestBody final RoomSchedulers roomSchedulers){
		RoomScheduler roomScheduler = roomSchedulerService.addSchedule(roomSchedulers);
		roomSchedulerRepository.saveAndFlush(roomScheduler);
		return  getSchedule(roomSchedulers);
	}
	
	
	@PostMapping("/deleteSchedulerById")
	public boolean deleteSchedulerById(@RequestBody final RoomSchedulers roomSchedulers){
		roomSchedulerRepository.delete(roomSchedulers.getRoomSchedulerId());
		return true;
	}
	
	@PostMapping("/deleteScheduleByStartEndTime")
	public boolean deleteScheduleByStartEndTime(@RequestBody final RoomSchedulers roomSchedulers){
		List<RoomScheduler> roomScheduler=getSchedule(roomSchedulers);
		roomSchedulerRepository.delete(roomScheduler.get(0).getRoomSchedulerId());
		return true;
	}
	// Is not working yet to do changes.
	@PostMapping("/deleteScheduleByStartEndTimeByLoginId")
	public boolean deleteSchedulerByOwner(@RequestBody final RoomSchedulers roomSchedulers){
		List<RoomScheduler> roomScheduler=getScheduleByTimeAndLoginId(roomSchedulers);
		roomSchedulerRepository.delete(roomScheduler.get(0).getRoomSchedulerId());
		return true;
	}
	

}
