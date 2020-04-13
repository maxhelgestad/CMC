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
	ArrayList a = DatabaseController.getUniversities();
	ArrayList results = new ArrayList<University>();
	HashMap<University, Float> m = new HashMap<University, Float>();
	for (int i = 0; i < a.size(); i++) {
		float s = University.similarity(schoolName, ((University) a.get(i)).getName());
		m.put((University) a.get(i), s);
	}
	HashMap<University, Float> sortedM = sortByValue(m);
	TreeMap<University, Float> m2 = new TreeMap<>();
	m2.putAll(sortedM);
	for (int i = 0; i < 5; i++) {
		results.add(sortedM.get(m2.firstKey()));
	}
	return results;
}


/**
 * @author saurav jain (geeksForGeeks.com)
 * @param hm
 * @return
 */
public static HashMap<University, Float> sortByValue(HashMap<University, Float> hm){
	List<Map.Entry<University, Float> > list = 
			new LinkedList<Map.Entry<University, Float> >(hm.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<University, Float> >() {
		public int compare(Map.Entry<University,Float> o1,
							Map.Entry<University, Float> o2) {
			return (o1.getValue().compareTo(o2.getValue()));
		}
		});
		HashMap<University, Float> temp = new LinkedHashMap<University, Float>();
		for (Map.Entry<University, Float> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
		
	}
}
