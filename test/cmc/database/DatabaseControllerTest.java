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
		AdminInteraction.addAccount("Max", "Helgestad", "maxh", "ilovemom", 'u', 'Y');
		UserInteraction.saveSchool("juser", "YALE"); 
		UserInteraction.saveSchool("juser", "AUBURN"); 
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
		
	
	}


	@SuppressWarnings("deprecation")
	@Test
	public void testgetSavedSchools() {
		//ArrayList<University> test1 = UserInteraction.showSavedSchoolList("");
		ArrayList<University> savedSchools = new ArrayList<University>();   
		University u1 = DatabaseController.getUniversity("YALE");
		University u2 = DatabaseController.getUniversity("AUBURN");
		savedSchools.add(u1);
		savedSchools.add(u2);
		
		Assert.assertTrue("invalid name", UserInteraction.showSavedSchoolList("") == null);
		Assert.assertTrue("invalid name", UserInteraction.showSavedSchoolList(null) == null);
		Assert.assertTrue("Name doesn't exist", UserInteraction.showSavedSchoolList("Juser") == null);
		//Assert.assertEquals(savedSchools, UserInteraction.showSavedSchoolList("juser"));
	}

}
