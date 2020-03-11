package cmc.search;

import java.util.ArrayList;

import cmc.database.DatabaseController;
import cmc.university.University;

/**
 * Search Controller handles communication with the DatabaseController/Database on anything
 * having anything to do with Search
 * 
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
  * 
  * Displays the colleges matching the search criteria
  */
 public void displayList() {
  
 }
 
 /**
  * Method to add university to list
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
 public static ArrayList<University> searchSchool(Criteria c) 
 {
	 ArrayList<University> colleges = DatabaseController.getUniversities();
	 ArrayList<University> results = new ArrayList<University>();
	 University u;
	 for (int i = 0; i < colleges.size(); i++) 
	 {		 
		 u = colleges.get(i);
		 //System.out.println(u.getName());
		 //System.out.println(c.getName());
		 if (u.getName().contains(c.getName()) && 
				 u.getState().contains(c.getState()) && 
				 u.getLocation().contains(c.getLocation()) && 
				 u.getControl().contains(c.getControl()) &&
				 c.getNumStudentsB() <= u.getNumStudents() &&
				 u.getNumStudents()<= c.getNumStudentsT() &&
				 c.getMfRatioB() <= u.getMfRatio() &&
				 u.getMfRatio()<= c.getMfRatioT() &&
				 c.getSatVerbalB() <= u.getSatVerbal() &&
				 u.getSatVerbal()<= c.getSatVerbalT() &&
				 c.getSatMathB() <= u.getSatMath() &&
				 u.getSatMath()<= c.getSatMathT() &&
				 c.getExpensesB() <= u.getExpenses() &&
				 u.getExpenses()<= c.getExpensesT() &&
				 c.getFinancialAidB() <= u.getFinancialAid() &&
				 u.getFinancialAid()<= c.getFinancialAidT() &&
				 c.getNumApplicantsB() <= u.getNumApplicants() &&
				 u.getNumApplicants()<= c.getNumApplicantsT() &&
				 c.getAdmitionRateB() <= u.getAdmitionRate() &&
				 u.getAdmitionRate()<= c.getAdmitionRateT() &&
				 c.getPercentEnrolledB() <= u.getPercentEnrolled() &&
				 u.getPercentEnrolled()<= c.getPercentEnrolledT() &&
				 c.getSocialB() <= u.getSocial() &&
				 u.getSocial() <= c.getSocialT() &&
				 c.getQualOfLifeB() <= u.getQualOfLife() &&
				 u.getQualOfLife()<= c.getQualOfLifeT()) 
		 {
		 results.add(u);
	 }
  
 }
return results;
}
}
