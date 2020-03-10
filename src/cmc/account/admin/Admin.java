/**
 * 
 */
package cmc.account.admin;

import cmc.account.Account;

/**
 * @author jkost001
 *
 */
public class Admin extends Account {

	public Admin(String firstname, String lastName, String username, String password, char type, char status) {
		super(firstname, lastName, username, password, type, status);
		// TODO Auto-generated constructor stub
	}
	
	public boolean logOn() {
		return true;
	}
	
}
