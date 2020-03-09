package cmc.university;

import java.util.ArrayList;

import cmc.database.DatabaseController;

public class University {
	private String name, control, location;
	private int numStudents, numApplicants, academics, social, qualOfLife;
	private float expenses, financialAid, admitionRate, percentEnrolled, mfRatio, satVerbal, satMath;
	private ArrayList<String> emphases;

	public University(String name) {
		this.name = name;
	}

	public University(String name, String state, String location, String control, int numStudents, float mfRatio,
			float satVerbal, float satMath, float expenses, float financialAid, int numApplicants, float admitionRate,
			float percentEnrolled, int academics, int social, int qualOfLife) {
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
  
  public String toString() {
    return "Name: " + name + "\n Male/Female Ratio: " + mfRatio + "\n Control: " + control + "\n Location: "+ location + "\n Number of Students: "+ numStudents 
+"\n SAT Verbal: "+ satVerbal +"\n SAT Math: "+ satMath +"\n Number of Applicants: "+ numApplicants +"\n Academics:"+ academics +"\n Social: "+ social + "\n Quality of Life: "+ 
      qualOfLife + "\n Expenses: "+ expenses + "\n Financial Aid: "+ financialAid + "\n admition Rate: "+ admitionRate +"\n Percent Enrolled: "+ percentEnrolled;
  }
  
  public String getName() {
   return this.name;
  }
  
  public float getMfRatio() {
   return this.mfRatio;
  }
  public String getControl() {
   return this.control;
  }
  public String getLocation() {
   return this.location;
  }
  
  public int getNumStudents() {
   return this.numStudents;
  }
  
  public float getSatVerbal() {
   return this.satVerbal;
  }
  
  public float getSatMath() {
   return this.satMath;
  }
  
  public int getNumApplicants() {
   return this.numApplicants;
  }
  
  public int getAcademics() {
   return this.academics;
  }
  
  public int getSocial() {
   return this.social;
  }
  
  public int getQualOfLife() {
   return this.qualOfLife;
  }
  
  public float getExpenses() {
   return this.expenses;
  }
  
  public float getFinancialAid() {
   return this.financialAid;
  }

  public float getAdmitionRate() {
   return this.admitionRate;
  }
  
  public float getPercentEnrolled() {
   return this.percentEnrolled;
  }
  
 public static float similarity(String n1, String n2) {
  University u1 = DatabaseController.getUniversity(n1);
  University u2 = DatabaseController.getUniversity(n2);
  return (Math.abs(u1.getNumStudents()-u2.getNumStudents())) + (Math.abs(u1.getSatVerbal()-u2.getSatVerbal())) + (Math.abs(u1.getSatMath()-u2.getSatMath())) + (Math.abs(u1.getExpenses()-u2.getExpenses()))+ (Math.abs(u1.getFinancialAid()-u2.getFinancialAid())) +
    ((Math.abs(u1.getNumApplicants()-u2.getNumApplicants()))+(Math.abs(u1.getAdmitionRate()-u2.getAdmitionRate()))+(Math.abs(u1.getPercentEnrolled()-u2.getPercentEnrolled()))+(Math.abs(u1.getAcademics()-u2.getAcademics()))+(Math.abs(u1.getSocial()-u2.getSocial()))
    + (Math.abs(u1.getQualOfLife()-u2.getQualOfLife())));
 }
}
