package cmc.account.user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.Account;
import cmc.account.admin.AdminInteraction;
import cmc.database.DatabaseController;
import junit.framework.Assert;
@SuppressWarnings("deprecation")
public class UserControllerTest {
	Account v, a;
	@Before
	public void setUp() throws Exception {
		DatabaseController.setUp("javengers", "csci230");
		UserController.addUser("vincent", "password", "vincent", "ka", 'u', 'y');
		v = DatabaseController.lookupAccount("vincent");
		UserController.addUser("austin", "brandecker", "abrand", "password", 'u', 'Y');
		a = DatabaseController.lookupAccount("abrand");
		
	}

	@After
	public void tearDown() throws Exception {
		DatabaseController.removeAccount("vincent");
	}

	
	@Test
	public void testAddNewUser() {
		Assert.assertTrue("checks to see if new user was created", v.getFirstname().equals("vincent"));
	}
	
	@Test
	public void testViewToEditProfile() {
		
		//changing type and status
		UserInteraction.viewToEditProfile("abrand", "password", "austin", "brandecker", 'a', 'N');
		a = DatabaseController.lookupAccount("abrand");
		Assert.assertTrue("Cannot change type as user", a.getType() == 'u');
		Assert.assertTrue("Cannot change status as user", a.getStatus() == 'Y');
	}
	


}
