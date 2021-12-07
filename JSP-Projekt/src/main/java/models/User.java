package models;

import java.util.Objects;

public class User {
	private String email;
	private String firstname;
	private String lastname;
	private String password;
	
	public User(String email, String firstname, String lastname, String password) {
		super();
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
	}
	
	public User() { this("", "", "", ""); }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int hashCode() {
		return Objects.hash(this.email, this.firstname, this.lastname, this.password);
	}
	
	public String ToString() {
		return this.email + " " + this.firstname + " " + this.lastname + " " + this.password;
	}
}
