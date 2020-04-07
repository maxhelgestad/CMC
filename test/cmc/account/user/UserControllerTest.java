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

	@Before
	public void setUp() throws Exception {
		DatabaseController.setUp("javengers", "csci230");
		UserController.addUser("vincent", "password", "vincent", "ka", 'u', 'y');
		Account v = DatabaseController.lookupAccount("juser");
		System.out.println(v);
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testAddNewUser() {
		//count v = DatabaseController.lookupAccount("vincent");
		//stem.out.println(v);
		//sert.assertTrue("checks to see if new user was created" + v.getFirstname(),  v.getFirstname() == "vincent");
	}

}
