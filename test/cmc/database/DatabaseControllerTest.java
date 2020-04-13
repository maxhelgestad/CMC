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
		Account a1;

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


		AdminInteraction.addAccount("Vincet","Kahlhamer","active", "password",'u','Y');
		AdminInteraction.addAccount("Vincet","Kahlhamer","notActive", "password",'u','N');
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		DatabaseController.removeSchool("TandJ", "BARD");
		DatabaseController.removeSchool("TandJ", "CAL TECH");
		
		DatabaseController.removeAccount("TandJ");

		DatabaseController.removeAccount("austin");
		
		DatabaseController.removeAccount("notActive");
		DatabaseController.removeAccount("active");
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
	
	@Test
	public void testGetUniversity() {
		
		Assert.assertTrue("Name in the system", DatabaseController.getUniversity("BARD").getName().equals("BARD"));
		Assert.assertTrue("Not a real name", DatabaseController.getUniversity("Not real university").getName().equals("NoUniversity"));
		Assert.assertTrue("Blank String", DatabaseController.getUniversity("").getName().equals("NoUniversity"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testUserEdit() {
		
		//changing profile with valid changes
		UserInteraction.viewToEditProfile("austin", "Password", "Austin", "Brandecker", 'u', 'Y');
		a1 = DatabaseController.lookupAccount("austin");
		Assert.assertTrue("Check to see if password is changed", a1.getPassword().equals("Password"));
		Assert.assertTrue("Checks to see if first name was changed", a1.getFirstname().equals("Austin"));
		Assert.assertTrue("Checks to see if last name was changed", a1.getLastName().equals("Brandecker"));
		UserInteraction.viewToEditProfile("austin", "password", "austin", "brandecker", 'u', 'Y');
		a1 = DatabaseController.lookupAccount("austin");
		
		//changing profile with invalid changes
		UserInteraction.viewToEditProfile("austin", "", "", "", 'u', 'Y');
		a1 = DatabaseController.lookupAccount("austin");
		Assert.assertTrue("Invalid change of password: ", a1.getPassword().equals("password"));
		Assert.assertTrue("Invalid change to first name: ", a1.getFirstname().equals("austin"));
		Assert.assertTrue("Invalid change to last name: ", a1.getLastName().equals("brandecker"));
		
		//changing profile with invalid username
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

}

