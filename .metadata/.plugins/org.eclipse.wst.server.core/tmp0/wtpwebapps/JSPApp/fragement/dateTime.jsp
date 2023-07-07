<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%
	Date date = new Date();
	DateFormat df = new SimpleDateFormat("dd-MMMM-yyy");
%>
<h4>Current Time:</h4>
<%=df.format(date)%>