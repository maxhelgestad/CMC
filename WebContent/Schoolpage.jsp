<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
    <%@page language="java" import="cmc.database.*"%>
<%@page language="java" import="cmc.search.*"%>
<%@page language="java" import="cmc.university.*"%>
<%@page language="java" import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>School Page</title>
</head>
<body>
<a href="savedSchools.jsp">Back to Saved Schools</a>
<br>
<%String name = request.getParameter("schoolName");
University un = DatabaseController.getUniversity(name);%>



<table width=80% border=2>
<tbody>

<tr>
<td style="vertical-align: top;">School Name</td>
<td style="vertical-align: top;"><input name="schoolName" value = <%=un.getName()%> readonly> </td>
</tr>

<tr>
<td style="vertical-align: top;">State</td>
<td style="vertical-align: top;"><input name="state" value = <%=un.getState()%> readonly> </td>
</tr>

<tr>
<td style="vertical-align: top;">Location</td>
<td style="vertical-align: top;"><input name="location" value = <%=un.getLocation()%> readonly> (SUBURBAN, URBAN, SMALL-CITY)</td>
</tr>

<tr>
<td style="vertical-align: top;">Control</td>
<td style="vertical-align: top;"><input name="control" value = <%=un.getControl()%> readonly>(PRIVATE, STATE, or CITY)</td>
</tr>

<tr>
<td style="vertical-align: top;">Number of Students</td>
<td style="vertical-align: top;"><input name="numStudentsB" value = <%=un.getNumStudents()%> readonly> </td>
</tr>

<tr>
<td style="vertical-align: top;">% Female</td>
<td style="vertical-align: top;"><input name="mfRatioB" value = <%=un.getMfRatio()%> readonly> </td>
</tr>

<tr>
<td style="vertical-align: top;">SAT Verbal</td>
<td style="vertical-align: top;"><input name="SATVerbalB" value = <%=un.getSatVerbal()%> readonly> </td>
</tr>

<tr>
<td style="vertical-align: top;">SAT Math</td>
<td style="vertical-align: top;"><input name="SATMathB" value = <%=un.getSatMath()%> readonly> </td>
</tr>

<tr>
<td style="vertical-align: top;">Expenses</td>
<td style="vertical-align: top;"><input name="expensesB" value = <%=un.getExpenses()%> readonly> </td>
</tr>

<tr>
<td style="vertical-align: top;">% Financial Aid</td>
<td style="vertical-align: top;"><input name="financialAidB" value = <%=un.getFinancialAid()%> readonly> </td>
</tr>

<tr>
<td style="vertical-align: top;">Number of Applicants</td>
<td style="vertical-align: top;"><input name="numApplicantsB" value = <%=un.getNumApplicants()%> readonly>  </td>
</tr>

<tr>
<td style="vertical-align: top;">% Admitted</td>
<td style="vertical-align: top;"><input name="percentAdmittedB" value = <%=un.getAdmitionRate()%> readonly>  </td>
</tr>

<tr>
<td style="vertical-align: top;">% Enrolled</td>
<td style="vertical-align: top;"><input name="percentEnrolledB" value = <%=un.getPercentEnrolled()%> readonly> </td>
</tr>

<tr>
<td style="vertical-align: top;">Academics Scale (1-5)</td>
<td style="vertical-align: top;"><input name="academicsB" value = <%=un.getAcademics()%> readonly></td>
</tr>

<tr>
<td style="vertical-align: top;">Social Scale (1-5)</td>
<td style="vertical-align: top;"><input name="socialB" value = <%=un.getSocial()%> readonly> </td>
</tr>

<tr>
<td style="vertical-align: top;">Quality of Life Scale (1-5)</td>
<td style="vertical-align: top;"><input name="qualOfLifeB" value = <%=un.getQualOfLife()%> readonly></td>
</tr>


</tbody>
</table>
</body>
</html>