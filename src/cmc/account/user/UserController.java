package cmc.account.user;

import java.util.*;
import javax.swing.JOptionPane;

import cmc.account.Account;
import cmc.database.DatabaseController;
import cmc.university.University;



/**
 * Controller for the user and the things users can do
 * 
 * @author mli001
 *
 *
 */
public class UserController {

	// private List<User> regularUsers = new ArrayList<User>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

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
	//public static void editUser(String username, String password, String newUsername, String newPassword) {
		//Account u = DatabaseController.getUser(username, password);
		//u.setUsername(newUsername);
		//u.setPassword(newPassword);
		// save updated password and User name in database

	/**
	 * deactivates the user
	 * 
	 * @param username
	 *            the username of user being deactivated
	 * @param password
	 *            the password of user being deactivated
	 */
	public static void deactivateUser(String username, String password) {
		ArrayList<Account> a = DatabaseController.getAccounts();
		int i = 0;
		while (a.size() > i) {
			if (a.get(i).getUsername() == username && a.get(i).getPassword() == password) {
				a.remove(i);
			}
			i++;
		}
	}
	// save updated list to database

	/**
	 * communication method to retrieve a user's saved schools
	 * 
	 * @param userName the user looking for saved schools
	 * @return the ArrayList of schools saved by the user
	 */
	public static ArrayList<University> getSavedSchoolList(String userName) {
		return DatabaseController.getSavedSchools(userName);
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

	public static void viewProfile() {
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
	 * 
	 * @param username
	 * @param password
	 * @param newUsername
	 * @param newPassword
	 */
	public static void viewToEditProfile(String username, String newUsername, String newPassword, String newFirstName, String newLastName) {
		User.editProfile(username, newUsername, newPassword, newFirstName, newLastName);
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
