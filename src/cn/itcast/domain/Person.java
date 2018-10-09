package cn.itcast.domain;

public class Person {
	
	/**
	 * JavaBean Person
	 * 1.JavaBean规范
		* 这个java类必须有无参数的构造方法。
		* 属性私有化。
		* 提供了public get和set方法。get或者set只要有一个就行。
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
