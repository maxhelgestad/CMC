package cmc.search;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.database.DatabaseController;
import cmc.university.University;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class SearchControllerTest {
	Criteria c1, c2, c3, c4, c5;

	@Before
	public void setUp() throws Exception {
		DatabaseController.addUniversity("MAX", "MINNESOTA", "URBAN", "PUBLIC", 10000, 40, 500, 700, 10000, 40, 30000, 30, 50, 2, 4, 3);
		DatabaseController.addUniversity("HELGESTAD", "FLORIDA", "URBAN", "PRIVATE", 20000, 60, 700, 500, 20000, 50, 50000, 40, 50, 4, 2, 4);
		DatabaseController.addUniversity("JACOB", "WISCONSIN", "RURAL", "PUBLIC", 5000, 50, 600, 600, 20000, 60, 40000, 50, 50, 3, 3, 2);
		this.c1 = new Criteria("HELGEST", "FLOR", "", "P", 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000);
		this.c2 = new Criteria("", "MINN", "URB", "P", 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000);
		this.c3 = new Criteria("JACOB", "A", "RUR", "", 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000);
		this.c4 = new Criteria("XYZ", "FLORIDQ", "RUR", "", -5, 50000, -1, 50000, -1, 50000, -1, 50000, -1, 50000, -1, 50000, -1, 50000, -1, 50000, -1, 50000, -1, 50000, -1, 50000, -1, 50000);
		this.c5 = new Criteria("HELGESQ", "FLORIDQ", "", "PRI", -1, 50000, -1, 50000, -1, 50000, 1, 50000, 1, 50000, 1, 50000, 1, 50000, -1, 50000, 1, 50000, 1, 50000, -1, 50000, 1, 50000);
		
	}

	@After
	public void tearDown() throws Exception {
		DatabaseController.deleteUniversity("MAX");
		DatabaseController.deleteUniversity("JACOB");
		DatabaseController.deleteUniversity("HELGESTAD");
	}

	@Test
	public void testSearch() throws Exception {
		//White-Box Tests (getters from Criteria)
		Assert.assertTrue("Testing getName() method from Criteria Class: ", this.c1.getName() == "HELGEST");
		Assert.assertTrue("Testing getNumStudents() method from Criteria Class: ", this.c2.getNumStudentsT() == 50000);
		
		//Black-Box Tests (Search)
		Assert.assertTrue("Testing search with criteria 1", SearchController.searchSchool(this.c1).size() == 1);
		Assert.assertTrue("Testing search with criteria 2", SearchController.searchSchool(this.c2).size() == 1);
		Assert.assertTrue("Testing search with criteria 3", SearchController.searchSchool(this.c3).size() == 1);
		Assert.assertTrue("Testing search with criteria 4", SearchController.searchSchool(this.c4).size() == 0);
		Assert.assertTrue("Testing search with criteria 5", SearchController.searchSchool(this.c5).size() == 0);
		
	}

}
