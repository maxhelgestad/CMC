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
  Account user = DatabaseController.getUser(userName, password);
  if(user == null) {
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

}
