package cmc.search;


/**
 * Criteria class for use in the searching of universities
 * 
 * @author jkost001
 *
 */
public class Criteria {

	//name of the School, state its in, location, and control type
	private String name, state, location, control; 
	//upper and lower bounds for number of students
	private int numStudentsB,  numStudentsT;
	//upper and lower bounds for male to female ratio
	private float mfRatioB,  mfRatioT;
	//upper and lower bounds for SATVerbal scores
	private float satVerbalB,  satVerbalT;
	//upper and lower bounds for SATMath scores
	private float satMathB,  satMathT;
	//upper and lower bounds for expenses
	private float expensesB,  expensesT;
	//upper and lower bounds for financial aid percentage
	private float financialAidB,  financialAidT;
	//upper and lower bounds for number of applications
	private int numApplicantsB,  numApplicantsT;
	//upper and lower bounds for admition rate
	private float admitionRateB,  admitionRateT;
	//upper and lower bounds for percent enrolled
	private float percentEnrolledB,  percentEnrolledT;
	//upper and lower bounds for academics scale
	private	int academicsB,  academicsT;
	//upper and lower bounds Social scale
	private	int socialB,  socialT;
	//upper and lower bounds for quality of life scale
	private int qualOfLifeB,  qualOfLifeT;

/**
 * Constructs a criteria object for searching
 * 
 * @param name name of the university - can be substring that the name might contain
 * @param state name of the state - can be substring that the state name might contain
 * @param location name of the location - can be substring that the location might contain
 * @param control name of the control - can be substring that the control might contain
 * @param numStudentsB lower bound of number of students - if not entered will be -1
 * @param numStudentsT upper bound of number of students - if not entered will be MAX_VALUE
 * @param mfRatioB lower bound of male female ratio - if not entered will be -1
 * @param mfRatioT upper bound of male female ratio - if not entered will be MAX_VALUE
 * @param satVerbalB lower bound of SATVerbal - if not entered will be -1
 * @param satVerbalT upper bound of SATverbal - if not entered will be MAX_VALUE
 * @param satMathB lower bound of SATMath - if not entered will be -1
 * @param satMathT upper bound of SATMath - if not entered will be MAX_VALUE
 * @param expensesB lower bound of expenses - if not entered will be -1
 * @param expensesT upper bound of expenses - if not entered will be MAX_VALUE
 * @param financialAidB lower bound of financial aid percentage - if not entered will be -1
 * @param financialAidT upper bound of financial aid percentage - if not entered will be MAX_VALUE
 * @param numApplicantsB lower bound of number of applicants - if not entered will be -1
 * @param numApplicantsT upper bound of number of applicants - if not entered will be MAX_VALUE
 * @param admitionRateB lower bound of admition rate - if not entered will be -1
 * @param admitionRateT upper bound of admition rate - if not entered will be MAX_VALUE
 * @param percentEnrolledB lower bound of percent Enrolled - if not entered will be -1
 * @param percentEnrolledT upper bound of percent Enrolled - if not entered will be MAX_VALUE
 * @param academicsB lower bound of academics - if not entered will be -1
 * @param academicsT upper bound of academics - if not entered will be MAX_VALUE
 * @param socialB lower bound of social - if not entered will be -1
 * @param socialT upper bound of social - if not entered will be MAX_VALUE
 * @param qualOfLifeB lower bound of quality of life - if not entered will be -1
 * @param qualOfLifeT upper bound of quality of life - if not entered will be MAX_VALUE
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
  this.numStudentsT = numStudentsT;
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
  this.numApplicantsB = numApplicantsB;
  this.numApplicantsT = numApplicantsT;
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


