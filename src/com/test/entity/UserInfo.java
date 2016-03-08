package com.test.entity;

public class UserInfo {
	private int userId;
	private String userName;
	private String remark;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public UserInfo(int userId, String userName, String remark) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.remark = remark;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
