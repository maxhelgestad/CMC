package cmc.account.user;

import java.util.ArrayList;

import cmc.account.Account;
import cmc.account.AccountController;
import cmc.search.Criteria;
import cmc.search.SearchController;
import cmc.university.University;
import cmc.university.UniversityController;


/**
 * @author javengers
 *
 */
public class UserInteraction {

	/**Logs the User on
 *  
 * @param username of the User
 * @param password of the User
 * @return boolean weather successful or not
 */
 public static boolean logOn(String username, String password) {
  return AccountController.logOn(username, password);
 }
 
 
 /**
  * 
  * @param c the criteria of search
  * @return
  */
 public static ArrayList<University> searchSchool(Criteria c) {
  return SearchController.searchSchool(c); 
 }
 
 public static ArrayList<University> showSavedSchoolList(String name) {
	 return UserController.getSavedSchoolList(name);
 }
 
 /**
  * 
  * @param schoolName
  */
 public static void showSchoolPage(String schoolName) {
  UserController.showSchoolPage(schoolName);
 }
 
 /**
  * 
  * @param uni
  * @return
  */
 public String displaySchoolDetails(University uni) {
  //TODO
  return "School details";
 }
 
 /**
  * 
  * @param username
  * @param schoolName
  */
 public static void saveSchool(String username, String schoolName) {
  UserController.saveSchool(username, schoolName);
 }
 
 /**
  * view the logged in user's profile
  */
 public static Account viewProfile(String username) {
	 return UserController.viewProfile(username);
 }
 /**Changes the username and Password of a user
  * 
  * @param username to be changed
  * @param password to be chaanged
  * @param newUsername to be new username
  * @param newPassword to be new username
  */
 public static void viewToEditProfile(String username, String password, String newUsername, String newPassword) {
	 UserController.viewToEditProfile(username, password, newUsername, newPassword);
 }
 
 /**
  * 
  * @param name
  * @param schoolName
  */
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
