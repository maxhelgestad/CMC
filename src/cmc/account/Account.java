package cmc.account;

/**
 * 
 */

/**
 * Class to construct and modify Account objects. This class is the superclass for the User and Admin classes
 * 
 * @author mhelgesta001
 *
 */
public class Account {
	// username for the account
	private String username;
	// password for the account
	private String password;
	// firstname for the account
	private String firstname;
	// lastName for the account
	private String lastName;
	// type for the account
	private char type;
	// status for the account
	private char status;

	/**
	 * constructs an Account object
	 * @param firstname
	 * 			  - first name of the account
	 * @param lastName
	 * 			  - last name of the account
	 * @param username
	 *            - username of the account
	 * @param password
	 *            - password of the account
	 * @param type
	 * 			  - type of the account
	 * @param status
	 * 			  - status of the account
	 */
	public Account(String firstname, String lastName, String username, String password, char type, char status) {
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastName = lastName;
		this.type = type;
		this.status = status;
	}

	/**Checks to see if a user is valid or invalid
	 * 
	 * @param username - username of the user
	 * @param password - password of the user
	  * @return boolean if user is valid or invalid
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
	/**
	 * Method to get username for an account
	 * 
	 * @return username of the account
	 */
	public String getUsername() {
		return this.username;
	}
	/**
	 * Method to get the password for the account
	 * 
	 * @return password of the account
	 */
	public String getPassword() {
		return this.password;
	}
/**
 * Method to set username
 * 
 * @param username that will become the new username
 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**Sets the password for an account
	 * 
	 * @param password that will become the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * sets the first name for an account
	 * 
	 * @param firstname first name to update
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	

	/**Returns the type of the account
	 * 
	 * @return type of the account
	 */
	public char getType() {
		return this.type;
		
	}
	/**Returns a string containing the information about the user
	 * 
	 * @return String of all the information of the user
	 */
	public String toString() {
		return "Firstname: " + firstname + "\nLastname: " + lastName + "\nUsername: "+username + "\nPassword: " + password + "\n";
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
