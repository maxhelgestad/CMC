<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page language="java" import="cmc.database.*"%>
<%@page language="java" import="cmc.search.*"%>
<%@page language="java" import="cmc.university.*"%>
<%@page language="java" import="java.util.*" %>
<%
String name = request.getParameter("schoolName");
String state = request.getParameter("state");
String location = request.getParameter("location");
String control = request.getParameter("control");
int numStudentsB;

if (request.getParameter("numStudentsB").equals("")){
	numStudentsB = 0;
}
else{
	numStudentsB = Integer.parseInt(request.getParameter("numStudentsB"));
}
int numStudentsT;
if (request.getParameter("numStudentsT").equals("")){
	numStudentsT = Integer.MAX_VALUE;
}
else{
	numStudentsT = Integer.parseInt(request.getParameter("numStudentsT"));
}
float mfRatioB;
if (request.getParameter("mfRatioB").equals("")){
	mfRatioB = 0;
}
else{
	mfRatioB = Float.parseFloat(request.getParameter("mfRatioB"));
}
float mfRatioT;
if (request.getParameter("mfRatioT").equals("")){
	mfRatioT = Float.MAX_VALUE;
}
else{
	mfRatioT = Float.parseFloat(request.getParameter("mfRatioT"));
}
float SATVerbalB;
if (request.getParameter("SATVerbalB").equals("")){
	SATVerbalB = 0;
}
else{
	SATVerbalB = Float.parseFloat(request.getParameter("SATVerbalB"));
}
float SATVerbalT;
if (request.getParameter("SATVerbalT").equals("")){
	SATVerbalT = Float.MAX_VALUE;
}
else{
	SATVerbalT = Float.parseFloat(request.getParameter("SATVerbalT"));
}
float SATMathB;
if (request.getParameter("SATMathB").equals("")){
	SATMathB = 0;
}
else{
	SATMathB = Float.parseFloat(request.getParameter("SATMathB"));
}
float SATMathT;
if (request.getParameter("SATMathT").equals("")){
	SATMathT = Float.MAX_VALUE;
}
else{
	SATMathT = Float.parseFloat(request.getParameter("SATMathT"));
}
float expensesB;
if (request.getParameter("expensesB").equals("")){
	expensesB = 0;
}
else{
	expensesB = Float.parseFloat(request.getParameter("expensesB"));
}
float expensesT;
if (request.getParameter("expensesT").equals("")){
	expensesT = Float.MAX_VALUE;
}
else{
	expensesT = Float.parseFloat(request.getParameter("expensesT"));
}
float financialAidB;
if (request.getParameter("financialAidB").equals("")){
	financialAidB = 0;
}
else{
	financialAidB = Float.parseFloat(request.getParameter("financialAidB"));
}
float financialAidT;
if (request.getParameter("financialAidT").equals("")){
	financialAidT = Float.MAX_VALUE;
}
else{
	financialAidT = Float.parseFloat(request.getParameter("financialAidT"));
}
int numApplicantsB;
if (request.getParameter("numApplicantsB").equals("")){
	numApplicantsB = 0;
}
else{
	numApplicantsB = Integer.parseInt(request.getParameter("numApplicantsB"));
}
int numApplicantsT;
if (request.getParameter("numApplicantsT").equals("")){
	numApplicantsT = Integer.MAX_VALUE;
}
else{
	numApplicantsT = Integer.parseInt(request.getParameter("numApplicantsT"));
}
float percentAdmittedB;
if (request.getParameter("percentAdmittedB").equals("")){
	percentAdmittedB = 0;
}
else{
	percentAdmittedB = Float.parseFloat(request.getParameter("percentAdmittedB"));
}
float percentAdmittedT;
if (request.getParameter("percentAdmittedT").equals("")){
	percentAdmittedT = Float.MAX_VALUE;
}
else{
	percentAdmittedT = Float.parseFloat(request.getParameter("percentAdmittedT"));
}
float percentEnrolledB;
if (request.getParameter("percentEnrolledB").equals("")){
	percentEnrolledB = 0;
}
else{
	percentEnrolledB = Float.parseFloat(request.getParameter("percentEnrolledB"));
}
float percentEnrolledT;
if (request.getParameter("percentEnrolledT").equals("")){
	percentEnrolledT = Float.MAX_VALUE;
}
else{
	percentEnrolledT = Float.parseFloat(request.getParameter("percentEnrolledT"));
}
int academicsB;
if (request.getParameter("academicsB").equals("")){
	academicsB = 0;
}
else{
	academicsB = Integer.parseInt(request.getParameter("academicsB"));
}
int academicsT;
if (request.getParameter("academicsT").equals("")){
	academicsT = Integer.MAX_VALUE;
}
else{
	academicsT = Integer.parseInt(request.getParameter("academicsT"));
}
int socialB;
if (request.getParameter("socialB").equals("")){
	socialB = 0;
}
else{
	socialB = Integer.parseInt(request.getParameter("socialB"));
}
int socialT;
if (request.getParameter("socialT").equals("")){
	socialT = Integer.MAX_VALUE;
}
else{
	socialT = Integer.parseInt(request.getParameter("socialT"));
}
int qualOfLifeB;
if (request.getParameter("qualOfLifeB").equals("")){
	qualOfLifeB = 0;
}
else{
	qualOfLifeB = Integer.parseInt(request.getParameter("qualOfLifeB"));
}
int qualOfLifeT;
if (request.getParameter("qualOfLifeT").equals("")){
	qualOfLifeT = Integer.MAX_VALUE;
}
else{
	qualOfLifeT = Integer.parseInt(request.getParameter("qualOfLifeT"));
}

Criteria criteria = new Criteria(name, state, location, control, numStudentsB, numStudentsT, mfRatioB, mfRatioT, SATVerbalB, SATVerbalT, SATMathB, SATMathT,expensesB, expensesT, financialAidB, financialAidT, numApplicantsB, numApplicantsT, percentAdmittedB, percentAdmittedT, percentEnrolledB, percentEnrolledT, academicsB, academicsT, socialB, socialT, qualOfLifeB, qualOfLifeT);

ArrayList<University> results = SearchController.searchSchool(criteria);
session.setAttribute("searchResults", results);
response.sendRedirect("searchResults.jsp");
%>