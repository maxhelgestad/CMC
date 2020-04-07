/**
 * 
 */
package cmc.account.user;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.Account;
import cmc.account.admin.AdminInteraction;
import cmc.database.DatabaseController;
import junit.framework.Assert;

/**
 * @author mli001
 *
 */
public class UserTest {
	private Account a1, a2, a3;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		DatabaseController.setUp("javengers", "csci230");
		AdminInteraction.addAccount("austin", "brandecker", "abrand", "password", 'u', 'Y');
		AdminInteraction.addAccount("ben", "richards", "brich", "beard", 'u', 'Y');
		AdminInteraction.addAccount("jared", "kost", "jkost", "money", 'u', 'Y');

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		DatabaseController.removeAccount("abrand");
		DatabaseController.removeAccount("brich");
		DatabaseController.removeAccount("jkost");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testEditProfile() {
		a1 = DatabaseController.lookupAccount("abrand");
		a2 = DatabaseController.lookupAccount("brich");
		a3 = DatabaseController.lookupAccount("jkost");
		
		UserInteraction.viewToEditProfile("abrand", "Password", "Austin", "Brandecker", 'u', 'Y');
		Assert.assertEquals("Password", a1.getPassword());

	}
}
