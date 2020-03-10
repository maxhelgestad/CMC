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
  private String name, control, location;
  private int numStudents, numApplicants, academics, social, qualOfLife;
  private float expenses, financialAid, admitionRate, percentEnrolled, mfRatio, satVerbal, satMath;
  private ArrayList<String> emphases;
  
  
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
   * @return all the information of the university
   */
  public String toString() {
    return "Name: " + name + "\n Male/Female Ratio: " + mfRatio + "\n Control: " + control + "\n Location: "+ location + "\n Number of Students: "+ numStudents 
+"\n SAT Verbal: "+ satVerbal +"\n SAT Math: "+ satMath +"\n Number of Applicants: "+ numApplicants +"\n Academics:"+ academics +"\n Social: "+ social + "\n Quality of Life: "+ 
      qualOfLife + "\n Expenses: "+ expenses + "\n Financial Aid: "+ financialAid + "\n admition Rate: "+ admitionRate +"\n Percent Enrolled: "+ percentEnrolled;
  }
  /**
   * 
   * @return Name of the University
   */
  public String getName() {
   return this.name;
  }
  /**
   * 
   * @return Male to Female Ratio
   */
  public float getMfRatio() {
   return this.mfRatio;
  }
  /**
   * 
   * @return Control
   */
  public String getControl() {
   return this.control;
  }
  /**
   * 
   * @return location of the University
   */
  public String getLocation() {
   return this.location;
  }
  /**
   * 
   * @return the number of students
   */
  public int getNumStudents() {
   return this.numStudents;
  }
  /**
   * 
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
   * 
   * @return Number of Applicants
   */
  public int getNumApplicants() {
   return this.numApplicants;
  }
  /**
   * 
   * @return an intger of the academics of the University
   */
  public int getAcademics() {
   return this.academics;
  }
  /**
   * 
   * @return an integer of the social of the University
   */
  public int getSocial() {
   return this.social;
  }
  /**
   * 
   * @return an integer of the quality of life of the university
   */
  public int getQualOfLife() {
   return this.qualOfLife;
  }
  /**
   * 
   * @return a float of the expenses of the school
   */
  public float getExpenses() {
   return this.expenses;
  }
  /**
   * 
   * @return a float of the financial aid
   */
  public float getFinancialAid() {
   return this.financialAid;
  }
/**
 * 
 * @return admitionRate The admit rate of the University
 */
  public float getAdmitionRate() {
   return this.admitionRate;
  }
  /**
   * 
   * @return percentEnrolled 
   */
  public float getPercentEnrolled() {
   return this.percentEnrolled;
  }
  /**
   * 
   * @param n1 First University that will be compared to the other University
   * @param n2 second University that will be compared to the first University
   * @return a float that shows the valsu of how cloaely related the two schools are related
   */
 public static float similarity(String n1, String n2) {
  University u1 = DatabaseController.getUniversity(n1);
  University u2 = DatabaseController.getUniversity(n2);
  return (Math.abs(u1.getNumStudents()-u2.getNumStudents())) + (Math.abs(u1.getSatVerbal()-u2.getSatVerbal())) + (Math.abs(u1.getSatMath()-u2.getSatMath())) + (Math.abs(u1.getExpenses()-u2.getExpenses()))+ (Math.abs(u1.getFinancialAid()-u2.getFinancialAid())) +
    ((Math.abs(u1.getNumApplicants()-u2.getNumApplicants()))+(Math.abs(u1.getAdmitionRate()-u2.getAdmitionRate()))+(Math.abs(u1.getPercentEnrolled()-u2.getPercentEnrolled()))+(Math.abs(u1.getAcademics()-u2.getAcademics()))+(Math.abs(u1.getSocial()-u2.getSocial()))
    + (Math.abs(u1.getQualOfLife()-u2.getQualOfLife())));
 }
}
