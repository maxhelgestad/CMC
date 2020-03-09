package cmc;

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
public class Driver 
{

 /**
  * @param args
  */
 public static void main(String[] args) 
 {
  DatabaseController.setUser();
  DatabaseController.setSchool();
  
  //Successful Login
  System.out.println("Login was success: (should be true)" + UserInteraction.logOn("sammy", "password"));
  //Failed Login (wrong password)
  System.out.println("Login was success: (should be false)" + UserInteraction.logOn("sammy", "pasword"));
  //Failed (not a user)
  System.out.println("Login was success: (should be false)" + UserInteraction.logOn("max", "123"));
  System.out.println("------------------------------");
  
  //(User) Search for schools by a combination of state and number of students //(User) View search results
  ArrayList<University> schools = UserInteraction.searchSchool("CSB", 1000);
  for(int i = 0; i < schools.size(); i++)
  {
   System.out.println(schools.get(i).toString());
   System.out.println();
  }
  System.out.println("------------------------------");
  
  //(User) Find top 5 recommended schools for a given school
  float[] ratings = UserInteraction.displaySimilarSchools("SJU");
  System.out.println("Similarity Ratings for top 5 similar schools to SJU");
  System.out.println("CSB: " + ratings[0] + '\n' + "UST: " + ratings[1] +'\n' + " hi: " + ratings[2] +'\n' + "max: " + ratings[3] +'\n' + "UMN: " + ratings[4]);
  
  System.out.println("------------------------------");
  
  //(Admin) View list of universities
  ArrayList<University> universities = AdminInteraction.viewUniversities();
  for(int i = 0; i < universities.size(); i++)
  {
   System.out.println(universities.get(i).toString());
   System.out.println();
  }
  System.out.println("------------------------------");
  
  //(Admin) View list of users
  ArrayList<Account> users = AdminInteraction.viewUsers();  
  for(int i = 0; i < users.size(); i++)
  {
   System.out.println(users.get(i).toString());
  }
  
  //(User) Save a school to saved schools list
  UserInteraction.saveSchool("SJU");
  
  //(User)
  UserInteraction.showSchoolPage("SJU");

  
  //(Admin) Add a new User
  System.out.println("Admin added a new user" + AdminInteraction.addUser("jack", "password"));

 }
 


}
