package cn.itcast.domain;

public class Person {
	
	/**
	 * JavaBean Person
	 * 1.JavaBean�淶
		* ���java��������޲����Ĺ��췽����
		* ����˽�л���
		* �ṩ��public get��set������get����setֻҪ��һ�����С�
	 */
	private String username;
	private String password;
	
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
	public Person(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public Person() {
		super();
	}
	public String toString() {
		return "Person [username=" + username + ", password=" + password + "]";
	}

}
