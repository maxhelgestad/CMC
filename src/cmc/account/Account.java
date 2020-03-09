package cmc.account;


/**
 * 
 */

/**
 * @author mhelgesta001
 *
 */
public class Account
{
 //username for the account
 private String username;
 //password for the account
 private String password;
 
 /*
  * constructs an Account object
  * 
  * @param username - username of the account
  * @param password - password of the account
  */
public Account(String username, String password) {
	this.username = username;
	this.password = password;
}


/*
  * 
  */
 public boolean isValid(String username, String password)
 {
  return true;
 }
 
 /**
  * method to log on an account
  * 
  * @param username the username of the account to log on
  * @param password the password of the account to log on 
  * 
  * @return true if logged on succeeded, false if log on fails
  */
 public boolean logOn(String username, String password)
 {
  return true;
 }
 
 public String getUsername() {
  return this.username;
 }
 public String getPassword() {
  return this.password;
 }
 
 public void setUsername(String username) {
	 this.username = username;
 }
 
 public void setPassword(String password) {
	 this.password = password;
 }
 
 public String toString() {
  return username + " " + password;
 }
}
