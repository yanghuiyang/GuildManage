package com.groupfive.gm.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="SysUser")
public class SysUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="userId")
	private Integer userId;
	@Column(name="userName")
	private String userName;
	@Column(name="userPwd")
	private String userPwd;
	@Column(name="userTrueName")
	private String userTrueName;
	@Column(name="userIsused")
	private Integer userIsused;
	@ManyToOne(targetEntity=Role.class)  
    @JoinColumn(name="roleId") 
	private Role role;
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserTrueName() {
		return userTrueName;
	}
	public void setUserTrueName(String userTrueName) {
		this.userTrueName = userTrueName;
	}
	public Integer getUserIsused() {
		return userIsused;
	}
	public void setUserIsused(Integer userIsused) {
		this.userIsused = userIsused;
	}
	
}
