package cmc.search;

import java.util.List;

public class Criteria {

 
 
 private String name;
 private String mfRatio;
 private int numStudents;
 private String control;
 private String location;
 private int satVerbal;
 private int satMath;
 private float expenses;
 private float financialAid;
 private float admitionRate;
 private float percentEnrolled;
 private int academics;
 private int social;
 private int qualOfLife;
 private List<String> emphasis;

 /**
  * @param location 
  * 
  */
 public Criteria(String name, String mfRatio, int numStudents, String control, int satVerbal,
   int satMath, float expenses, float financialAid, float admitionRate, float percentEnrolled, int academics, int social, int qualOfLife,
   List<String> emphasis, String location){
  this.name = name;
  this.mfRatio = mfRatio;
  this.numStudents = numStudents;
  this.control = control;
  this.location = location;
  this.satVerbal = satVerbal;
  this.satMath = satMath;
  this.expenses = expenses;
  this.financialAid = financialAid;
  this.admitionRate = admitionRate;
  this.percentEnrolled = percentEnrolled;
  this.academics = academics;
  this.social = social;
  this.qualOfLife = qualOfLife;
  this.emphasis = emphasis;
 }

}
