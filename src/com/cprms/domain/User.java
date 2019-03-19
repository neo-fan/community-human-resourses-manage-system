/**
 * 
 */
package com.cprms.domain;

/**
 * @author cheng
 * @version 2018年12月30日下午7:43:48
 */
public class User {
	private int id;
	private String username;
	private String password;
	private String verifyCode;
	

	public User() {
		super();
	}
	
	public User(String username, String password, String verifyCode) {
		this(0,username,password,verifyCode);
	}
	
	public User(String username, String password) {
		this(0,username,password,null);
	}

	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param verifyCode
	 */
	public User(int id, String username, String password, String verifyCode) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.verifyCode = verifyCode;
	}

	/**
	 * @param i
	 * @param string
	 * @param string2
	 */
	public User(int id, String username, String password) {
		this(id,username,password,null);
	}

	@Override
	public String toString() {
		return this.username+":"+this.id+":"+this.password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getVerifyCode() {
		return verifyCode;
	}
	
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
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
	
}
