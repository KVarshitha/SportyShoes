package com.spring.boot.ss.models;

public class Admin {
	Integer AdminID;
	String AdminName;
	String password;
	public Integer getAdminID() {
		return AdminID;
	}
	public void setAdminID(Integer adminID) {
		AdminID = adminID;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String adminName, String password) {
		this.AdminName = adminName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [AdminID=" + AdminID + ", AdminName=" + AdminName + ", password=" + password + "]";
	}
	
	
}
