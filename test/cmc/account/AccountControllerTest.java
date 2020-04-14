/**
 * 
 */
package cmc.account;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cmc.account.user.UserController;
import cmc.database.DatabaseController;

/**
 * @author mli001
 *
 */
public class AccountControllerTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		DatabaseController.setUp("javengers", "csci230");
		UserController.addUser("vincent", "kahlhamer", "vincentusername", "password", 'u', 'y');
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		DatabaseController.removeAccount("vincentusername");
		DatabaseController.removeAccount("maxjh");
	}

	@Test
	public void testLogOn() {
		Assert.assertTrue("Log on with correct credentials", AccountController.logOn("vincentusername", "password"));
		Assert.assertFalse("Log on with incorrect username", AccountController.logOn("jr", "password"));
		Assert.assertFalse("Log on with incorrect password ", AccountController.logOn("vincentusername", "00"));
	}
	
	@Test
	public void testViewUsers() {
		Assert.assertTrue("View List of all Regular Users: size should be 7"+ AccountController.getUsers().size(), AccountController.getUsers().size() == 8);
		UserController.addUser("max", "helg", "maxjh", "5678", 'a', 'y');
		Assert.assertTrue("View List of all Regular Users: size should be 7" + AccountController.getUsers().size(), AccountController.getUsers().size() == 8);	
	}
	
	@Test
	public void testAddAccounts() {
		Assert.assertTrue("adding a account", AccountController.addAccount("first", "last", "user", "pass", 'u', 'Y'));
		Assert.assertFalse("fails because of same username", AccountController.addAccount("first", "last", "user", "pass", 'u', 'Y'));
		Assert.assertFalse("fails because of firstname", AccountController.addAccount("", "last", "user", "pass", 'u', 'Y'));
		Assert.assertFalse("fails because of lastname", AccountController.addAccount("first", "", "user", "pass", 'u', 'Y'));
		Assert.assertFalse("fails because of username", AccountController.addAccount("first", "last", "", "pass", 'u', 'Y'));
		Assert.assertFalse("fails because of password", AccountController.addAccount("first", "last", "user", "", 'u', 'Y'));
		Assert.assertFalse("fails because of type", AccountController.addAccount("first", "last", "user", "pass", 'p', 'Y'));
		Assert.assertFalse("fails because of status", AccountController.addAccount("first", "last", "user", "pass", 'u', 'p'));
		DatabaseController.removeAccount("user");
	}

}
