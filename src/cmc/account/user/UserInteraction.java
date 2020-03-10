package cmc.account.user;

import java.util.ArrayList;

import cmc.account.Account;
import cmc.account.AccountController;
import cmc.search.SearchController;
import cmc.university.University;
import cmc.university.UniversityController;

/**
 * 
 */



/**
 * @author jkost001
 *
 */
public class UserInteraction {

 /**
  * 
  */
 public UserInteraction() {
	//userControl = new UserController();
 }
 
 public static boolean logOn(String username, String password) {
  return AccountController.logOn(username, password);
 }
 
 public static ArrayList<University> searchSchool(String name, int numStudents) {
  return SearchController.searchSchool(name, numStudents); 
 }
 
 public static ArrayList<University> showSavedSchoolList(String name) {
	 return UserController.getSavedSchoolList(name);
 }
 
 public static void showSchoolPage(String schoolName) {
  UserController.showSchoolPage(schoolName);
 }
 
 public String displaySchoolDetails(University uni) {
  //TODO
  return "School details";
 }
 
 public static void saveSchool(String username, String schoolName) {
  UserController.saveSchool(username, schoolName);
 }
 
 /**
  * view the logged in user's profile
  */
 public static Account viewProfile(String username) {
	 return UserController.viewProfile(username);
 }
 
 public void viewToEditProfile(String username, String password, String newUsername, String newPassword) {
	 UserController.viewToEditProfile(username, password, newUsername, newPassword);
 }
 
 public static void removeSchool(String name, String schoolName) {
	 UserController.removeSchool(name, schoolName);
 }
 
 public void displaySearchResults() {
  //TODO
 }
 
 public static float[] displaySimilarSchools(String schoolName) {
  return UniversityController.getSimilarSchoolRatings(schoolName);
  
 }
}
