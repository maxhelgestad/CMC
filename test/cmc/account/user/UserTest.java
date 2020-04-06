package cmc.account.user;

import static org.junit.Assert.*;


public class UserTest {

	@Before
	public void setUp() throws Exception {
		DatabaseController.setUp("javengers", "csci230");
		AdminInteraction.addAccount("Austin", "Brandecker", "abrand", "password", 'u', 'Y');
	}
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEditProfile() {
		
		UserInteraction.viewToEditProfile("abrand", "Abrand", "Password", "Austin", "Brandecker");
		Assert.assertEquals("username should be new username", "Abrand", Account.getUsername());
		Assert.assertEquals("password should be new password", "Password", Account.getPassword());
		
		
	}
}


