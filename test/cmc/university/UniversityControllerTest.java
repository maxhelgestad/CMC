package cmc.university;


import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cmc.account.admin.AdminInteraction;
import cmc.account.user.UserInteraction;
import cmc.database.DatabaseController;
import cmc.university.University;
import junit.framework.Assert;

public class UniversityControllerTest {
	@Before
	public void setUp() throws Exception {
		DatabaseController.setUp("javengers", "csci230");
	}
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {

	
	}


	@SuppressWarnings("deprecation")
	@Test
	public void testgetSavedSchools() {

	}
}
