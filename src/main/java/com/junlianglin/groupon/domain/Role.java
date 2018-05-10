package com.junlianglin.groupon.domain;

import com.junlianglin.groupon.support.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_role")
public class Role extends AbstractEntity {

	@Column(name="role")
	private String role;
	

	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
