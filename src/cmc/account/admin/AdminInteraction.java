package cmc.account.admin;

import java.util.ArrayList;

import cmc.account.Account;
import cmc.account.AccountController;
import cmc.university.University;
import cmc.university.UniversityController;

/**
 * 
 */

/**
 * @author vkahlhame001
 *
 */
public class AdminInteraction {

 /**
  * 
  */
 public AdminInteraction() {
  // TODO Auto-generated constructor stub
 }
 
 public static ArrayList<University> viewUniversities() {
  return UniversityController.viewUniversities();
 }
 
 public static ArrayList<Account> viewUsers() {
  return AccountController.getUsers();
 }
 
 //public static void addUser(User newUser) {
 
 //}
 
 //public static void editUser(String username ) {
  
 //}

}
