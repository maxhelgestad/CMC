/**
 * 
 */
package cmc.database;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.Account;
import cmc.account.admin.AdminInteraction;
import cmc.account.user.User;
import cmc.account.user.UserController;
import cmc.account.user.UserInteraction;
import cmc.university.University;
import junit.framework.Assert;

/**
 * @author mli001
 *
 */
public class DatabaseControllerTest {
		Account a1, b;
		ArrayList<University> al1;
		University u1;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		DatabaseController.setUp("javengers", "csci230");

		AdminInteraction.addAccount("Max", "Helgestad", "maxh2", "ilovemom", 'u', 'Y');
		UserInteraction.saveSchool("maxh2", "BARD"); 
		UserInteraction.saveSchool("maxh2", "CAL TECH"); 
		
		UserController.addUser("austin", "brandecker", "austin", "password", 'u', 'Y');
		a1 = DatabaseController.lookupAccount("austin");

		AdminInteraction.addAccount("Tom","Jerryson","TandJ", "tomandjerry",'u','Y');
		UserInteraction.saveSchool("TandJ", "BARD"); 
		UserInteraction.saveSchool("TandJ", "CAL TECH"); 
		
		AdminInteraction.addAccount("Austin", "Brandecker", "abrand", "helloworld", 'u', 'Y');
		DatabaseController.addUniversity("COLLEGE", "MINNESOTA", "URBAN", "PUBLIC", 10000, 40, 500, 700, 10000, 40, 30000, 30, 50, 2, 4, 3);
		


		AdminInteraction.addAccount("Vincet","Kahlhamer","active", "password",'u','Y');
		AdminInteraction.addAccount("Vincet","Kahlhamer","notActive", "password",'u','N');
		
		UserController.addUser("ben", "rich", "ben", "password", 'u','y');
		b = DatabaseController.lookupAccount("ben");
		u1 = DatabaseController.getUniversity("BARD");
		DatabaseController.saveSchool("ben", "BARD");
		al1 = new ArrayList<University>();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		DatabaseController.removeSchool("TandJ", "BARD");
		DatabaseController.removeSchool("TandJ", "CAL TECH");
		
		DatabaseController.removeSchool("abrand", "COLLEGE");
		DatabaseController.removeAccount("abrand");
		
		DatabaseController.removeAccount("TandJ");

		DatabaseController.removeAccount("austin");
		
		DatabaseController.removeAccount("notActive");
		DatabaseController.removeAccount("active");
		
		DatabaseController.deleteUniversity("COLLEGE");
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


		Assert.assertTrue("Name doesn't exist", UserInteraction.showSavedSchoolList("tandj").equals(a));
		Assert.assertTrue("Name doesn't exist", UserInteraction.showSavedSchoolList("Juser").equals(a));
		
		for (int i = 0; i < savedSchools.size(); i++)
		{
		  Assert.assertEquals(savedSchools.get(i).toString(), DatabaseController.getSavedSchools("TandJ").get(i).toString());
		}
		
		
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGetUniversity() {
		//Black-Box
		Assert.assertTrue("Name in the system", DatabaseController.getUniversity("BARD").getName().equals("BARD"));
		Assert.assertTrue("Not a real name", DatabaseController.getUniversity("Not real university").getName().equals("NoUniversity"));
		Assert.assertTrue("Blank String", DatabaseController.getUniversity("").getName().equals("NoUniversity"));
		
		//White-Box
		Assert.assertTrue("University Existing in the Database", 
				DatabaseController.getUniversity("YALE").getName().equals("YALE"));
		Assert.assertTrue("University not existing in the Database", 
				DatabaseController.getUniversity("DUMMY").getName().equals("NoUniversity"));
		Assert.assertTrue("Empty String", DatabaseController.getUniversity("").getName().equals("NoUniversity"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testUserEdit() {
		
		/**
		 * black box
		 */
		//Valid change
		UserInteraction.viewToEditProfile("austin", "Password", "Austin", "Brandecker", 'u', 'Y');
		a1 = DatabaseController.lookupAccount("austin");
		Assert.assertTrue("valid change", a1.getPassword().equals("Password"));
		UserInteraction.viewToEditProfile("austin", "password", "austin", "brandecker", 'u', 'Y');
		
		//invalid change
		UserInteraction.viewToEditProfile("austin", "", "", "", 'u', 'Y');
		a1 = DatabaseController.lookupAccount("austin");
		Assert.assertFalse("Invalid change", a1.getPassword().equals(""));
		
		/**
		 * white box
		 */
		//changing profile with valid changes[path 1]
		UserInteraction.viewToEditProfile("austin", "Password", "Austin", "Brandecker", 'u', 'Y');
		a1 = DatabaseController.lookupAccount("austin");
		Assert.assertTrue("Check to see if password is changed", a1.getPassword().equals("Password"));
		Assert.assertTrue("Checks to see if first name was changed", a1.getFirstname().equals("Austin"));
		Assert.assertTrue("Checks to see if last name was changed", a1.getLastName().equals("Brandecker"));

		Assert.assertTrue("Checks to confirm status was unchanged", a1.getStatus() == 'Y');
		

		UserInteraction.viewToEditProfile("austin", "password", "austin", "brandecker", 'u', 'Y');
		a1 = DatabaseController.lookupAccount("austin");
		
		//changing profile with invalid changes[path2]
		UserInteraction.viewToEditProfile("austin", "", "", "", 'u', 'Y');
		a1 = DatabaseController.lookupAccount("austin");
		Assert.assertTrue("Invalid change of password: ", a1.getPassword().equals("password"));
		Assert.assertTrue("Invalid change to first name: ", a1.getFirstname().equals("austin"));
		Assert.assertTrue("Invalid change to last name: ", a1.getLastName().equals("brandecker"));
		
		//changing profile with invalid username[path 3]
		UserInteraction.viewToEditProfile("austi", "Password", "austin", "brandecker", 'u', 'Y');
		a1 = DatabaseController.lookupAccount("austin");
		Assert.assertTrue("Invalid username: ", a1.getPassword().equals("password"));
		
	}
	@SuppressWarnings("deprecation")
	@Test
	public void testAddAccount() {
		ArrayList<Account> all = DatabaseController.getAccounts();
		for (int i = 0; i < all.size(); i++)
		{
			if(all.get(i).getUsername().equals("TandJ"))
			{
				System.out.println("Account exists");
				Assert.assertEquals("TandJ", all.get(i).getUsername());
			}
			
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSaveSchool() {
		/**
		 * blackbox
		 */
		//valid change
		UserInteraction.saveSchool("abrand", "COLLEGE");
		ArrayList<University> savedschools = UserInteraction.showSavedSchoolList("abrand");
		for (University u: savedschools) {
			if(u.getName().equals("COLLEGE")) {
				Assert.assertTrue("Valid change", u.getName().equals("COLLEGE"));
			}
		}
		
		//invalid change
		UserInteraction.saveSchool("abrand", "COLLEG");
		University uni = DatabaseController.getUniversity("COLLEG");
		savedschools = UserInteraction.showSavedSchoolList("abrand");
		Assert.assertFalse("University is Invalid", savedschools.contains(uni));
		
		/**
		 * whitebox testing
		 */
		//saves school[path 1]
		UserInteraction.saveSchool("abrand", "COLLEGE");
		ArrayList<University> schools = UserInteraction.showSavedSchoolList("abrand");
		for (University u: schools) {
			if (u.getName().equals("COLLEGE")) {
				Assert.assertTrue("School is saved", u.getName().equals("COLLEGE"));
			}
		}
		
		//University doesn't exist [path 2]
		UserInteraction.saveSchool("abrand", "COLLEG");
		University u = DatabaseController.getUniversity("COLLEG");
		schools = UserInteraction.showSavedSchoolList("abrand");
		Assert.assertFalse("University is Invalid", schools.contains(u));
		
		//Account doesn't exist [path 3]
		UserInteraction.saveSchool("abran", "COLLEGE");
		University u1 = DatabaseController.getUniversity("COLLEGE");
		schools = UserInteraction.showSavedSchoolList("abran");
		Assert.assertFalse("Account doesn't exist", schools.contains(u1));
		
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testDeactivateUser() {
		DatabaseController.deactivateUser("active");
		Account a = DatabaseController.lookupAccount("active");
		Assert.assertTrue("Deactivated user active" + a.getStatus(), a.getStatus() == 'N');
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testActivateUser() {
		DatabaseController.activateUser("notActive");
		Account a = DatabaseController.lookupAccount("notActive");
		Assert.assertTrue("activated user notActive" + a.getStatus(), a.getStatus() == 'Y');
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testLookupAccount() {
		//white box
		Assert.assertTrue("lookup account with existing username", 
				DatabaseController.lookupAccount("maxh2").getUsername().equals("maxh2"));
		Assert.assertTrue("lookup account with nonexisting username", 
				DatabaseController.lookupAccount("maxh3").getUsername().equals("x"));
		
		//black box
		Assert.assertTrue("lookup account with existing username", 
				DatabaseController.lookupAccount("juser").getUsername().equals("juser"));
		Assert.assertTrue("lookup account with nonexisting username", 
				DatabaseController.lookupAccount("juser5").getUsername().equals("x"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGetUniversities() {
		Assert.assertTrue("checks if database controller returns univeristy list(should be 178)",
				DatabaseController.getUniversities().size() == 178);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testRemoveSchool() {
		
		Assert.assertFalse("Check if school is in saved school list",DatabaseController.getSavedSchools("ben").equals(al1));
		DatabaseController.removeSchool("ben", "BARD");
		Assert.assertTrue("Check if school list is empty",DatabaseController.getSavedSchools("ben").equals(al1));

	}
}

