package com.movehouse.entity;
import java.io.Serializable;


/**
 * 
 * date : 2017-10-03 18:34:31
 * author : mapper generator
 * description : 
 * 
 **/
public class Businessmen implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	**/
	private int id;

	/**
	 * 
	**/
	private String busName;

	/**
	 * 
	**/
	private String busLogo;

	/**
	 * 
	**/
	private String busIntroduction;

	/**
	 * 
	**/
	private String busSer;

	/**
	 * 
	**/
	private String busFixedtelephone;

	/**
	 * 
	**/
	private String busMobiletelephone;

	private String userName;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}

	public void setBusName(String busName){
		this.busName = busName;
	}
	public String getBusName(){
		return this.busName;
	}

	public void setBusLogo(String busLogo){
		this.busLogo = busLogo;
	}
	public String getBusLogo(){
		return this.busLogo;
	}

	public void setBusIntroduction(String busIntroduction){
		this.busIntroduction = busIntroduction;
	}
	public String getBusIntroduction(){
		return this.busIntroduction;
	}

	public void setBusSer(String busSer){
		this.busSer = busSer;
	}
	public String getBusSer(){
		return this.busSer;
	}

	public void setBusFixedtelephone(String busFixedtelephone){
		this.busFixedtelephone = busFixedtelephone;
	}
	public String getBusFixedtelephone(){
		return this.busFixedtelephone;
	}

	public void setBusMobiletelephone(String busMobiletelephone){
		this.busMobiletelephone = busMobiletelephone;
	}
	public String getBusMobiletelephone(){
		return this.busMobiletelephone;
	}



}