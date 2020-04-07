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
	}

	@Test
	public void testLogOn() {
		Assert.assertTrue("Log on with correct credentials", AccountController.logOn("vincentusername", "password"));
		Assert.assertFalse("Log on with incorrect username", AccountController.logOn("jr", "password"));
		Assert.assertFalse("Log on with incorrect password ", AccountController.logOn("vincentusername", "00"));
	}

}
