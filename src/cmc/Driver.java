
package cmc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import cmc.account.Account;
import cmc.account.admin.AdminInteraction;
import cmc.account.user.UserInteraction;
import cmc.database.DatabaseController;
import cmc.search.Criteria;
import cmc.university.University;


/**
 * Driver class to test back end functionality for first twelve uses cases
 * 
 * @author javengers
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
		
		// (Admin) Add a new User
		System.out.println("add new account under name max helgestad");
		AdminInteraction.addAccount("Max", "Helgestad", "maxh", "ilovemom", 'u', 'Y');                     //U1 Add a new User

		System.out.println("------------------------------");
		
		
		// Successful Login
		System.out.println("Login was success(should be true): " + UserInteraction.logOn("juser", "user"));
		// Failed Login (wrong password)
		System.out.println("Login was unsuccessful wrong passowrd(should be false): " + UserInteraction.logOn("juser", "pasword"));       //U2 LogOn
		// Failed (not a user)
		System.out.println("Login was unsuccessful not a user(should be false): " + UserInteraction.logOn("max", "123"));
		System.out.println("------------------------------");

		//(user) view profile
		Account a = UserInteraction.viewProfile("juser");  
		System.out.println("Viewing the profile of username juser");																										//U3 view Profile
		System.out.println(a.toString());
		
		System.out.println("------------------------------");                        

		
		
		// (User) Search for schools by a combination of state and number of students
		// //(User) View search results
		//Criteria c = new Criteria("v", "M", "x", "x", 0,0,0,0,0,0,0,0,0,0,0,0);                   //U5 Search school by different Criteria
		//ArrayList<University> schools = UserInteraction.searchSchool(c);                      
		//for (int i = 0; i < schools.size(); i++) {
			//System.out.println(schools.get(i).toString());
			//System.out.println();
		//}
		System.out.println("------------------------------");
		
		//(admin) edit profile                                                                               //U6 Edit profile
		AdminInteraction.editProfile("luser", "user2", "Laura", "Helgestad", 'u', 'y');
		System.out.println("Edited user luser profile");
		
		System.out.println("------------------------------");
		System.out.println("Printing off all of the users");
		ArrayList<Account> users = AdminInteraction.viewUsers();											 //U13 View Users
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).toString());
		}
		
		// (Admin) View list of universities
		System.out.println("------------------------------");
		System.out.println("Printing off all of the universities (limited to five)");
		ArrayList<University> universities = AdminInteraction.viewUniversities();                 //U12 View Universities
		for (int i = 0; i < 5; i++) {
			System.out.println(universities.get(i).toString());
			System.out.println();
		}
		System.out.println("Adding a school to the saved school list");
		// (User) Save a school to saved schools list                                                       //U10 Save sChool to the saved School List
		UserInteraction.saveSchool("juser", "YALE"); 
		UserInteraction.saveSchool("juser", "AUBURN"); 
		System.out.println("------------------------------");
		
		
		//(User) View Saved Schools  																					//U4 View Saved School List
		System.out.println("Viewing Saved Schools");
		ArrayList<University> savedSchools = UserInteraction.showSavedSchoolList("juser");                   
		for (int i = 0; i < savedSchools.size(); i++) {
			University u = savedSchools.get(i);
			if (!u.getName().equals("NoUniversity")) {
			System.out.println(savedSchools.get(i).toString());
			System.out.println();
			}
		}
		System.out.println("------------------------------");
		System.out.println("removing a school from the saved school list");
		// (User) Remove a saved school from the saved shcools list                                         //U7 Remove School from Saved School list
		UserInteraction.removeSchool("juser", "AUBURN");
		
		//(User) View Saved Schools  																					//U4 View Saved School List
		System.out.println("Viewing Saved Schools after removing AUBURN");
		ArrayList<University> savedSchools2 = UserInteraction.showSavedSchoolList("juser");                    
		for (int i = 0; i < savedSchools2.size(); i++) {
			University u = savedSchools2.get(i);
			if (!u.getName().equals("NoUniversity")) {
			System.out.println(savedSchools2.get(i).toString());
			System.out.println();
			}
		}
		
		
		System.out.println("------------------------------");
		//(user) view school page
		University u2 = DatabaseController.getUniversity("BARD");                                           //U9 View School Page
		System.out.println(u2.toString());
		
		System.out.println("------------------------------");
		
		// (User) Find top 5 recommended schools for a given school
		float[] ratings = UserInteraction.displaySimilarSchools("SJU");									    //U11 Display 5 most similar school to school being viewed
		System.out.println("Similarity Ratings for top 5 similar schools to SJU");
		System.out.println("CSB: " + ratings[0] + '\n' + "UST: " + ratings[1] + '\n' + " hi: " + ratings[2] + '\n'
				+ "max: " + ratings[3] + '\n' + "UMN: " + ratings[4]);

		System.out.println("------------------------------");
		


		


		// (Admin) Edit a user
		//pw.println("------------------------------"); 													     //(extra) U16 Edit User account
		//pw.println("(Old Username and Password)");                                                            //not done
		//for (int i = 0; i < users.size(); i++) {
		//	pw.println(users.get(i).toString());
		//}
		//AdminInteraction.editUser("sammy", "password", "Sammy", "Password");

		//AdminInteraction.editUser("james", "12345", "James", "123456");

		//pw.println("(Updated Username and Password)");
		//for (int i = 0; i < users.size(); i++) {
		//	pw.println(users.get(i).toString());
		//}



		// (Admin) Deactivate a user
		//System.out.println("------------------------------");
		//System.out.println("(Old list of users)");
		//for (int i = 0; i < users.size(); i++) {
		//	System.out.println(users.get(i).toString());
		//}
		//AdminInteraction.deactivateUser("james");												//(extra) U17 Deactivate User account

		//AdminInteraction.deactivateUser("Sammy");

		//System.out.println("(New list of users *one removed*)");
		//ArrayList<Account> u = AdminInteraction.viewUsers();
		//for (int i = 0; i < u.size(); i++) {
		//	System.out.println(u.get(i).toString());
		//}
		

		

		
		// (User)
		//UserInteraction.showSchoolPage("SJU"PrintWriter(String fileName)  
		
		
		
		
          pw.close();
		}
		
	}

	

