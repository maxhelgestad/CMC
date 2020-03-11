package cmc.university;

import java.util.ArrayList;

import cmc.database.DatabaseController;

import java.lang.Math;

/**
 * 
 */

/**
 * University Controller handles communication with the DatabaseController/Database on anything
 * having anything to do with Universities
 * 
 * @author vkahlhame001
 *
 */
public class UniversityController {
 
 /**
  * Admin function to  add university to the database
  * 
  * @param uni the university to add
  */
 public static void addUniversity(University uni) {
  
 }
 
 /**
  * Admin function to remove the university from the database
  * 
  * @param uni the university that is being removed
  */
 public static void removeUniversity(University uni) {
  
 }
 
 /**
  * Admin control to edit university information in the database
  * 
  * @param uni the university being edited
  */
 public static void editUniversity(University uni) {
  
 }
 
 /**
  * A method that retrieves all the universities in the database
  * 
  * @return an Array list of universities that are in the database
  */
 public static ArrayList<University> viewUniversities(){
  return DatabaseController.getUniversities();
 }
 
 public static float[] getSimilarSchoolRatings(String schoolName)
 {
	 ArrayList<University> u = DatabaseController.getUniversities();
	 float first = 0;
	 float second = 0;
	 float third = 0;
	 float four = 0;
	 float five = 0;
	 float[] ratings = new float[]{r1,r2,r3,r4,r5};
	 for (int i =0; i < u.size(); i++ ) {
		 float in = University.similarity(schoolName, u.get(i).getName());
		 if (in < five) {
			 
		 }
	 }
	 
  
  
  
  return ratings;
 }

}
