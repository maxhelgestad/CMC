/**
 * 
 */
package cmc.account;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author vkahlhame001
 *
 */
public class AccountTest {
	Account a;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		a = new Account("firstname", "lastName", "username", "password", 'u', 'Y');
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetters() {
		Assert.assertTrue("Account returns correct firstname", a.getFirstname() == "firstname");
		Assert.assertTrue("Account returns correct lastName", a.getLastName() == "lastName");
		Assert.assertTrue("Account returns correct username", a.getUsername() == "username");
		Assert.assertTrue("Account returns correct password", a.getPassword() == "password");
		Assert.assertTrue("Account returns correct Type", a.getType() == 'u');
		Assert.assertTrue("Account returns correct status", a.getStatus() == 'Y');
	}
	
	@Test
	public void testSetters() {
		a.setFirstname("Vincent");
		Assert.assertTrue("Account returns correct firstname", a.getFirstname() == "Vincent");
		a.setLastName("kahlhamer");
		Assert.assertTrue("Account returns correct lastName", a.getLastName() == "kahlhamer");
		a.setUsername("user");
		Assert.assertTrue("Account returns correct username", a.getUsername() == "user");
		a.setPassword("asdf");
		Assert.assertTrue("Account returns correct password", a.getPassword() == "asdf");
		a.setType('a');
		Assert.assertTrue("Account returns correct Type", a.getType() == 'a');
		a.setStatus('N');
		Assert.assertTrue("Account returns correct status", a.getStatus() == 'N');
	}

}
