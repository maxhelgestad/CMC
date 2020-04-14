/**
 * 
 */
package cmc.account.admin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import cmc.account.Account;
import cmc.database.DatabaseController;

/**
 * @author mli001
 *
 */
public class AdminTest {
	Admin b;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		b = new Admin("Ben", "Richards", "brich", "beard", 'a', 'y');
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testLogOn() {
		Assert.assertTrue("admin log on should return true", b.logOn() == true);
	}

}
