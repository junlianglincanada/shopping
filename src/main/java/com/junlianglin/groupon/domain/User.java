package com.junlianglin.groupon.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import com.junlianglin.groupon.support.AbstractEntity;
//import org.springframework.data.annotation.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Table(name = "t_user")
public class User extends AbstractEntity {


	@Column(name = "email")
	@Email(message = "*Please provide a valid Email")
	@NotEmpty(message = "*Please provide an email")
	private String email;

	@Column(name = "password")
	@Size(min = 5, message = "*Your password must have at least 5 characters")
	@NotEmpty(message = "*Please provide your password")
	//@Transient
	private String password;
	@Column(name = "name")
	@NotEmpty(message = "*Please provide your name")
	private String name;
	@Column(name = "last_name")
	@NotEmpty(message = "*Please provide your last name")
	private String lastName;

	@Column(name = "active", nullable = false)
	private boolean active;

	@Column(name = "create_date",updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@org.hibernate.annotations.CreationTimestamp
	private Date createDate;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "t_user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public void setEnabled(boolean active) {
		this.active = active;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


}
