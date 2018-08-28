package com.ccunix.icar.register.domain;

import java.io.Serializable;

public class Userinfo implements Serializable{
private int user_id;
private int kind_id;
private String user_number;
private String user_pw;
private String user_name;
private String user_phone;
private String user_card;
private int status;//1 在职 0 离职
public Userinfo() {
	 
}
 
public Userinfo(int user_id, int kind_id, String user_number, String user_pw,
		String user_name, String user_phone, String user_card, int status) {
	super();
	this.user_id = user_id;
	this.kind_id = kind_id;
	this.user_number = user_number;
	this.user_pw = user_pw;
	this.user_name = user_name;
	this.user_phone = user_phone;
	this.user_card = user_card;
	this.status = status;
}

public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public int getKind_id() {
	return kind_id;
}
public void setKind_id(int kind_id) {
	this.kind_id = kind_id;
}
public String getUser_number() {
	return user_number;
}
public void setUser_number(String user_number) {
	this.user_number = user_number;
}
public String getUser_pw() {
	return user_pw;
}
public void setUser_pw(String user_pw) {
	this.user_pw = user_pw;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getUser_phone() {
	return user_phone;
}
public void setUser_phone(String user_phone) {
	this.user_phone = user_phone;
}
public String getUser_card() {
	return user_card;
}
public void setUser_card(String user_card) {
	this.user_card = user_card;
}

public int getStatus() {
	return status;
}

public void setStatus(int status) {
	this.status = status;
}



}
