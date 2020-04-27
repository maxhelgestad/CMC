
package cmc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import cmc.account.Account;
import cmc.account.admin.AdminInteraction;
import cmc.account.user.UserController;
import cmc.account.user.UserInteraction;
import cmc.database.DatabaseController;
import cmc.search.Criteria;
import cmc.university.University;
import cmc.university.UniversityController;


/**
 * Driver class to test back end functionality for first twelve uses cases
 * 
 * @author javengers
 *
 */
public class Driver {

	/**
	 * @param args arguments
     */
	public static void main(String[] args) {
		DatabaseController.setUp("javengers", "csci230");
		
		
	
		
       //(admin) edit profile                                                                               //U6 Edit profile
		AdminInteraction.editProfile("luser", "user2", "Laura", "Helgestad", 'u', 'y');
		System.out.println("Edited user luser profile: to change Name to Laura Helgestad");
		
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		
		System.out.println("Printing off all of the users");
		ArrayList<Account> users = AdminInteraction.viewUsers();											 //U13 View Users
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).toString());
		}
		
		// (Admin) View list of universities
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		
		System.out.println("Printing off all of the universities (limited to five)");
		ArrayList<University> universities = AdminInteraction.viewUniversities();                 //U12 View Universities
		for (int i = 0; i < 5; i++) {
			System.out.println(universities.get(i).toString());
			System.out.println();
		}
		
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		


		
		// (User) Find top 5 recommended schools for a given school
		ArrayList<University> a = UniversityController.getSimilarSchools("YALE");									    //U11 Display 5 most similar school to school being viewed
		System.out.println("Top 5 similar schools to Yale");
		System.out.println(a.get(0).getName() + "\n" + a.get(1).getName() + "\n" + a.get(2).getName()
				+ "\n" + a.get(3).getName() + "\n" + a.get(4).getName());
		

		System.out.println("------------------------------");
		System.out.println("------------------------------");


	




		
		

		}
		
	}

	

