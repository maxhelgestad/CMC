package cmc.account.user;

import cmc.account.user.*;
import java.util.ArrayList;

import cmc.account.Account;
import cmc.search.Criteria;
import cmc.database.DatabaseController;
import cmc.university.University;

/**
 * Class for a User object that extends the Account class.
 * 
 * @author mhelgesta001
 *
 */
public class User extends Account {
	// the list of saved schools for a user
	private ArrayList<University> savedSchools;

	/**
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
	 * method to remove a school from the saved schools list
	 * 
	 * @param u - school to be removed
	 */
	public void removeSavedSchool(String schoolName) {
		for (int i = 0; i < this.savedSchools.size(); i++) {
			University result = this.savedSchools.get(i);

			if (result.getName().equals(schoolName)) {
				this.savedSchools.remove(result);
			}
		}
	}



}
