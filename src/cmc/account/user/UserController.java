/**
 * A class to control the User object
 * 
 * @author mli001
 *
 */

//import user package
package cmc.account.user;
//import list
import java.util.*;
//import university
import cmc.university.University;
//import database controller
import cmc.database.DatabaseController;
import cmc.account.Account;


public class UserController {
  
  private static ArrayList<User> regularUsers;
  private static DatabaseController database;
  private User u;
  public UserController()
  {
    this.regularUsers = new ArrayList<User>();
    this.database = new DatabaseController();
  }
  
  
 /**
  * Add a new user  
  *
  * @param u user to be added
  */
 public static void main(String[] args) {

 }
 
 public static boolean addUser(String username, String password) {
 User u = new User(username, password);
 DatabaseController.addUser(u);
 return true;
 }
 
 /**
  * Edit an existing user  
  *
  * @param u user to be added
  */
 public void editUser(User u)
 {
 }
 
 /**
  * Deactivate an existing user  
  *
  * @param u user to be added
  */
 public void deactivateUser(User u)
 {
  
 }
 
 /**
  * get user's the saved school list 
  *
  * @param u user name
  */
 public static ArrayList<University> getSavedSchoolList(String userName)
 {
   if(DatabaseController.lookupUser(userName)!= null)
   {
     return DatabaseController.lookupUser(userName).getSavedSchools(userName);
   }
   else{
     return null;
   }
   
 }

 /**
  * get school page
  * 
  * @param school name
  */
 
 public static void showSchoolPage(String schoolName)
 {
  
  //TODO how to display and why getSchool and getUniversity
  University u = DatabaseController.getUniversity(schoolName);
 }

 /**
  * add school to the saved school list
  * 
  * @param school name
  */
 public static void saveSchool(String schoolName)
 {
  Account u = DatabaseController.getUser("sammy", "password");
  University s = DatabaseController.getUniversity(schoolName);
  //u.addSavedSchool(s);
 }
 
 /**
  * View user's profile
  *
  * allows users to view their profile
  */
 public static void viewProfile()

 {
  User.viewProfile();
 }
 
 /**
  * remove school from the saved school list
  * 
  * @param user name
  * @param school name
  */
 public static void removeSchool(String userName, String schoolName)
 { 
   if(DatabaseController.lookupUser(userName)!= null)
   {
     DatabaseController.lookupUser(userName).removeSavedSchool(schoolName);
   }
 }
 
}
