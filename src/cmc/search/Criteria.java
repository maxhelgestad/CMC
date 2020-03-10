package cmc.search;

import java.util.List;


/**
 * Criteria class for use in the searching of universities
 * 
 * @author jkost001
 *
 */
public class Criteria {

 
 
 private String name;
 private float mfRatio;
 private int numStudents;
 private String control;
 private String location;
 private float satVerbal;
 private float satMath;
 private float expenses;
 private float financialAid;
 private float admitionRate;
 private float percentEnrolled;
 private int academics;
 private int social;
 private int qualOfLife;

 /**
  * criteria constructor
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
 public Criteria(String name, String state, String location, String control, int numStudents, float mfRatio,
			float satVerbal, float satMath, float expenses, float financialAid, int numApplicants, float admitionRate,
			float percentEnrolled, int academics, int social, int qualOfLife){
  this.name = name;
  this.mfRatio = mfRatio;
  this.numStudents = numStudents;
  this.control = control;
  this.location = location;
  this.satVerbal = satVerbal;
  this.satMath = satMath;
  this.expenses = expenses;
  this.financialAid = financialAid;
  this.admitionRate = admitionRate;
  this.percentEnrolled = percentEnrolled;
  this.academics = academics;
  this.social = social;
  this.qualOfLife = qualOfLife;
 }

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the mfRatio
 */
public float getMfRatio() {
	return mfRatio;
}

/**
 * @param mfRatio the mfRatio to set
 */
public void setMfRatio(float mfRatio) {
	this.mfRatio = mfRatio;
}

/**
 * @return the numStudents
 */
public int getNumStudents() {
	return numStudents;
}

/**
 * @param numStudents the numStudents to set
 */
public void setNumStudents(int numStudents) {
	this.numStudents = numStudents;
}

/**
 * @return the control
 */
public String getControl() {
	return control;
}

/**
 * @param control the control to set
 */
public void setControl(String control) {
	this.control = control;
}

/**
 * @return the location
 */
public String getLocation() {
	return location;
}

/**
 * @param location the location to set
 */
public void setLocation(String location) {
	this.location = location;
}

/**
 * @return the satVerbal
 */
public float getSatVerbal() {
	return satVerbal;
}

/**
 * @param satVerbal the satVerbal to set
 */
public void setSatVerbal(float satVerbal) {
	this.satVerbal = satVerbal;
}

/**
 * @return the satMath
 */
public float getSatMath() {
	return satMath;
}

/**
 * @param satMath the satMath to set
 */
public void setSatMath(float satMath) {
	this.satMath = satMath;
}

/**
 * @return the expenses
 */
public float getExpenses() {
	return expenses;
}

/**
 * @param expenses the expenses to set
 */
public void setExpenses(float expenses) {
	this.expenses = expenses;
}

/**
 * @return the financialAid
 */
public float getFinancialAid() {
	return financialAid;
}

/**
 * @param financialAid the financialAid to set
 */
public void setFinancialAid(float financialAid) {
	this.financialAid = financialAid;
}

/**
 * @return the admitionRate
 */
public float getAdmitionRate() {
	return admitionRate;
}

/**
 * @param admitionRate the admitionRate to set
 */
public void setAdmitionRate(float admitionRate) {
	this.admitionRate = admitionRate;
}

/**
 * @return the percentEnrolled
 */
public float getPercentEnrolled() {
	return percentEnrolled;
}

/**
 * @param percentEnrolled the percentEnrolled to set
 */
public void setPercentEnrolled(float percentEnrolled) {
	this.percentEnrolled = percentEnrolled;
}

/**
 * @return the academics
 */
public int getAcademics() {
	return academics;
}

/**
 * @param academics the academics to set
 */
public void setAcademics(int academics) {
	this.academics = academics;
}

/**
 * @return the social
 */
public int getSocial() {
	return social;
}

/**
 * @param social the social to set
 */
public void setSocial(int social) {
	this.social = social;
}

/**
 * @return the qualOfLife
 */
public int getQualOfLife() {
	return qualOfLife;
}

/**
 * @param qualOfLife the qualOfLife to set
 */
public void setQualOfLife(int qualOfLife) {
	this.qualOfLife = qualOfLife;
}

}


