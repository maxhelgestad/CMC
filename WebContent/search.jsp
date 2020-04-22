<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search School</title>
</head>
<body>
<a href="Menu.jsp">back to menu</a>
<br>
<br>
Search School:<br>
<br>
<form method="post" action="searchAction.jsp" name="Search"><br>
<table style="text-align: left; width: 750px; height: 228px;"
border="1" cellpadding="2" cellspacing="2">
<tbody>

<tr>
<td style="vertical-align: top;">School Name</td>
<td style="vertical-align: top;">contains<input name="schoolName"> </td>
</tr>

<tr>
<td style="vertical-align: top;">State</td>
<td style="vertical-align: top;">contains<input name="state"> </td>
</tr>

<tr>
<td style="vertical-align: top;">Location</td>
<td style="vertical-align: top;"><input name="location"> (SUBURBAN, URBAN, SMALL-CITY)</td>
</tr>

<tr>
<td style="vertical-align: top;">Control</td>
<td style="vertical-align: top;"><input name="control">(PRIVATE, STATE, or CITY)</td>
</tr>

<tr>
<td style="vertical-align: top;">Number of Students</td>
<td style="vertical-align: top;">between<input name="numStudentsB"> and <input name="numStudentsT"> </td>
</tr>

<tr>
<td style="vertical-align: top;">Percent Female</td>
<td style="vertical-align: top;">between<input name="mfRatioB">  and  <input name="mfRatioT"> </td>
</tr>

<tr>
<td style="vertical-align: top;">SAT Verbal</td>
<td style="vertical-align: top;">between<input name="SATVerbalB">  and  <input name="SATVerbalT"></td>
</tr>

<tr>
<td style="vertical-align: top;">SAT Math</td>
<td style="vertical-align: top;">between<input name="SATMathB">  and  <input name="SATMathT"></td>
</tr>

<tr>
<td style="vertical-align: top;">Expenses</td>
<td style="vertical-align: top;">between<input name="expensesB">  and  <input name="expensesT"></td>
</tr>

<tr>
<td style="vertical-align: top;">% Financial Aid</td>
<td style="vertical-align: top;">between<input name="financialAidB">  and  <input name="financialAidT"></td>
</tr>

<tr>
<td style="vertical-align: top;">Number of Applicants</td>
<td style="vertical-align: top;">between<input name="numApplicantsB">  and  <input name="numApplicantsT"></td>
</tr>

<tr>
<td style="vertical-align: top;">% Admitted</td>
<td style="vertical-align: top;">between<input name="percentAdmittedB">  and  <input name="percentAdmittedT"></td>
</tr>

<tr>
<td style="vertical-align: top;">% Enrolled</td>
<td style="vertical-align: top;">between<input name="percentEnrolledB">  and  <input name="percentEnrolledT"></td>
</tr>

<tr>
<td style="vertical-align: top;">Academics Scale (1 to 5)</td>
<td style="vertical-align: top;">between<input name="academicsB">  and  <input name="academicsT"></td>
</tr>

<tr>
<td style="vertical-align: top;">Social Scale (1 to 5)</td>
<td style="vertical-align: top;">between<input name="socialB">  and  <input name="socialT"></td>
</tr>

<tr>
<td style="vertical-align: top;">Quality of Life Scale (1 to 5)</td>
<td style="vertical-align: top;">between<input name="qualOfLifeB">  and  <input name="qualOfLifeT"></td>
</tr>

<tr>
<td style="vertical-align: top;"><input value="Submit"
name="Submit" type="submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td style="vertical-align: top;"><input value="Reset"
name="Reset" type="reset"></td>
</tr>
</tbody>
</table>
<br>
</form>
<br>
</body>
</html>