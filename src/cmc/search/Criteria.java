package cmc.search;


/**
 * Criteria class for use in the searching of universities
 * 
 * @author jkost001
 *
 */
public class Criteria {

 
	private String name,state, location, control; 
	private int numStudentsB,  numStudentsT;
	private float mfRatioB,  mfRatioT;
	private float satVerbalB,  satVerbalT;
	private float satMathB,  satMathT;
	private float expensesB,  expensesT;
	private float financialAidB,  financialAidT;
	private int numApplicantsB,  numApplicantsT;
	private float admitionRateB,  admitionRateT;
	private float percentEnrolledB,  percentEnrolledT;
	private	int academicsB,  academicsT;
	private	int socialB,  socialT;
	private int qualOfLifeB,  qualOfLifeT;

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
 public Criteria(String name, String state, String location, String control, 
		 int numStudentsB, int numStudentsT,
		 float mfRatioB, float mfRatioT,
			float satVerbalB, float satVerbalT,
			float satMathB, float satMathT,
			float expensesB, float expensesT,
			float financialAidB, float financialAidT,
			int numApplicantsB, int numApplicantsT,
			float admitionRateB, float admitionRateT,
			float percentEnrolledB, float percentEnrolledT,
			int academicsB, int academicsT,
			int socialB, int socialT,
			int qualOfLifeB, int qualOfLifeT){
  this.name = name;
  this.mfRatioB = mfRatioB;
  this.mfRatioT = mfRatioT;
  this.numStudentsB = numStudentsB;
  this.control = control;
  this.location = location;
  this.satVerbalB = satVerbalB;
  this.satVerbalT = satVerbalT;
  this.satMathB = satMathB;
  this.satMathT = satMathT;
  this.expensesB = expensesB;
  this.expensesT = expensesT;
  this.financialAidB = financialAidB;
  this.financialAidT = financialAidT;
  this.admitionRateB = admitionRateB;
  this.admitionRateT = admitionRateT;
  this.percentEnrolledB = percentEnrolledB;
  this.percentEnrolledT = percentEnrolledT;
  this.academicsB = academicsB;
  this.academicsT = academicsT;
  this.socialB = socialB;
  this.socialT = socialT;
  this.qualOfLifeB= qualOfLifeB;
  this.qualOfLifeT = qualOfLifeT;
  this.state = state;
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
 * @return the state
 */
public String getState() {
	return state;
}

/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
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
 * @return the numStudentsB
 */
public int getNumStudentsB() {
	return numStudentsB;
}

/**
 * @param numStudentsB the numStudentsB to set
 */
public void setNumStudentsB(int numStudentsB) {
	this.numStudentsB = numStudentsB;
}

/**
 * @return the numStudentsT
 */
public int getNumStudentsT() {
	return numStudentsT;
}

/**
 * @param numStudentsT the numStudentsT to set
 */
public void setNumStudentsT(int numStudentsT) {
	this.numStudentsT = numStudentsT;
}

/**
 * @return the mfRatioB
 */
public float getMfRatioB() {
	return mfRatioB;
}

/**
 * @param mfRatioB the mfRatioB to set
 */
public void setMfRatioB(float mfRatioB) {
	this.mfRatioB = mfRatioB;
}

/**
 * @return the mfRatioT
 */
public float getMfRatioT() {
	return mfRatioT;
}

/**
 * @param mfRatioT the mfRatioT to set
 */
public void setMfRatioT(float mfRatioT) {
	this.mfRatioT = mfRatioT;
}

/**
 * @return the satVerbalB
 */
public float getSatVerbalB() {
	return satVerbalB;
}

/**
 * @param satVerbalB the satVerbalB to set
 */
public void setSatVerbalB(float satVerbalB) {
	this.satVerbalB = satVerbalB;
}

/**
 * @return the satVerbalT
 */
public float getSatVerbalT() {
	return satVerbalT;
}

/**
 * @param satVerbalT the satVerbalT to set
 */
public void setSatVerbalT(float satVerbalT) {
	this.satVerbalT = satVerbalT;
}

/**
 * @return the satMathB
 */
public float getSatMathB() {
	return satMathB;
}

/**
 * @param satMathB the satMathB to set
 */
public void setSatMathB(float satMathB) {
	this.satMathB = satMathB;
}

/**
 * @return the satMathT
 */
public float getSatMathT() {
	return satMathT;
}

/**
 * @param satMathT the satMathT to set
 */
public void setSatMathT(float satMathT) {
	this.satMathT = satMathT;
}

/**
 * @return the expensesB
 */
public float getExpensesB() {
	return expensesB;
}

/**
 * @param expensesB the expensesB to set
 */
public void setExpensesB(float expensesB) {
	this.expensesB = expensesB;
}

/**
 * @return the expensesT
 */
public float getExpensesT() {
	return expensesT;
}

/**
 * @param expensesT the expensesT to set
 */
public void setExpensesT(float expensesT) {
	this.expensesT = expensesT;
}

/**
 * @return the financialAidB
 */
public float getFinancialAidB() {
	return financialAidB;
}

/**
 * @param financialAidB the financialAidB to set
 */
public void setFinancialAidB(float financialAidB) {
	this.financialAidB = financialAidB;
}

/**
 * @return the financialAidT
 */
public float getFinancialAidT() {
	return financialAidT;
}

/**
 * @param financialAidT the financialAidT to set
 */
public void setFinancialAidT(float financialAidT) {
	this.financialAidT = financialAidT;
}

/**
 * @return the numApplicantsB
 */
public int getNumApplicantsB() {
	return numApplicantsB;
}

/**
 * @param numApplicantsB the numApplicantsB to set
 */
public void setNumApplicantsB(int numApplicantsB) {
	this.numApplicantsB = numApplicantsB;
}

/**
 * @return the numApplicantsT
 */
public int getNumApplicantsT() {
	return numApplicantsT;
}

/**
 * @param numApplicantsT the numApplicantsT to set
 */
public void setNumApplicantsT(int numApplicantsT) {
	this.numApplicantsT = numApplicantsT;
}

/**
 * @return the admitionRateB
 */
public float getAdmitionRateB() {
	return admitionRateB;
}

/**
 * @param admitionRateB the admitionRateB to set
 */
public void setAdmitionRateB(float admitionRateB) {
	this.admitionRateB = admitionRateB;
}

/**
 * @return the admitionRateT
 */
public float getAdmitionRateT() {
	return admitionRateT;
}

/**
 * @param admitionRateT the admitionRateT to set
 */
public void setAdmitionRateT(float admitionRateT) {
	this.admitionRateT = admitionRateT;
}

/**
 * @return the percentEnrolledB
 */
public float getPercentEnrolledB() {
	return percentEnrolledB;
}

/**
 * @param percentEnrolledB the percentEnrolledB to set
 */
public void setPercentEnrolledB(float percentEnrolledB) {
	this.percentEnrolledB = percentEnrolledB;
}

/**
 * @return the percentEnrolledT
 */
public float getPercentEnrolledT() {
	return percentEnrolledT;
}

/**
 * @param percentEnrolledT the percentEnrolledT to set
 */
public void setPercentEnrolledT(float percentEnrolledT) {
	this.percentEnrolledT = percentEnrolledT;
}

/**
 * @return the academicsB
 */
public int getAcademicsB() {
	return academicsB;
}

/**
 * @param academicsB the academicsB to set
 */
public void setAcademicsB(int academicsB) {
	this.academicsB = academicsB;
}

/**
 * @return the academicsT
 */
public int getAcademicsT() {
	return academicsT;
}

/**
 * @param academicsT the academicsT to set
 */
public void setAcademicsT(int academicsT) {
	this.academicsT = academicsT;
}

/**
 * @return the socialB
 */
public int getSocialB() {
	return socialB;
}

/**
 * @param socialB the socialB to set
 */
public void setSocialB(int socialB) {
	this.socialB = socialB;
}

/**
 * @return the socialT
 */
public int getSocialT() {
	return socialT;
}

/**
 * @param socialT the socialT to set
 */
public void setSocialT(int socialT) {
	this.socialT = socialT;
}

/**
 * @return the qualOfLifeB
 */
public int getQualOfLifeB() {
	return qualOfLifeB;
}

/**
 * @param qualOfLifeB the qualOfLifeB to set
 */
public void setQualOfLifeB(int qualOfLifeB) {
	this.qualOfLifeB = qualOfLifeB;
}

/**
 * @return the qualOfLifeT
 */
public int getQualOfLifeT() {
	return qualOfLifeT;
}

/**
 * @param qualOfLifeT the qualOfLifeT to set
 */
public void setQualOfLifeT(int qualOfLifeT) {
	this.qualOfLifeT = qualOfLifeT;
}





}


