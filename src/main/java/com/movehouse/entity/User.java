package com.movehouse.entity;
import java.io.Serializable;


/**
 * 
 * date : 2017-10-10 16:37:31
 * author : mapper generator
 * description : 
 * 
 **/
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	**/
	private Integer uid;

	/**
	 * 
	**/
	private String uname;

	/**
	 * 
	**/
	private String upwd;



	public void setUid(Integer uid){
		this.uid = uid;
	}
	public Integer getUid(){
		return this.uid;
	}

	public void setUname(String uname){
		this.uname = uname;
	}
	public String getUname(){
		return this.uname;
	}

	public void setUpwd(String upwd){
		this.upwd = upwd;
	}
	public String getUpwd(){
		return this.upwd;
	}


}