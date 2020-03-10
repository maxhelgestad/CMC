package cmc.university;

import java.util.ArrayList;

import cmc.database.DatabaseController;

import java.lang.Math;

/**
 * 
 */

/**
 * @author vkahlhame001
 *
 */
public class UniversityController {

 /**
  * 
  */
 public UniversityController() {
  // TODO Auto-generated constructor stub
 }
 
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
  float r1 = University.similarity(schoolName, "CSB");
  float r2 = University.similarity(schoolName, "UST");
  float r3 = University.similarity(schoolName, "hi");
  float r4 = University.similarity(schoolName, "max");
  float r5 = University.similarity(schoolName, "UMN");
  float[] ratings = new float[]{r1,r2,r3,r4,r5};
  
  
  return ratings;
 }

}
