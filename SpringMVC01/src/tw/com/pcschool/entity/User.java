/*
*
*Copyright (c) 2020, pcschool 
*/

package tw.com.pcschool.entity;
/**
*
*@author Lee
* 課程大綱:
*/
public class User {
	private String username;
	private String password;
	private String email;
	private int age;
	private Address address;
	
	
	
	public User() {
		
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", age=" + age
				+ ", address=" + address + "]";
	}
	
	
	
	
}
