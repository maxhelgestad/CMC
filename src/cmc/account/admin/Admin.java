/**
 * 
 */
package cmc.account.admin;

import cmc.account.Account;

/**Admin account that extends account
 * @author jkost001
 *
 */
public class Admin extends Account {
/**Constructor for admin
 * 
 * @param firstname of the admin
 * @param lastName of the admin
 * @param username of the admin
 * @param password of the admin
 * @param type of the admin
 * @param status of the admin
 */
	public Admin(String firstname, String lastName, String username, String password, char type, char status) {
		super(firstname, lastName, username, password, type, status);
		
	}
	/**
	 * Logs an admin on
	 * @return boolean if Admin was logged on
	 */
	public boolean logOn() {
		return true;
	}
	
}
