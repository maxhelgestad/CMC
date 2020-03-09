package cmc.account.user;

import java.util.*;

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
 
 public void showSchoolPage(String schoolName)
 {
  
 }
 
 public void saveSchool(String schoolName)
 {
  
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
