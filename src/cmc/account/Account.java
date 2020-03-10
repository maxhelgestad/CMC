package cmc.account;

/**
 * 
 */

/**
 * @author mhelgesta001
 *
 */
public class Account {
	// username for the account
	private String username;
	// password for the account
	private String password;
	private String firstname;
	private String lastName;
	private char type;
	private char status;

	/**
	 * constructs an Account object
	 * 
	 * @param username
	 *            - username of the account
	 * @param password
	 *            - password of the account
	 */
	public Account(String firstname, String lastName, String username, String password, char type, char status) {
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastName = lastName;
		this.type = type;
		this.status = status;
	}

	/**
	  * 
	  */
	public boolean isValid(String username, String password) {
		return true;
	}

	/**
	 * method to log on an account
	 * 
	 * @param username
	 *            the username of the account to log on
	 * @param password
	 *            the password of the account to log on
	 * 
	 * @return true if logged on succeeded, false if log on fails
	 */
	public boolean logOn(String username, String password) {
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
	
	public char getType() {
		return this.type;
		
	}

	public String toString() {
		return "Firstname: " + firstname + "Lastname: " + lastName + "Username: "+username + "Password" + password;
	}
}
