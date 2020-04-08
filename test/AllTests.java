import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cmc.account.AccountControllerTest;
import cmc.account.AccountTest;
import cmc.account.admin.AdminTest;
import cmc.account.user.UserControllerTest;
import cmc.account.user.UserTest;
import cmc.database.DatabaseControllerTest;
import cmc.search.SearchControllerTest;
import cmc.university.UniversityControllerTest;
import cmc.university.UniversityTest;

@RunWith(Suite.class)
@SuiteClasses({AccountControllerTest.class,AccountTest.class, AdminTest.class,UserControllerTest.class, UserTest.class,DatabaseControllerTest.class, SearchControllerTest.class, UniversityControllerTest.class, UniversityTest.class})
public class AllTests {

}
