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


public class UserController {

	// private List<User> regularUsers = new ArrayList<User>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}
<<<<<<< HEAD
	/**
	  * Add a new user  
	  *
	  * @param u user to be added
	  */
	public static boolean addUser(String username, String password) {
		User u = new User(username, password);
=======

	public static boolean addUser(String username, String password, String firstname, String lastname, char status) {
		User u = new User(username, password, firstname, lastname, status);
>>>>>>> 3e2f46ac04db277a04e0c2ca77870026ce47a229
		DatabaseController.addUser(u);
		return true;
	}
	
	/**
	  * Edit an existing user  
	  *
	  * @param u user to be added
	  */

	/**
	 * Edits the users username and password
	 * 
	 * @param username old username to be edited
	 * @param password old password to be edited
	 * @param newUsername new username for user
	 * @param newPassword new password for user
	 */
	public static void editUser(String username, String password, String newUsername, String newPassword) {
		Account u = DatabaseController.getUser(username, password);

		u.setUsername(newUsername);
		u.setPassword(newPassword);
		// save updated password and User name in database

	}
	
	/**
	 * deactivates the user
	 * 
	 * @param username the username of user being deactivated
	 * @param password the password of user being deactivated
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

	public ArrayList<University> getSavedSchoolList(String userName) {

		if (DatabaseController.lookupUser(userName) != null) {
			return DatabaseController.lookupUser(userName).getSavedSchools(userName);
		} else {
			return null;
		}

	}

	public static void showSchoolPage(String schoolName) {

		// TODO how to display and why getSchool and getUniversity
		University u = DatabaseController.getUniversity(schoolName);
	}

	public static void saveSchool(String schoolName) {
		// TODO Account and User confusion
		Account u = DatabaseController.getUser("sammy", "password");
		University s = DatabaseController.getUniversity(schoolName);
		// u.addSavedSchool(s);
	}
	
	public static void viewProfile() {
		
	}

	public static void viewToEditProfile(String username, String password, String newUsername, String newPassword) {
		User.editProfile(username, password, newUsername, newPassword);
	}

	public static void removeSchool(String userName, String schoolName) {

		if (DatabaseController.lookupUser(userName) != null) {
			DatabaseController.lookupUser(userName).removeSavedSchool(schoolName);
		}

	}
}
