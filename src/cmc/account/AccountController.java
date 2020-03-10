package cmc.account;

import java.util.ArrayList;
import java.util.List;

import cmc.database.DatabaseController;

/**
 * @author mli001
 *
 */
public class AccountController {
 
 public List<Account> accounts;

 public boolean checkUser(String userName, String password)
 {
  return false;
 }
 
 public static boolean logOn(String userName, String password)
 {
  Account user = DatabaseController.lookupAccount(userName);
  if(user == null) {
   return false;
  }
  // could be !.equals if doesn't work - Max thought of this
  else if(user.getPassword() != password)
  {
	  return false;
  }
  else {
   return true;
  }
 }
 
 public static ArrayList<Account> getUsers()
 {
  return DatabaseController.getAccounts();
 }
 
 public static void addAccount(String firstName, String lastName, String username, String password, char type, char status) {
		DatabaseController.addAccount(firstName, lastName, username, password, type, status);
	 }

}
