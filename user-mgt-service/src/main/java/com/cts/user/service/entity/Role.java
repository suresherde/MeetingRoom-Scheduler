package com.cts.user.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role", catalog="user_management")
public class Role {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="role_id")
	private Integer roleId;
	
	private String roleName;

	public Role() {
		// TODO Auto-generated constructor stub
	}

	public Role( String roleName) {
		super();
		this.roleName = roleName;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
	
}
