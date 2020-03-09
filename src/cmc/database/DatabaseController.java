package cmc.database;

import java.awt.List;
import java.sql.Array;
import java.util.ArrayList;

import cmc.account.Account;
import cmc.account.user.User;
import cmc.university.University;
import dblibrary.project.csci230.UniversityDBLibrary;

public class DatabaseController {
	private static UniversityDBLibrary lib;

	public static void setUp(String username, String password) {
		lib = new UniversityDBLibrary(username, password);
	}

	public static ArrayList<University> getSchool(String schoolName, int numStudents) {

	}

	public static Account getUser(String username, String password) {

	}

	public static University getUniversity(String name) {

	}

	public void getSchoolDetails(String schoolName) {
	}

	public static User lookupUser(String username) {

	}

	public void updateSavedSchoolList(String username) {
	}

	public void updateSavedUser(User user) {

	}

	public static void addUser(User user) {
	}

	public static ArrayList<Account> getAccounts() {

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
}
