package com.cts.user.service.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Transient;

import com.cts.user.service.entity.Role;

public class Logins {

	private String loginFName;

	private String loginLName;
	
	private String loginName;
	

	private String loginPassword;
	
	private String loginEmail;
	
	private String loginPhoneNo;
	
	private Role roles;
	
	
	public Logins() {
		// TODO Auto-generated constructor stub
	}


	public Logins(String loginFName, String loginLName, String loginName, String loginPassword, String loginEmail,
			String loginPhoneNo, Role roles) {
		super();
		this.loginFName = loginFName;
		this.loginLName = loginLName;
		this.loginName = loginName;
		this.loginPassword = loginPassword;
		this.loginEmail = loginEmail;
		this.loginPhoneNo = loginPhoneNo;
		this.roles = roles;
	}






	public Role getRoles() {
		return roles;
	}






	public void setRoles(Role roles) {
		this.roles = roles;
	}






	public String getLoginFName() {
		return loginFName;
	}

	public void setLoginFName(String loginFName) {
		this.loginFName = loginFName;
	}

	public String getLoginLName() {
		return loginLName;
	}

	public void setLoginLName(String loginLName) {
		this.loginLName = loginLName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getLoginEmail() {
		return loginEmail;
	}

	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}

	public String getLoginPhoneNo() {
		return loginPhoneNo;
	}

	public void setLoginPhoneNo(String loginPhoneNo) {
		this.loginPhoneNo = loginPhoneNo;
	}



	





	


}
