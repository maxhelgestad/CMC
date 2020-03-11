package cmc.university;


import java.util.ArrayList;

import cmc.database.DatabaseController;


/**
 * University class for use in setting up Universities
 * 
 * @author javengers
 *
 */
public class University {
	//name, control, state, and location of  the University
  private String name, control, location, state;
  //Number of students, number of applicants, academics, social, and quality of life of the University
  private int numStudents, numApplicants, academics, social, qualOfLife;
  //Expenses, financial Aid, admit Rate, Percent Enrolled, Male Female Ratio, SAT Verbal, and SAT Math of the University
  private float expenses, financialAid, admitionRate, percentEnrolled, mfRatio, satVerbal, satMath;
  private ArrayList<String> emphases;
  
  /**
   * University constructor
   * 
   * @param name school's name
   * @param state state the school is in
   * @param location the location of the school
   * @param control public or private control of the school
   * @param mfRatio male to female ratio
   * @param numStudents the number of enrolled students
   * @param satVerbal average verbal SAT stat for given school
   * @param satMath average math SAT stat for school
   * @param expenses cost of school
   * @param financialAid the amount of financial aid offered by the school
   * @param numApplicants number of applicants that apply to the school
   * @param admitionRate the admission rate of the school
   * @param percentEnrolled the percent of enrolled students
   * @param academics 1-5 rating of academics at a school
   * @param social 1-5 rating of school social life
   * @param qualOfLife 1-5 rating of quality of life at the school
 
   * 
   */
  public University(String name, String state, String location, String control, int numStudents,float mfRatio, float satVerbal,
                    float satMath, float expenses, float financialAid, int numApplicants, float admitionRate, float percentEnrolled, int academics, int social, int qualOfLife) {
    this.name = name;
    this.mfRatio = mfRatio;
    this.control = control;
    this.location = location;
    this.numStudents = numStudents;
    this.satVerbal = satVerbal;
    this.satMath = satMath;
    this.numApplicants = numApplicants;
    this.academics = academics;
    this.social = social;
    this.qualOfLife = qualOfLife;
    this.expenses = expenses;
    this.financialAid = financialAid;
    this.admitionRate = admitionRate;
    this.percentEnrolled = percentEnrolled;
    this.state = state;
  }
  
  
  /**
   * Prints off all the information of the Univserity and organizes it nicely
   * @return all the information of the university
   */
  public String toString() {
    return "Name: " + name + "\nState: " + state +"\n Male/Female Ratio: " + mfRatio + "\n Control: " + control + "\n Location: "+ location + "\n Number of Students: "+ numStudents 
    		+"\n SAT Verbal: "+ satVerbal +"\n SAT Math: "+ satMath +"\n Number of Applicants: "+ numApplicants +"\n Academics:"+ academics +"\n Social: "+ social + "\n Quality of Life: "+ 
    		qualOfLife + "\n Expenses: "+ expenses + "\n Financial Aid: "+ financialAid + "\n admition Rate: "+ admitionRate +"\n Percent Enrolled: "+ percentEnrolled;
  }
  /**
   * Returns the Name of the University
   * @return Name of the University
   */
  public String getName() {
   return this.name;
  }
  
  /**
   * Returns the state of the University
   * @return state of the University
   */
  public String getState() {
   return this.state;
  }
  /**
   * returns the Male to Female Ratio of the University
   * @return Male to Female Ratio
   */
  public float getMfRatio() {
   return this.mfRatio;
  }
  /**
   * Returns the Control of the University
   * @return Control
   */
  public String getControl() {
   return this.control;
  }
  /**
   * Returns the location of the Univeristy
   * @return location of the University
   */
  public String getLocation() {
   return this.location;
  }
  /**
   * Returns the number of students of the University
   * @return the number of students
   */
  public int getNumStudents() {
   return this.numStudents;
  }
  /**
   * returns the average SAT Verbal score of the University
   * @return SAT Verbal
   */
  public float getSatVerbal() {
   return this.satVerbal;
  }
  /**
   * 
   * @return SAT Math
   */
  public float getSatMath() {
   return this.satMath;
  }
  /**
   * Returns the number of applicants of the Univserity
   * @return Number of Applicants
   */
  public int getNumApplicants() {
   return this.numApplicants;
  }
  /**
   * returns the academics of the University
   * @return an integer of the academics of the University
   */
  public int getAcademics() {
   return this.academics;
  }
  /**
   * returns the Social of the University
   * @return an integer of the social of the University
   */
  public int getSocial() {
   return this.social;
  }
  /**
   * Returns the qualtiy of life of the University
   * @return an integer of the quality of life of the university
   */
  public int getQualOfLife() {
   return this.qualOfLife;
  }
  /**
   * returns the Expenses of the University
   * @return a float of the expenses of the school
   */
  public float getExpenses() {
   return this.expenses;
  }
  /**
   * returns the Fincial aid of the Universit
   * @return a float of the financial aid
   */
  public float getFinancialAid() {
   return this.financialAid;
  }
/**
 * Returns the admit rate of the University
 * @return admitionRate The admit rate of the University
 */
  public float getAdmitionRate() {
   return this.admitionRate;
  }
  /**
   * Returns the Percent enrolled at the school
   * @return percentEnrolled 
   */
  public float getPercentEnrolled() {
   return this.percentEnrolled;
  }
  
  public static ArrayList<Float> min()
  {
	  ArrayList<Float> values = new ArrayList<Float>();
	  ArrayList<University> u = DatabaseController.getUniversities();
	  float numStu = Float.POSITIVE_INFINITY;
	  float satv = Float.POSITIVE_INFINITY;
	  float satm = Float.POSITIVE_INFINITY;
	  float exp = Float.POSITIVE_INFINITY;
	  float financial = Float.POSITIVE_INFINITY;
	  float numapplicants = Float.POSITIVE_INFINITY;
	  float admitionrate = Float.POSITIVE_INFINITY;
	  float percetnenroled = Float.POSITIVE_INFINITY;
	  float academics = Float.POSITIVE_INFINITY;
	  float social = Float.POSITIVE_INFINITY;
	  float qualoflife = Float.POSITIVE_INFINITY;  
			  
	  for(int i = 0; i < u.size(); i++)
	  {
		  if(numStu > u.get(i).getNumStudents()) {
			  numStu = u.get(i).getNumStudents();
		  }
		  if(satv > u.get(i).getSatVerbal()) {
			  satv = u.get(i).getSatVerbal();
		  }
		  if(satm > u.get(i).getSatMath()) {
			  satm = u.get(i).getSatMath();
		  }
		  if(exp > u.get(i).getExpenses()) {
			  exp = u.get(i).getExpenses();
		  }
		  if(financial > u.get(i).getFinancialAid()) {
			  financial = u.get(i).getFinancialAid();
		  }
		  if(numapplicants > u.get(i).getNumApplicants()) {
			  numapplicants = u.get(i).getNumApplicants();
		  }
		  if(admitionrate > u.get(i).getAdmitionRate()) {
			  admitionrate = u.get(i).getAdmitionRate();
		  }
		  if(percetnenroled > u.get(i).getPercentEnrolled()) {
			  percetnenroled = u.get(i).getPercentEnrolled();
		  }
		  if(academics > u.get(i).getAcademics()) {
			  academics = u.get(i).getAcademics();
		  }
		  if(social > u.get(i).getSocial()) {
			  social = u.get(i).getSocial();
		  }
		  if(qualoflife > u.get(i).getQualOfLife()) {
			  qualoflife = u.get(i).getQualOfLife();
		  }
	  }
	  values.add(numStu);
	  values.add(satv);
	  values.add(satm);
	  values.add(exp);
	  values.add(financial);
	  values.add(numapplicants);
	  values.add(admitionrate);
	  values.add(percetnenroled);
	  values.add(academics);
	  values.add(social);
	  values.add(qualoflife);
	  return values;
  }
  /**
   * Checks to see if two strings are equal and returns 0 if so
   * 
   * @param s first string to check
   * @param t second string to check
   * @return 0 if the two string are equal and 1 if they are not
   */
  public static int areStringsEqual(String s, String t)
  {
	  if (s.equals(t))
	  {
		  return 0;
	  }
	  else
	  {
		  return 1;
	  }
  }
  
  public static ArrayList<Float> max()
  {
	  ArrayList<Float> values = new ArrayList<Float>();
	  ArrayList<University> u = DatabaseController.getUniversities();
	  float numStu = 0;
	  float satv = 0;
	  float satm = 0;
	  float exp = 0;
	  float financial = 0;
	  float numapplicants = 0;
	  float admitionrate = 0;
	  float percetnenroled = 0;
	  float academics = 0;
	  float social = 0;
	  float qualoflife = 0;  
			  
	  for(int i = 0; i < u.size(); i++)
	  {
		  if(numStu < u.get(i).getNumStudents()) {
			  numStu = u.get(i).getNumStudents();
		  }
		  if(satv < u.get(i).getSatVerbal()) {
			  satv = u.get(i).getSatVerbal();
		  }
		  if(satm < u.get(i).getSatMath()) {
			  satm = u.get(i).getSatMath();
		  }
		  if(exp < u.get(i).getExpenses()) {
			  exp = u.get(i).getExpenses();
		  }
		  if(financial < u.get(i).getFinancialAid()) {
			  financial = u.get(i).getFinancialAid();
		  }
		  if(numapplicants < u.get(i).getNumApplicants()) {
			  numapplicants = u.get(i).getNumApplicants();
		  }
		  if(admitionrate < u.get(i).getAdmitionRate()) {
			  admitionrate = u.get(i).getAdmitionRate();
		  }
		  if(percetnenroled < u.get(i).getPercentEnrolled()) {
			  percetnenroled = u.get(i).getPercentEnrolled();
		  }
		  if(academics < u.get(i).getAcademics()) {
			  academics = u.get(i).getAcademics();
		  }
		  if(social < u.get(i).getSocial()) {
			  social = u.get(i).getSocial();
		  }
		  if(qualoflife < u.get(i).getQualOfLife()) {
			  qualoflife = u.get(i).getQualOfLife();
		  }
	  }
	  values.add(numStu);
	  values.add(satv);
	  values.add(satm);
	  values.add(exp);
	  values.add(financial);
	  values.add(numapplicants);
	  values.add(admitionrate);
	  values.add(percetnenroled);
	  values.add(academics);
	  values.add(social);
	  values.add(qualoflife);
	  return values;
  }
  /**Compares one school to another and returns a value that shows how closely related they are
   * 
   * @param n1 First University that will be compared to the other University
   * @param n2 second University that will be compared to the first University
   * @return a float that shows the value of how closely related the two schools are related
   */
 public static float similarity(String n1, String n2) {
  University u1 = DatabaseController.getUniversity(n1);
  University u2 = DatabaseController.getUniversity(n2);
  ArrayList<Float> max = max();
  ArrayList<Float> min = min();
  return (areStringsEqual(u1.getName(), u2.getName()) +
		  areStringsEqual(u1.getState(), u2.getState()) +
		  areStringsEqual(u1.getLocation(), u2.getLocation())+
		  areStringsEqual(u1.getControl(), u2.getControl()) + 
		  ((Math.abs(u1.getNumStudents()-u2.getNumStudents())) / (Math.abs(max.get(0) - min.get(0)))) + 
		  ((Math.abs(u1.getSatVerbal()-u2.getSatVerbal())) / (Math.abs(max.get(1) - min.get(1)))) + 
		  ((Math.abs(u1.getSatMath()-u2.getSatMath())) / (Math.abs(max.get(2) - min.get(2)))) + 
		  ((Math.abs(u1.getExpenses()-u2.getExpenses())) / (Math.abs(max.get(3) - min.get(3))))+ 
		  ((Math.abs(u1.getFinancialAid()-u2.getFinancialAid())) / (Math.abs(max.get(4) - min.get(4))))+
		  ((Math.abs(u1.getNumApplicants()-u2.getNumApplicants())) / (Math.abs(max.get(5) - min.get(5))))+
    	  ((Math.abs(u1.getAdmitionRate()-u2.getAdmitionRate())) / (Math.abs(max.get(6) - min.get(6))))+
    	  ((Math.abs(u1.getPercentEnrolled()-u2.getPercentEnrolled())) / (Math.abs(max.get(7) - min.get(7))))+
    	  ((Math.abs(u1.getAcademics()-u2.getAcademics())) / (Math.abs(max.get(8) - min.get(8))))+
    	  ((Math.abs(u1.getSocial()-u2.getSocial())) / (Math.abs(max.get(9) - min.get(9))))+ 
    	  ((Math.abs(u1.getQualOfLife()-u2.getQualOfLife()))/ (Math.abs(max.get(10) - min.get(10)))));
 }
}
