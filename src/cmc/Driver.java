
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
		
		//U1 add a new user
		System.out.println("Add a new user vincent");
		AdminInteraction.addAccount("vincent","kahlhamer", "vinkahlhamer", "password", 'u', 'y');
		
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		
		 //U13 View Users
		System.out.println("Printing off all of the users");
		ArrayList<Account> users = AdminInteraction.viewUsers();											
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).toString());
		}
		
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		
		//U12 View Universities
		System.out.println("Printing off all of the universities (limited to five)");
		ArrayList<University> universities = AdminInteraction.viewUniversities();                 
		for (int i = 0; i < 5; i++) {
			System.out.println(universities.get(i).toString());
			System.out.println();
		}
		
		System.out.println("------------------------------");
		System.out.println("------------------------------");

		
		//U11 Display 5 most similar school to school being viewed
		ArrayList<University> a = UniversityController.getSimilarSchools("YALE");									    
		System.out.println("Top 5 similar schools to Yale");
		System.out.println(a.get(0).getName() + "\n" + a.get(1).getName() + "\n" + a.get(2).getName()
				+ "\n" + a.get(3).getName() + "\n" + a.get(4).getName());
		

		System.out.println("------------------------------");
		System.out.println("------------------------------");

		//U16 edit user
		System.out.println("Editing user vincent");
		AdminInteraction.editProfile("vinkahlhamer", "1234567", "newFirstName", "newLastName", 'u', 'y');
		System.out.println("Printing off all of the users to show change to user vincent");
		ArrayList<Account> users2 = AdminInteraction.viewUsers();											
		for (int i = 0; i < users2.size(); i++) {
			System.out.println(users2.get(i).toString());
		}


		System.out.println("------------------------------");
		System.out.println("------------------------------");
		
		//U17 Deactivate User Account
		System.out.println("Deactivating user vincent");
		AdminInteraction.deactivateUser("vinkahlhamer");
		System.out.println("Printing off all of the users to show deactivation to user vincent");
		ArrayList<Account> users3 = AdminInteraction.viewUsers();											
		for (int i = 0; i < users3.size(); i++) {
			System.out.println(users3.get(i).toString());
		}
		
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		
		//removing added user U-additional
		System.out.println("removing user Vincent");
		DatabaseController.removeAccount("vinkahlhamer");

		}
		
	}

	

