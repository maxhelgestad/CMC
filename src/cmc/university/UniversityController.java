 package cmc.university;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import cmc.database.DatabaseController;

import java.lang.Math;
import java.lang.reflect.Array;

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
 

public static ArrayList<University> getSimilarSchools(String schoolName){
	ArrayList<University> a = DatabaseController.getUniversities();
	ArrayList<University> results = new ArrayList<University>();
	TreeMap<University, Float> m = new TreeMap<University, Float>();
	float one = 100;
	float two = 101;
	float three = 102;
	float four  = 103;
	float five = 104;
	for (int i = 0; i < a.size(); i++) {
		float s = University.similarity(schoolName, ((University) a.get(i)).getName());
		if (!(s == (float)0.0)) {
			if (s < one) {
				one = s;
				results.add(0, a.get(i));
			}
			else if (s < two) {
				two = s;
				results.add(1, a.get(i));
			}
			else if (s < three) {
				three = s;
				results.add(2, a.get(i));
			}
			else if (s < four) {
				four = s;
				results.add(3, a.get(i));
			}
			else if (s < five) {
				five = s;
				results.add(4, a.get(i));
			}
		}

	}
	return results;
}


}
