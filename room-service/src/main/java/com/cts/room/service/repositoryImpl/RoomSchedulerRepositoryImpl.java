package com.cts.room.service.repositoryImpl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.cts.room.service.entity.RoomScheduler;
import com.cts.room.service.repository.RoomSchedulerRepository;

public class RoomSchedulerRepositoryImpl implements RoomSchedulerRepository{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public List<RoomScheduler> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoomScheduler> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoomScheduler> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends RoomScheduler> List<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends RoomScheduler> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<RoomScheduler> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RoomScheduler getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends RoomScheduler> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends RoomScheduler> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<RoomScheduler> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends RoomScheduler> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoomScheduler findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(RoomScheduler entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends RoomScheduler> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends RoomScheduler> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends RoomScheduler> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends RoomScheduler> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends RoomScheduler> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<RoomScheduler> findByRoomSchedulerStartDtg(Date roomSchedulerStartDtg, Date roomSchedulerEndDtg) {
		
		
		
		return null;
	}

	@Override
	public List<RoomScheduler> findByRoomSchedulerStartEndDtg(Date roomSchedulerStartDtg, Date roomSchedulerEndDtg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoomScheduler> findByRoomSchedulerByDtgAndRoom(String roomName, Date roomSchedulerStartDtg,
			Date roomSchedulerEndDtg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoomScheduler> findByRoomSchedulerId(int roomSchedulerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteScheduleByDatesAndByLoginId(Integer loginId, Date roomSchedulerStartDtg,
			Date roomSchedulerEndDtg) {
		// TODO Auto-generated method stub
		
	}



}
