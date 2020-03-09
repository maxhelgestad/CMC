package cmc.account.user;

import java.util.ArrayList;

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

	private UserController userControl;
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
 
 public ArrayList<University> showSavedSchoolList(String name) {
	 return this.userControl.getSavedSchoolList(name);
 }
 
 public static void showSchoolPage(String schoolName) {
  UserController.showSchoolPage(schoolName);
 }
 
 public String displaySchoolDetails(University uni) {
  //TODO
  return "School details";
 }
 
 public static void saveSchool(String name) {
  UserController.saveSchool(name);
 }
 
 /**
  * view the logged in user's profile
  */
 public void viewProfile() {
	 UserController.viewProfile();
 
 }
 
 public void removeSchool(String name, String schoolName) {
	 UserController.removeSchool(name, schoolName);
 }
 
 public void displaySearchResults() {
  //TODO
 }
 
 public static float[] displaySimilarSchools(String schoolName) {
  return UniversityController.getSimilarSchoolRatings(schoolName);
  
 }
}
