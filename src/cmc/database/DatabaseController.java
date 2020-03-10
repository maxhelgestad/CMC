package cmc.database;

import java.awt.List;
import java.sql.Array;
import java.util.ArrayList;

import cmc.account.Account;
import cmc.account.user.User;
import cmc.search.Criteria;
import cmc.university.University;
import dblibrary.project.csci230.UniversityDBLibrary;

public class DatabaseController {
	private static UniversityDBLibrary lib;
	private static Account noUser;
	private static University noUniversity;

	public static void setUp(String username, String password) {
		lib = new UniversityDBLibrary(username, password);
		noUser = new Account("NoAccount", "l", "x", "x", 'u', 'y');
		noUniversity = new University("NoUniversity", "x", "x", "x", 0,0,0,0,0,0,0,0,0,0,0,0);
	}

	/**
	 * get a user by the given name
	 *
	 * @param user
	 *            name
	 *
	 * @reutrn a User with given user name
	 */
	public static Account lookupAccount(String username) {
		ArrayList<Account> accounts = DatabaseController.getAccounts();
		Account ac = noUser;
		for (int i = 0; i < accounts.size(); i++)
		{
			if(accounts.get(i).getUsername() == username)
			{
				ac = accounts.get(i);
			}
			else
			{
				System.out.println("Account with this username does not exits");
			}
		}
		return ac;
	}

	public static void adminUserEdit(String username, String newPassword, String newFirstName, String newLastName,
			char newType, char newStatus) {
		lib.user_editUser(username, newFirstName, newLastName, newPassword, newType, newStatus);
	}

	public static void addAccount(String firstName, String lastName, String username, String password, char type, char status) {
		lib.user_addUser(firstName, lastName, username, password, type);
	}
	
	public static void removeAccount(String username) {
		lib.user_deleteUser(username);
	}

	public static ArrayList<University> getSchool(String schoolName, int numStudents) {
		//TODO
	}

	public static University getUniversity(String name) {
		ArrayList<University> schools = DatabaseController.getUniversities();
		University un = noUniversity;
		for (int i = 0; i < schools.size(); i++) {
			if (schools.get(i).getName() == name) {
				un = (University)schools.get(i);
			} else {
				System.out.println("School with this name does not exits");
			}
		}
		return un;
	}

	public static void saveSchool(String username, String schoolName)
	{
		lib.user_saveSchool(username, schoolName);
	}
	
	public static void removeSchool(String username, String schoolName)
	{
		lib.user_removeSchool(username, schoolName);
	}

	public static ArrayList<University> getSavedSchools(String username){
		  String[][] saved = lib.user_getUsernamesWithSavedSchools();
		  ArrayList<University> result = new ArrayList<University>();
		  for(int i = 0; i < saved.length; i++)
		  {
			  if(saved[i].equals(username))
			  {
				  for(int j = 0; j < saved[i].length;j++) {
					  result.add(saved[i][j]);
				  }
			  }
		  }
		return result;
	}

	public static ArrayList<University> getUniversities() {
		String[][] u = lib.university_getUniversities();
		ArrayList<University> allSchools = new ArrayList<University>();
		University uni;
		for (int i = 0; u.length < i; i++) {
			uni = new University(u[i][0], u[i][1], u[i][2], u[i][3], Integer.parseInt(u[i][4]),
					Float.parseFloat(u[i][5]), Float.parseFloat(u[i][6]), Float.parseFloat(u[i][7]),
					Float.parseFloat(u[i][8]), Float.parseFloat(u[i][9]), Integer.parseInt(u[i][10]),
					Float.parseFloat(u[i][11]), Float.parseFloat(u[i][12]), Integer.parseInt(u[i][13]),
					Integer.parseInt(u[i][14]), Integer.parseInt(u[i][15]));
			allSchools.add(uni);
		}
		return allSchools;
	}
	
	public static ArrayList<Account> getAccounts(){
		String[][] a = lib.user_getUsers();
		ArrayList<Account> allAccounts = new ArrayList<Account>();
		for (int i = 0; a.length < i; i++) {
			char[] ch1 = a[i][4].toCharArray();
			char[] ch2 = a[1][5].toCharArray();
			Account acc = new Account(a[i][0], a[i][1], a[i][2], a[i][3], ch1[0], ch2[0]);
			allAccounts.add(acc);
		}
		return allAccounts;		
	}


}
