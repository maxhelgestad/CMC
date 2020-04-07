/**
 * 
 */
package cmc.database;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.admin.AdminInteraction;
import cmc.account.user.UserInteraction;
import cmc.university.University;
import junit.framework.Assert;

/**
 * @author mli001
 *
 */
public class DatabaseControllerTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		DatabaseController.setUp("javengers", "csci230");
		AdminInteraction.addAccount("Max", "Helgestad", "maxh2", "ilovemom", 'u', 'Y');
		UserInteraction.saveSchool("maxh2", "BARD"); 
		UserInteraction.saveSchool("maxh2", "CAL TECH"); 
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		DatabaseController.removeSchool("maxh2", "BARD");
		DatabaseController.removeSchool("maxh2", "CAL TECH");
		
		DatabaseController.removeAccount("maxh2");

	
	}


	@SuppressWarnings("deprecation")
	@Test
	public void testgetSavedSchools() {
		//ArrayList<University> test1 = UserInteraction.showSavedSchoolList("");
		ArrayList<University> savedSchools = new ArrayList<University>();   
		University u1 = DatabaseController.getUniversity("BARD");
		University u2 = DatabaseController.getUniversity("CAL TECH");
		savedSchools.add(u1);
		savedSchools.add(u2);
		//needed an empty array for the fourth one for them to match
		ArrayList a = new ArrayList();
		Assert.assertTrue("invalid name", UserInteraction.showSavedSchoolList("") == null);
		Assert.assertTrue("invalid name", UserInteraction.showSavedSchoolList(null) == null);
		Assert.assertTrue("Name doesn't exist", UserInteraction.showSavedSchoolList("Juser").equals(a));
		//fizzed the problem with the database returning "NoSchool" I dont know why it isnt passing now
		Assert.assertEquals(savedSchools, UserInteraction.showSavedSchoolList("maxh2"));
	}
	
	@Test
	public void testGetUniversity() {
		
		Assert.assertTrue("Name in the system", DatabaseController.getUniversity("BARD").getName().equals("BARD"));
		Assert.assertTrue("Not a real name", DatabaseController.getUniversity("Not real university").getName().equals("NoUniversity"));
		Assert.assertTrue("Blank String", DatabaseController.getUniversity("").getName().equals("NoUniversity"));
	}
	
	@Test
	public void testRemoveSchool() {
		
	}

}
