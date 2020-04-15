package cmc.university;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UniversityTest {
	University u;
	@Before
	public void setUp() throws Exception {

		float mfRatio = (float) 1.4; 
		float satVerbal = 4;
        float satMath = 3;
        float expenses = 50000;
        float financialAid = 20000;
        float admitionRate = 80;
        float percentEnrolled = 95; 
		u = new University("VincentsSchool", "Minnesota", "Rural", "control", 200000, mfRatio, satVerbal, satMath,
				expenses, financialAid, 2000000, admitionRate, percentEnrolled, 3, 5, 2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetters() {
		Assert.assertTrue("checks university returns correct name", u.getName() == "VincentsSchool");
		Assert.assertTrue("checks university returns correct state", u.getState() == "Minnesota");
		Assert.assertTrue("checks university returns correct location", u.getLocation() == "Rural");
		Assert.assertTrue("checks university returns correct control", u.getControl() == "control");
		Assert.assertTrue("checks university returns correct number of students", u.getNumStudents() == 200000);
		Assert.assertTrue("checks university returns correct male female ratio", u.getMfRatio() == (float)1.4);
		Assert.assertTrue("checks university returns correct SAT Verbal", u.getSatVerbal() == 4);
		Assert.assertTrue("checks university returns correct SAT Math", u.getSatMath() == 3);
		Assert.assertTrue("checks university returns correct expenses", u.getExpenses() == 50000);
		Assert.assertTrue("checks university returns correct financialAid", u.getFinancialAid() == 20000);
		Assert.assertTrue("checks university returns correct number of applicants", u.getNumApplicants() == 2000000);
		Assert.assertTrue("checks university returns correct admit rate", u.getAdmitionRate() == 80);
		Assert.assertTrue("checks university returns correct percent enrolled", u.getPercentEnrolled() == 95);
		Assert.assertTrue("checks university returns correct acadmenics", u.getAcademics() == 3);
		Assert.assertTrue("checks university returns correct social", u.getSocial() == 5);
		Assert.assertTrue("checks university returns correct qualitiy of life", u.getQualOfLife() == 2);
	}
	@Test
	public void testareStringsequal() {
	String s = null;
	String q = "CAL TECH";
	Assert.assertTrue("invalid s and q", University.areStringsEqual(s,q) == 1);
	
	s = "BARD";
	q = "";
	Assert.assertTrue("invalid q", University.areStringsEqual(s,q) == 1);
	
	q = "YALE";
	Assert.assertTrue("valid s and q", University.areStringsEqual(s,q) == 1);
	
	q = "BARD";
	Assert.assertTrue("valid s and q", University.areStringsEqual(s,q) == 0);
	}
	
}
