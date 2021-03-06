package com.nwchecker.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	// User id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, unique = true)
	private int		id;
	// User name
	@Column(name = "username", columnDefinition = "varchar(64)", nullable = false, unique = true)
	private String	username;
	// Password
	@Column(name = "password", columnDefinition = "varchar(64)", nullable = false)
	private String	password;
	// Display name
	@Column(name = "display_name", columnDefinition = "varchar(64)")
	private String	displayName;
	// User email
	@Column(name = "email", columnDefinition = "varchar(255)", nullable = false, unique = true)
	private String	email;
	// Some university user data(probably faculty or group)
	@Column(name = "info", columnDefinition = "varchar(255)")
	private String	info;
	// User access level (user,teacher or admin).
	@Column(name = "access_level", columnDefinition = "varchar(8)")
	private String	accessLevel;
	// Department for teacher users.
	@Column(name = "department", columnDefinition = "varchar(255)")
	private String	department;
	// Ban Time - if exists 0 time while user will be inactive
	@Column(name = "ban_time", columnDefinition = "BIGINT")
	private long	banTime;
	// Enabled user
	@Column(name = "enabled", columnDefinition = "BOOLEAN default false")
	private boolean	enabled;

	public User() {
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public long getBanTime() {
		return banTime;
	}

	public void setBanTime(long banTime) {
		this.banTime = banTime;
	}

	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
