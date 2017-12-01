package com.cts.room.service.resource;

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
	public List<RoomScheduler> getAllByStartDate(@PathVariable("roomSchedulerStartDtg") @DateTimeFormat(pattern="yyyy-MM-dd") Date fromDate){
		return roomSchedulerRepository.findByRoomSchedulerStartDtg(fromDate,roomSchedulerService.adding23Hours(fromDate));
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
	
	@PostMapping("/getSchedulerByDatesByRoomName")
	public List<RoomScheduler> getSchedulerByDatesByRoomName(@RequestBody final RoomSchedulers roomSchedulers){
		RoomScheduler roomScheduler = roomSchedulerService.addSchedule(roomSchedulers);
		System.out.println(roomScheduler.getRooms().getRoomName());
		System.out.println(roomScheduler.getRoomSchedulerStartDtg());
		System.out.println(roomScheduler.getRoomSchedulerEndDtg());
		
		return roomSchedulerRepository.findByRoomSchedulerByDtgAndRoom(roomScheduler.getRooms().getRoomName(), roomScheduler.getRoomSchedulerStartDtg(),roomScheduler.getRoomSchedulerEndDtg());
		
	}
	
	@PostMapping("/updateScheduler")
	public List<RoomScheduler> updateSchedule(@RequestBody final RoomSchedulers roomSchedulers){
		RoomScheduler roomScheduler = roomSchedulerService.addSchedule(roomSchedulers);
		roomSchedulerRepository.saveAndFlush(roomScheduler);
		return  getSchedule(roomSchedulers);
	}
	
	
	

}
