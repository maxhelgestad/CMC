package cmc.account.admin;

import java.util.ArrayList;

import cmc.account.Account;
import cmc.account.AccountController;
import cmc.account.user.UserController;
import cmc.university.University;
import cmc.university.UniversityController;


/**Class to handel Admin Interaction
 * @author vkahlhame001
 *
 */
public class AdminInteraction {

 /** Returns a list of the Universities
 * @return List containing the universities
 */
 public static ArrayList<University> viewUniversities() {
  return UniversityController.viewUniversities();
 }
 
/** Returns a list of the Regular Users
 * @return List containing the regular users
 */
 public static ArrayList<Account> viewUsers() {
	ArrayList<Account> users = new ArrayList<Account>();
	ArrayList<Account> accounts = AccountController.getUsers();
	//System.out.println(accounts);
	for(int i = 0; i < accounts.size(); i++) {
		if (accounts.get(i).getType() == 'u' ) {
			users.add(accounts.get(i));
		}
	}
	return users;
 }
 
	
/** Adds an account
 * @param firstName of the account
 * @param lastName of the account
 * @param username of the account
 * @param password of the account
 * @param type of the account
 * @param status of the account
 */	
 public static void addAccount(String firstName, String lastName, String username, String password, char type, char status) {
	AccountController.addAccount(firstName, lastName, username, password, type, status);
 }
 
 //public static void editUser(String username, String password, String newUsername, String newPassword) {
	 //UserController.editUser(username, password, newUsername, newPassword); 
 //}
 
	
/** Deactivates an account
 * @param username of the account
 * @param password of the account
 */
 public static void deactivateUser(String username, String password) {
	 UserController.deactivateUser(username, password);
 }

/** Edits an account
 * @param firstName of the account
 * @param lastName of the account
 * @param username of the account
 * @param password of the account
 * @param type of the account
 * @param status of the account
 */
public static void editProfile(String username, String newPassword, String newFirstName, String newLastName, char newType, char newStatus) {
	AccountController.editProfile(username, newPassword,  newFirstName, newLastName, newType, newStatus);	
}

}
