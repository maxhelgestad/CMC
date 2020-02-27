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

 /**
  * 
  */
 public UserInteraction() {
  // TODO Auto-generated constructor stub
 }
 
 public static boolean logOn(String username, String password) {
  return AccountController.logOn(username, password);
 }
 
 public static ArrayList<University> searchSchool(String name, int numStudents) {
  return SearchController.searchSchool(name, numStudents); 
 }
 
 public void showSavedSchoolList(String name) {
  //TODO
 }
 
 public void showSchoolPage(String schoolName) {
  //TODO
 }
 
 public String displaySchoolDetails(University uni) {
  //TODO
  return "School details";
 }
 
 public void saveSchool(String name) {
  //TODO
  
 }
 
 public void viewProfile() {
 //TODO 
 
 }
 
 public void removeSchool(String name, String schoolName) {
  //TODO
 }
 
 public void displaySearchResults() {
  //TODO
 }
 
 public static float[] displaySimilarSchools(String schoolName) {
  return UniversityController.getSimilarSchoolRatings(schoolName);
  
 }
}
