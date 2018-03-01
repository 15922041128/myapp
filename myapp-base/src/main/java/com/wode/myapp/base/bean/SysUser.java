package com.wode.myapp.base.bean;

import java.io.Serializable;

public class SysUser implements Serializable{
	
	
	private static final long serialVersionUID = 7785752632394831910L;

	private int id;
	
	private String userName;
	
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public SysUser() {
		super();
	}
	
	public SysUser(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
}
