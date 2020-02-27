package cmc.search;

import java.util.ArrayList;

import cmc.database.DatabaseController;
import cmc.university.University;

/**
 * 
 */

/**
 * @author abrandeck001
 *
 */
public class SearchController {
 
 //List of colleges
 private ArrayList<University> colleges;

 /**
  * Constructor of the class
  * 
  * @param colleges the colleges being searched
  */
 public SearchController(ArrayList<University> colleges) {
  this.colleges = colleges;
 }
 
 /**
  * getting the colleges
  * 
  * @return the colleges being searched
  */
 public ArrayList<University> getColleges() {
  return this.colleges;
 }
 
 /**
  * setting new set of searched colleges
  * 
  * @param colleges the colleges being searched
  */
 public void setColleges(ArrayList<University> colleges) {
  this.colleges = colleges;
 }
 
 /**
  * Viewing the desired college's info
  * 
  * @param college the college being view
  */
 public void viewCollegeInfo(University college) {
  
 }
 
 /**
  * Displays the colleges matching the search criteria
  */
 public void displayList() {
  
 }
 
 /**
  * 
  * @param uni the university being added
  */
 public void addSchool(University uni) {
  
 }
 
 /**
  * Searching for schools based on criteria
  * 
  * @param cri the criteria to search schools on
  */
 public static ArrayList<University> searchSchool(String name, int numStudents) {
  return DatabaseController.getSchool(name, numStudents);
  
 }

}
