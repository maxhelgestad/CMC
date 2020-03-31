package cmc.account.user;

import java.util.ArrayList;

import cmc.account.Account;
import cmc.account.AccountController;
import cmc.search.Criteria;
import cmc.search.SearchController;
import cmc.university.University;
import cmc.university.UniversityController;


/**
 * Class for Users to interact with the system
 * 
 * @author javengers
 *
 */
public class UserInteraction {

/**
 * Logs the User on
 *  
 * @param username of the User
 * @param password of the User
 * @return boolean weather successful or not
 */
 public static boolean logOn(String username, String password) {
  return AccountController.logOn(username, password);
 }
 
 
 /**
  * Method for users to search a university
  * 
  * @param c the criteria of search
  * @return ArrayList of universities that match the search criteria
  */
 public static ArrayList<University> searchSchool(Criteria c) {
  return SearchController.searchSchool(c); 
 }
 
 /**
  * Method to get the saved schools for a user
  * 
  * @param name the user's username
  * @return the ArrayList of universities for the specified user
  */
 public static ArrayList<University> showSavedSchoolList(String name) {
	 return UserController.getSavedSchoolList(name);
 }
 
 /**
  * Method to display the school page for a specific school
  * 
  * @param schoolName The school name to show
  */
 public static void showSchoolPage(String schoolName) {
  UserController.showSchoolPage(schoolName);
 }
 
 /**
  * Method to get the details for a specific school
  * 
  * @param uni the specified school
  * @return The details for the specified school
  */
 public String displaySchoolDetails(University uni) {
  //TODO
  return "School details";
 }
 
 /**
  * Method to save a school to a user
  * 
  * @param username the user who is saving the school
  * @param schoolName the school being saved
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
 
 /**
  * Changes the username and Password of a user
  * 
  * @param username to be changed
  * @param password to be chaanged
  * @param newUsername to be new username
  * @param newPassword to be new username
  */
 public static void viewToEditProfile(String username, String newUsername, String newPassword, String newFirstName, String newLastName) {
	 UserController.viewToEditProfile(username, newUsername, newPassword, newFirstName, newLastName);
 }
 
 /**
  * A method to remove a school from a user's saved schools
  * 
  * @param name the user trying to remove a school
  * @param schoolName the school being removed
  */
 public static void removeSchool(String name, String schoolName) {
	 UserController.removeSchool(name, schoolName);
 }
 
 public void displaySearchResults() {
  //TODO
 }
 
 /**
  * Method to return the five schools similar to the school being viewed
  * 
  * @param schoolName the original school
  * @return an array list of universities that are similar (five)
  */
// public static float[] displaySimilarSchools(String schoolName) {
//  return UniversityController.getSimilarSchoolRatings(schoolName);
//  
// }
}
