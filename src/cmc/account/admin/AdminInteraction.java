package cmc.account.admin;

import java.util.ArrayList;

import cmc.account.Account;
import cmc.account.AccountController;
import cmc.account.user.UserController;
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
 
 public static void addAccount(String firstName, String lastName, String username, String password, char type, char status) {
	AccountController.addAccount(firstName, lastName, username, password, type, status);
 }
 
 public static void editUser(String username, String password, String newUsername, String newPassword) {
	 UserController.editUser(username, password, newUsername, newPassword);
  
 }
 
 public static void deactivateUser(String username, String password) {
	 UserController.deactivateUser(username, password);
 }

}
