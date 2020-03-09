
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

	public static void editUser(String username, String password) {
		Account u = DatabaseController.getUser(username, password);

		String newUsername = JOptionPane.showInputDialog("Enter a new username: ");
		String newPassword = JOptionPane.showInputDialog("Enter a new password: ");
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
				System.out.println("In IF statement");
			}
			i++;
		}
	}
	// save updated list to database

	public void getSavedSchoolList(String userName) {

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

	public void removeSchool(String userName, String schoolName) {

	}
}
