package user;

import java.util.concurrent.atomic.AtomicInteger;

public class User {
	
	
	private static final AtomicInteger counter = new AtomicInteger(0);
	private int userID;
	private String name;
	private int age;
	private String email;
	private String password;
	
	
	public User(String name,int age, String email, String password) {
		//auto-increment id 
		this.userID = counter.incrementAndGet();
		
		this.setName(name);
		this.setAge(age);
		this.setEmail(email);
		this.setPassword(password);
		
	}
	
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("User ID : " + this.getUserID() + "\nName : " + this.getName());
		
		return builder.toString();
	}


	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


}
