package cmc.account;

import java.util.ArrayList;
import java.util.List;

import cmc.database.DatabaseController;

/**
 * Account Controller handles communication with the DatabaseController/Database on anything
 * having anything to do Accounts (Users/Admins)
 * 
 * @author mli001
 *
 */
public class AccountController {
 //list of accounts
 public List<Account> accounts;

 /**Checks if a user something
 * 
 * @param userName of the user
 * @param password of the user
 * @return boolean checking the user
 */
 public boolean checkUser(String userName, String password) {
  return false;
 }
 
 
 /**Logs on a Account
  * 
  * @param userName of the user
  * @param password of the user
  * @return boolean if account was logged on
  */
 public static boolean logOn(String userName, String password) {
	 Account user = DatabaseController.lookupAccount(userName);
	 if(user == null) {
		 return false;
	 }
	 else if((!user.getPassword().equals(password))) {
		 return false;
	 }
	 else {
		 return true;
	 }
 }
 
 
 /**Gets a list of all the accounts
  * 
  * @return List of accounts
  */
 public static ArrayList<Account> getUsers()
 {
  return DatabaseController.getAccounts();
 }
 /**Adds account to the Database
  * 
  * @param firstName of the account
  * @param lastName of the account
  * @param username of the account
  * @param password of the account
  * @param type of the account
  * @param status of the account
  */
 public static void addAccount(String firstName, String lastName, String username, String password, char type, char status) {
		DatabaseController.addAccount(firstName, lastName, username, password, type, status);
	 }

 /**Edits an Account
 * 
 * @param username of the account
 * @param newPassword of the account
 * @param newFirstName of the account
 * @param newLastName of the account
 * @param newType of the account
 * @param newStatus of the account
 */
public static void editProfile(String username, String newPassword, String newFirstName, String newLastName,
		char newType, char newStatus) {
	DatabaseController.adminUserEdit(username, newPassword, newFirstName, newLastName, newType, newStatus);
	
}

/**
 * Deactivates an Account
 * 
 * @param username of the account
 */
public static void deactivateUser(String username) {
		DatabaseController.deactivateUser(username);
}

public static void activateUser(String username) {
	DatabaseController.activateUser(username);
}

}
