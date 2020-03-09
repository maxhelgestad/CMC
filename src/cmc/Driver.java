
package cmc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import cmc.account.Account;
import cmc.account.admin.AdminInteraction;
import cmc.account.user.UserInteraction;
import cmc.database.DatabaseController;
import cmc.university.University;

/**
 * 
 */

/**
 * Driver Class to test first six use cases
 * 
 * @author mhelgesta001
 *
 */
public class Driver {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		DatabaseController.setUp("javengers", "csci230");
		
		
		
		
		
		File file = new File("output.txt");
		
		PrintWriter pw = new PrintWriter(file);
		

	public static void main(String[] args) {


		DatabaseController.setUp("javengers", "csci230");

		// Successful Login
		pw.println("Login was success: (should be true)" + UserInteraction.logOn("sammy", "password"));
		// Failed Login (wrong password)
		pw.println("Login was success: (should be false)" + UserInteraction.logOn("sammy", "pasword"));
		// Failed (not a user)
		pw.println("Login was success: (should be false)" + UserInteraction.logOn("max", "123"));
		pw.println("------------------------------");

		// (User) Search for schools by a combination of state and number of students
		// //(User) View search results
		ArrayList<University> schools = UserInteraction.searchSchool("CSB", 1000);
		for (int i = 0; i < schools.size(); i++) {
			pw.println(schools.get(i).toString());
			pw.println();
		}
		pw.println("------------------------------");

		// (User) Find top 5 recommended schools for a given school
		float[] ratings = UserInteraction.displaySimilarSchools("SJU");
		pw.println("Similarity Ratings for top 5 similar schools to SJU");
		pw.println("CSB: " + ratings[0] + '\n' + "UST: " + ratings[1] + '\n' + " hi: " + ratings[2] + '\n'
				+ "max: " + ratings[3] + '\n' + "UMN: " + ratings[4]);

		pw.println("------------------------------");

		// (Admin) View list of universities
		ArrayList<University> universities = AdminInteraction.viewUniversities();
		for (int i = 0; i < universities.size(); i++) {
			pw.println(universities.get(i).toString());
			pw.println();
		}
		pw.println("------------------------------");

		// (Admin) View list of users
		ArrayList<Account> users = AdminInteraction.viewUsers();
		for (int i = 0; i < users.size(); i++) {
			pw.println(users.get(i).toString());
		}

		// (User) Save a school to saved schools list
		UserInteraction.saveSchool("SJU");        System.out.println("end");

		// (User)
		UserInteraction.showSchoolPage("SJU"PrintWriter(String fileName)
				Creates a new PrintWriter, without automatic line flushing, with the specified file name.);

		// (Admin) Add a new User
		pw.println("Admin added a new user" + AdminInteraction.addUser("jack", "password"));

		// (Admin) Edit a user
		pw.println("------------------------------");
		pw.println("(Old Username and Password)");
		for (int i = 0; i < users.size(); i++) {
			pw.println(users.get(i).toString());
		}
		AdminInteraction.editUser("sammy", "password", "Sammy", "Password");

		AdminInteraction.editUser("james", "12345", "James", "123456");

		pw.println("(Updated Username and Password)");
		for (int i = 0; i < users.size(); i++) {
			pw.println(users.get(i).toString());
		}

		// (Admin) Deactivate a user
		pw.println("------------------------------");
		pw.println("(Old list of users)");
		for (int i = 0; i < users.size(); i++) {
			pw.println(users.get(i).toString());
		}
		AdminInteraction.deactivateUser("james", "12345");

		AdminInteraction.deactivateUser("Sammy", "Password");

		pw.println("(New list of users *one removed*)");
		ArrayList<Account> u = AdminInteraction.viewUsers();
		for (int i = 0; i < u.size(); i++) {
			pw.println(u.get(i).toString());
		}
		
		
		
		
          pw.close();
		}
		
		}

	

