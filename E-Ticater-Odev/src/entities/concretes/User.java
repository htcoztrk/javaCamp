package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {
   private int id;
   private String firstName;
   private String lastName;
   private String email;
   private String pasword;
   private boolean isActive;
   public User() {
	   
   }
public User(int id, String firstName, String lastName, String email, String pasword, boolean isActive) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.pasword = pasword;
	this.isActive = isActive;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPasword() {
	return pasword;
}
public void setPasword(String pasword) {
	this.pasword = pasword;
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}
}
