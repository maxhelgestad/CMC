package cmc.account.user;

import java.util.*;

import cmc.account.Account;
import cmc.database.DatabaseController;
import cmc.university.University;

/**
 * 
 */

/**
 * @author mli001
 *
 */
public class UserController {
 
 private List<User> regularUsers = new ArrayList<User>();
 
 
 
 

 /**
  * @param args
  */
 public static void main(String[] args) {

 }
 
 public void addUser(User u)
 {
  this.regularUsers.add(u);
 }
 
 public void editUser(User u)
 {
    //this.regularUsers.edit(u);
 }
 
 public void deactivateUser(User u)
 {
  
 }
 
 public void getSavedSchoolList(String userName)
 {
  
  
 }
 
 public static void showSchoolPage(String schoolName)
 {
	 
	 //TODO how to display and why getSchool and getUniversity
  University u = DatabaseController.getUniversity(schoolName);
 }
 
 public static void saveSchool(String schoolName)
 {
	 //TODO Account and User confusion
  Account u = DatabaseController.getUser("sammy", "password");
  University s = DatabaseController.getUniversity(schoolName);
  //u.addSavedSchool(s);
 }
 
 /**
  * allows users to view their profile
  */
 public static void viewProfile()
 {
	 User.viewProfile();
 }
 
 public void removeSchool(String userName, String schoolName)
 {
  
 }
}
