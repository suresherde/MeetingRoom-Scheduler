package com.cts.user.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.cts.user.service.entity.Login;



public interface LoginRepository extends JpaRepository<Login, Integer> {
	List<Login> findByLoginName(String loginName);
	@Query(value="select * from login where login_loginname = ?1", nativeQuery=true)
	List<Login> findByLoginNamePassword(String loginName);

}
