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
 
 public static void addUniversity(University uni) {
  
 }
 
 public static void removeUniversity(University uni) {
  
 }
 
 public static void editUniversity(University uni) {
  
 }
 
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
