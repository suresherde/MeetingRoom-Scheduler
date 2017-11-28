package com.cts.user.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login", catalog="user_management")
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="login_id")
	private Integer loginId;
	
	private String loginFName;
	private String loginLName;
	private String loginName;
	private String loginPassword;
	private String loginEmail;
	
	
}
