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
	//name, control, and location of  the University
  private String name, control, location;
  //Number of students, number of applicants, academics, social, and quality of life of the University
  private int numStudents, numApplicants, academics, social, qualOfLife;
  //Expenses, financial Aid, admit Rate, Percent Enrolled, Male Female Ratio, SAT Verbal, and SAT Math of the University
  private float expenses, financialAid, admitionRate, percentEnrolled, mfRatio, satVerbal, satMath;
  private ArrayList<String> emphases;
  
  /**
   * University constructor
   * 
   * @param name school's name
   * @param mfRatio male to female ratio
   * @param numStudents the number of enrolled students
   * @param control public or private control of the school
   * @param satVerbal average verbal SAT stat for given school
   * @param satMath average math SAT stat for school
   * @param expenses cost of school
   * @param financialAid the amount of financial aid offered by the school
   * @param admitionRate the admission rate of the school
   * @param percentEnrolled the percent of enrolled students
   * @param academics 1-5 rating of academics at a school
   * @param social 1-5 rating of school social life
   * @param emphasis what the school is known for
   * @param location the location of the school 
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
  }
  
  
  /**
   * Prints off all the information of the Univserity and organizes it nicely
   * @return all the information of the university
   */
  public String toString() {
    return "Name: " + name + "\n Male/Female Ratio: " + mfRatio + "\n Control: " + control + "\n Location: "+ location + "\n Number of Students: "+ numStudents 
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
  /**Compares one school to another and returns a value that shows how closely related they are
   * 
   * @param n1 First University that will be compared to the other University
   * @param n2 second University that will be compared to the first University
   * @return a float that shows the value of how closely related the two schools are related
   */
 public static float similarity(String n1, String n2) {
  University u1 = DatabaseController.getUniversity(n1);
  University u2 = DatabaseController.getUniversity(n2);
  return (Math.abs(u1.getNumStudents()-u2.getNumStudents())) + (Math.abs(u1.getSatVerbal()-u2.getSatVerbal())) + (Math.abs(u1.getSatMath()-u2.getSatMath())) + (Math.abs(u1.getExpenses()-u2.getExpenses()))+ (Math.abs(u1.getFinancialAid()-u2.getFinancialAid())) +
    ((Math.abs(u1.getNumApplicants()-u2.getNumApplicants()))+(Math.abs(u1.getAdmitionRate()-u2.getAdmitionRate()))+(Math.abs(u1.getPercentEnrolled()-u2.getPercentEnrolled()))+(Math.abs(u1.getAcademics()-u2.getAcademics()))+(Math.abs(u1.getSocial()-u2.getSocial()))
    + (Math.abs(u1.getQualOfLife()-u2.getQualOfLife())));
 }
}
