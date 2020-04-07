package cmc.account.user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.Account;
import cmc.database.DatabaseController;
import junit.framework.Assert;
@SuppressWarnings("deprecation")
public class UserControllerTest {
	Account v;
	@Before
	public void setUp() throws Exception {
		DatabaseController.setUp("javengers", "csci230");
		UserController.addUser("vincent", "password", "vincent", "ka", 'u', 'y');
		v = DatabaseController.lookupAccount("vincent");
	}

	@After
	public void tearDown() throws Exception {
		DatabaseController.removeAccount("vincent");
	}

	@Test
	public void testAddNewUser() {
		Assert.assertTrue("checks to see if new user was created", v.getFirstname().equals("vincent"));
	}

}
