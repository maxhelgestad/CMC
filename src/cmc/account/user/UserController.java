package cmc.account.user;

import java.util.*;
import javax.swing.JOptionPane;

import cmc.account.Account;
import cmc.database.DatabaseController;
import cmc.university.University;

/**
 * 
 */

/**
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

	public static boolean addUser(String username, String password) {
		User u = new User(username, password);
		DatabaseController.addUser(u);
		return true;
	}

	public static void editUser(String username, String password, String newUsername, String newPassword) {
		Account u = DatabaseController.getUser(username, password);

		u.setUsername(newUsername);
		u.setPassword(newPassword);
		// save updated password and User name in database

	}

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

	public static void removeSchool(String userName, String schoolName) {

		if (DatabaseController.lookupUser(userName) != null) {
			DatabaseController.lookupUser(userName).removeSavedSchool(schoolName);
		}

	}
}
