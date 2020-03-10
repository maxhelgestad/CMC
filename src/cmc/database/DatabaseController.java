package cmc.database;

import java.awt.List;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import cmc.account.Account;
import cmc.account.user.User;
import cmc.search.Criteria;
import cmc.university.University;
import dblibrary.project.csci230.UniversityDBLibrary;
/**
 * A class to communicate with the database and relay the information to the rest of the 
 * classes in the cmc website
 * 
 * @author Javengers
 *
 */
public class DatabaseController {
	private static UniversityDBLibrary lib;
	private static Account noUser;
	private static University noUniversity;

	/**
	 * Initializes the database and logs in with username and password
	 * 
	 * @param username our database username
	 * @param password our database password
	 */
	public static void setUp(String username, String password) {
		lib = new UniversityDBLibrary(username, password);
		noUser = new Account("NoAccount", "x", "x", "x", 'u', 'y');
		noUniversity = new University("NoUniversity", "x", "x", "x", 0,0,0,0,0,0,0,0,0,0,0,0);
	}

	/**
	 * get a user by the given name
	 *
	 * @param username the user to retrieve from the database
	 *
	 * @return a User with given user name
	 */
	public static Account lookupAccount(String username) {
		ArrayList<Account> accounts = DatabaseController.getAccounts();
		Account ac = noUser;
		for (int i = 0; i < accounts.size(); i++)
		{
			if(accounts.get(i).getUsername().equals(username))
			{
				ac = accounts.get(i);
			}
		}
		return ac;
	}

	/**
	 * Method for admin to edit an existing user, username cannot be changed
	 * 
	 * @param username the user to edit
	 * @param newPassword the updated password for the user
	 * @param newFirstName the updated first name for the user
	 * @param newLastName the updated last name for the user
	 * @param newType the updated type for the user
	 * @param newStatus the updated status for the user
	 */
	public static void adminUserEdit(String username, String newPassword, String newFirstName, String newLastName,
			char newType, char newStatus) {
		lib.user_editUser(username, newFirstName, newLastName, newPassword, newType, newStatus);
	}

	/**
	 * Method for admins to add new accounts to the system
	 * 
	 * @param firstName new account first name
	 * @param lastName new account last name
	 * @param username new account's username
	 * @param password new account's password
	 * @param type a for admin, u for user
	 * @param status y for active, n for inactive
	 */
	public static void addAccount(String firstName, String lastName, String username, String password, char type, char status) {
		lib.user_addUser(firstName, lastName, username, password, type);
	}
	
	/**
	 * Method for admins to remove accounts from the database
	 * 
	 * @param username the user to remove
	 */
	public static void removeAccount(String username) {
		lib.user_deleteUser(username);
	}

	//public static ArrayList<University> getSchool(String schoolName, int numStudents) {
		//TODO
	//}

	/**
	 * A method to get the university object for a specific university name
	 * 
	 * @param name the name of the university to retrieve
	 * @return the University object for the specified name
	 */
	public static University getUniversity(String name) {
		ArrayList<University> schools = DatabaseController.getUniversities();
		University un = noUniversity;
		for (int i = 0; i < schools.size(); i++) {
			if (schools.get(i).getName() == name) {
				un = (University)schools.get(i);
			}
		}
		return un;
	}

	/**
	 * Method to save a school to a user's saved schools in the database
	 * 
	 * @param username the user to save the school to
	 * @param schoolName The school to save to the user
	 */
	public static void saveSchool(String username, String schoolName)
	{
		lib.user_saveSchool(username, schoolName);
	}
	
	/**
	 * A method to remove a specified school from a specified user's saved school list
	 * 
	 * @param username the user to remove the school from
	 * @param schoolName the school to remove
	 */
	public static void removeSchool(String username, String schoolName)
	{
		lib.user_removeSchool(username, schoolName);
	}
	/**
	 * A method to get all the saved schools for a specific user
	 * 
	 * @param username the user for which to get their saved school list
	 * @return an ArrayList of universities that the specified user has saved
	 */
	public static ArrayList<University> getSavedSchools(String username){
		  String[][] saved = lib.user_getUsernamesWithSavedSchools();
		  ArrayList<University> result = new ArrayList<University>();
		  for(int i = 0; i < saved.length; i++)
		  {
			  if(saved[i][0].equals(username))
			  {
				  for(int j = 0; j < saved[i].length;j++) {
					  result.add(getUniversity(saved[i][j]));
				  }
			  }
		  }
		return result;
	}

	/**
	 * Method to retrieve all of the universities in the database
	 * 
	 * @return an ArrayList of Universities 
	 */
	public static ArrayList<University> getUniversities() {
		String[][] u = lib.university_getUniversities();
		ArrayList<String> us = new ArrayList<String>();
		for (int i = 1; u.length > i; i++) {
			us.add(Arrays.toString(u[i]));
		}
		
		
		ArrayList<University> allSchools = new ArrayList<University>();
		University uni;
		for (int i = 0; us.size() > i; i++) {
			uni = new University(u[i][0], u[i][1], u[i][2], u[i][3], Integer.parseInt(u[i][4]),
					Float.parseFloat(u[i][5]), Float.parseFloat(u[i][6]), Float.parseFloat(u[i][7]),
					Float.parseFloat(u[i][8]), Float.parseFloat(u[i][9]), Integer.parseInt(u[i][10]),
					Float.parseFloat(u[i][11]), Float.parseFloat(u[i][12]), Integer.parseInt(u[i][13]),
					Integer.parseInt(u[i][14]), Integer.parseInt(u[i][15]));
			allSchools.add(uni);
		}
		return allSchools;
	}
	
	/**
	 * Method to retrieve all the accounts from the database
	 * 
	 * @return an ArrayList of ACcounts 
	 */
	public static ArrayList<Account> getAccounts(){
		String[][] a = lib.user_getUsers();
		ArrayList<String> ac = new ArrayList<String>();
		for (int i = 1; a.length > i; i++) {
			ac.add(Arrays.toString(a[i]));
		}
		
		ArrayList<Account> allAccounts = new ArrayList<Account>();
		for (int i = 0; ac.size() > i; i++) {
			char[] ch1 = a[i][4].toCharArray();
			char[] ch2 = a[1][5].toCharArray();
			Account acc = new Account(a[i][0], a[i][1], a[i][2], a[i][3], ch1[0], ch2[0]);
			allAccounts.add(acc);
		}
		return allAccounts;	
		
	}


}
