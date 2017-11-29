package com.cts.user.service.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.util.DigestUtils;

@Entity
@Table(name="login", catalog="user_management")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="login_id")
	private Integer loginId;
	
	@Column(name="login_fname")
	private String loginFName;
	@Column(name="login_lname")
	private String loginLName;
	@Column(name="login_loginname", unique=true)
	private String loginName;
	@Column(name="login_loginpassword")
	
	private String loginPassword;
	@Column(name="login_email")
	private String loginEmail;
	@Column(name="login_phoneno")
	private String loginPhoneNo;
	
	@ManyToOne
	@JoinColumn(name="role_id", referencedColumnName="role_id")
	private Role roles;
	
	
	public Login(Integer loginId, String loginFName, String loginLName, String loginName, String loginPassword,
			String loginEmail, String loginPhoneNo, Role roles) {
		super();
		this.loginId = loginId;
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

	public Login() {
		
	}

	public Integer getLoginId() {
		return loginId;
	}
	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
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
		this.loginPassword = BCrypt.hashpw(loginPassword, BCrypt.gensalt());
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
