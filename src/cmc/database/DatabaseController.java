package cmc.database;

import java.awt.List;
import java.sql.Array;
import java.util.ArrayList;

import cmc.account.Account;
import cmc.account.user.User;
import cmc.university.University;

public class DatabaseController {
 private static University one, two, three, four, five, six; 
 private static ArrayList<University> universities; 
 private static ArrayList<Account> accounts;
 private static Account sam, james;
 private static ArrayList<String> emphases;


 
public static void setSchool() {
 emphases = new ArrayList<String>();
 emphases.add("hi");
 one = new University("SJU", "half", "one", "Collegeville", 300, 50, 50, 1000, 95, 3, 5, 10, 1, 5, 25, emphases);
 two = new University("CSB", "half", "one", "Collegeville", 800, 50, 50, 2000, 95, 4, 5, 10, 2, 5, 25, emphases);
 three = new University("UST", "half", "one", "Collegeville", 1000, 75, 50, 1500, 100, 3, 2, 12, 1, 5, 25, emphases);
 four = new University("hi", "half", "one", "Collegeville", 1200, 40, 60, 1500, 80, 3, 5, 10, 1, 5, 25, emphases);
 five = new University("max", "half", "one", "Collegeville", 2000, 60, 40, 1250, 70, 2, 4, 14, 2, 5, 25, emphases);
 six = new University("UMN", "half", "one", "Collegeville", 4000, 50, 50, 1000, 95, 3, 5, 10, 1, 5, 25, emphases);
 universities = new ArrayList<University>();
 universities.add(one);
 universities.add(two);
 universities.add(three);
 universities.add(four);
 universities.add(five);
 universities.add(six);
}

public static void setUser() {
 sam = new Account("sammy", "password");
 james = new Account("james", "12345");
 accounts = new ArrayList<Account>();
 accounts.add(sam);
 accounts.add(james);
}

 
  public static ArrayList<University> getSchool(String schoolName, int numStudents) {
   int i = 0;
   ArrayList<University> uni = new ArrayList<University>();
   while(universities.size() > i) {
    if(universities.get(i).getName() == schoolName || universities.get(i).getNumStudents() == numStudents) {
      uni.add(universities.get(i));
    }
    i++;
   }
   return uni;
  }
  
  
  public static Account getUser(String username, String password) {
   int i = 0;
   while(accounts.size() > i) {
    if(accounts.get(i).getUsername() == username && accounts.get(i).getPassword() == password) {
     return accounts.get(i);
    }
    i++;
   }
   return null;
  }
  
  public static University getUniversity(String name) {
   int i = 0;
   while(universities.size() > i) {
    if(universities.get(i).getName() == name) {
     return universities.get(i);
    }
    i++;
   }
   return null;
  }
  
  public void getSchoolDetails(String schoolName) {
  }

  
  public Account lookupUser(String username) {
   return sam;
  }
  
  public void updateSavedSchoolList(String username) {
  }
  
  public void updateSavedUser(User user) {
	  
  }
  
  public static void addUser(User user) {
	  
  }
  
  public static ArrayList<Account> getAccounts() {
   return accounts;
  }
  
  public static ArrayList<University> getUniversities(){
   return universities;
  }
}
  