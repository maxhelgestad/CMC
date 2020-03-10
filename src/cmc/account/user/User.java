package cmc.account.user;

import cmc.account.user.*;
import java.util.ArrayList;

import cmc.account.Account;
import cmc.search.Criteria;
import cmc.database.DatabaseController;
import cmc.university.University;

/**
 * Class for a User object that extends the Account class.
 */

/**
 * @author mhelgesta001
 *
 */
public class User extends Account {
	// the list of saved schools for a user
	private ArrayList<University> savedSchools;

	/*
	 * constructs a User object
	 * 
	 * @param userName - username of the user
	 * 
	 * @param password - password of the user
	 */
	public User(String firstName, String lastName, String userName, String password, char type, char status) {
		super(firstName, lastName, userName, password, 'u', status);
		this.savedSchools = new ArrayList<University>();
	}

	/*
	 * 
	 */
	public void searchSchool(Criteria c) {
		// TODO
	}

	/*
	 * 
	 */
	// public boolean logOn(String username, String password) {
	// DatabaseController.getUser(username, password);
	// }

	/**
	 * method for the user to view their profile
	 * 
	 * @return this user's profile
	 */
	//public static Profile viewProfile() {
	//	return new Profile("", "", "", "", "");
	//}

	/**
	 * method to add a school to the saved schools list
	 * 
	 * @param u
	 *            - school to be added
	 */
	//public void addSavedSchool(University u) {
		//if (this.savedSchools.contains(u) != true) {
			//this.savedSchools.add(u);
		//} else {
		//	System.out.println("School is already saved");
		//}
	//}

	/*
	 * method to remove a school from the saved schools list
	 * 
	 * @param u - school to be removed
	 */
//	public void removeSavedSchool(String schoolName) {
		//for (int i = 0; i < this.savedSchools.size(); i++) {
			//University result = this.savedSchools.get(i);

			//if (result.getName().equals(schoolName)) {
			//	this.savedSchools.remove(result);
			//}
		//}
	//}

	/*
	 * method to return a users saved schools list
	 * 
	 * @param username - the username of the user to return their savedSchools list
	 * 
	 * @return ArrayList<University> - the list of saved schools schools
	 */
	//public ArrayList<University> getSavedSchools(String username) {
		// TODO parameter???
		//return this.savedSchools;
	//}

	public static void editProfile(String username, String password, String newUsername, String newPassword) {
		Account u = DatabaseController.getUser(username, password);

		u.setUsername(newUsername);
		u.setPassword(newPassword);
		// save updated password and User name in database
	}
}
