package cn.itcast.domain;

import java.util.Date;

public class User {
	
	/**
	 * JavaBean User
	 * 1.JavaBean规范
		* 这个java类必须有无参数的构造方法。
		* 属性私有化。
		* 提供了public get和set方法。get或者set只要有一个就行。
	 */
	private String username;
	private String password;
	private double money;
	private Date birthday;
	
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
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
