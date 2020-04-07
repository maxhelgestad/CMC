/**
 * A class to control the User object
 * 
 * @author mli001
 *
 */

//import user package
package cmc.account.user;
//import list
import java.util.*;
import javax.swing.JOptionPane;

import cmc.account.Account;
import cmc.database.DatabaseController;
import cmc.university.University;



/**
 * User Controller handles communication with the DatabaseController/Database on anything
 * having anything to do with Users
 * 
 * @author mli001
 *
 *
 */

public class UserController {


	/**
	  * Add a new user  
	  *
	  * @param u user to be added
	  */
	
	public static boolean addUser(String firstname, String lastname, String username, String password, char type, char status) {
		DatabaseController.addAccount(firstname, lastname, username, password, type, status);
		return true;
	}
	

	/**
	 * Edits the users username and password
	 * 
	 * @param username
	 *            old username to be edited
	 * @param password
	 *            old password to be edited
	 * @param newUsername
	 *            new username for user
	 * @param newPassword
	 *            new password for user
	 */
	//public static void editUser(String username, String newPassword, String newStatus, String newType) {
		//Account u = DatabaseController.lookupAccount(username);
		//if (u == null){
		//		System.out.println("That account does not exist");
		//}
		//else{
		//
		//u.setPassword(newPassword);
		//u.setFirstname(*newFirstName*);
		//u.setLastname(*newLastName*);
		//u.setStatus(*newStatus*);
		//u.setType(*newType*);

	/**
	 * deactivates the user
	 * 
	 * @param username
	 *            the username of user being deactivated
	 * @param password
	 *            the password of user being deactivated
	 */
	//public static void deactivateUser(String username, String password) {
	//	Account a = DatabaseController.lookupAccount(username);
	//	if (a == null) {
	//		System.out.println("That account does not exist");
	//	}
	//	else {
	//	DatabaseController.removeAccount(username);
	//	}
		
	//}
	// save updated list to database

	/**
	 * communication method to retrieve a user's saved schools
	 * 
	 * @param userName the user looking for saved schools
	 * @return the ArrayList of schools saved by the user
	 */
	public static ArrayList<University> getSavedSchoolList(String username) {
		return DatabaseController.getSavedSchools(username);
	}

	/**
	 * Method to display the school's page
	 * 
	 * @param schoolName the school to see the page for
	 */
	public static void showSchoolPage(String schoolName) {

		// TODO how to display and why getSchool and getUniversity
		University u = DatabaseController.getUniversity(schoolName);
	}

	/**
	 * Communication method on which school a user wants to add to their school list
	 * 
	 * @param username the user wishing to add a school
	 * @param schoolName the school they want to add
	 */
	public static void saveSchool(String username, String schoolName) {
		DatabaseController.saveSchool(username, schoolName);
	}
	
	/**
	 * Method to view the profile of a user
	 * 
	 * @param username the user who is viewing profile
	 * @return the Account for the user
	 */
	public static Account viewProfile(String username) {
		return DatabaseController.lookupAccount(username);
		
	}

	/**
	 * Method for user to edit profile
	 * 
	 * @param username of user to be edited
	 * @param newPassword of user
	 * @param newFirstName of user
	 * @param newLastName of user
	 * @param type of user
	 * @param status of user
	 */
	public static void viewToEditProfile(String username, String newPassword, String newFirstName, String newLastName, char type, char status) {
		DatabaseController.userEdit(username, newPassword, newFirstName, newLastName, type, status);
	}

	/**
	 * Method to communicate with database controller on which user to remove a school from
	 * 
	 * @param userName the specific user who wants to remove a school
	 * @param schoolName the school the user wants to remove from their saved list
	 */
	public static void removeSchool(String userName, String schoolName) {
		DatabaseController.removeSchool(userName, schoolName);
	}
}
