package cmc.account.user;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.Account;
import cmc.account.admin.AdminInteraction;
import cmc.database.DatabaseController;
import cmc.university.University;
import junit.framework.Assert;
@SuppressWarnings("deprecation")
public class UserControllerTest {
	Account v, b;
	Account a1;
	University u1;
	ArrayList<University> al1;
	@Before
	public void setUp() throws Exception {
		DatabaseController.setUp("javengers", "csci230");
		UserController.addUser("vincent", "password", "vincent", "ka", 'u', 'y');
		v = DatabaseController.lookupAccount("vincent");
		
	
		UserController.addUser("austin", "brandecker", "austin", "password", 'u', 'Y');
		a1 = DatabaseController.lookupAccount("austin");
		
		UserController.addUser("ben", "rich", "ben", "password", 'u','y');
		b = DatabaseController.lookupAccount("ben");
		u1 = DatabaseController.getUniversity("BARD");
		DatabaseController.saveSchool("ben", "BARD");
		al1 = new ArrayList();

	}

	@After
	public void tearDown() throws Exception {
		DatabaseController.removeAccount("vincent");
		DatabaseController.removeAccount("austin");
	}

	@Test
	public void testAddNewUser() {
		Assert.assertTrue("checks to see if new user was created", v.getFirstname().equals("vincent"));
	}
	
	@Test
	public void testEditProfile() {
		
		UserInteraction.viewToEditProfile("austin", "Password", "Austin", "Brandecker", 'u', 'Y');
		a1 = DatabaseController.lookupAccount("austin");
		Assert.assertTrue("Check to see if password is changed", a1.getPassword().equals("Password"));
		Assert.assertTrue("Checks to see if first name was changed", a1.getFirstname().equals("Austin"));
		Assert.assertTrue("Checks to see if last name was changed", a1.getLastName().equals("Brandecker"));
	}
	
	@Test
	public void testRemoveSchool() {
		
		Assert.assertFalse("Check if school is in saved school list",DatabaseController.getSavedSchools("ben").equals(al1));
		DatabaseController.removeSchool("ben", "BARD");
		Assert.assertTrue("Check if school list is empty",DatabaseController.getSavedSchools("ben").equals(al1));
	}


}
