package cn.itcast.domain;

import java.util.Date;

public class User {
	
	/**
	 * JavaBean User
	 * 1.JavaBean�淶
		* ���java��������޲����Ĺ��췽����
		* ����˽�л���
		* �ṩ��public get��set������get����setֻҪ��һ�����С�
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
