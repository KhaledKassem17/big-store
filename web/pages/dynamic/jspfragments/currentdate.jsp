<%-- 
    Document   : currentdate
    Created on : Mar 12, 2017, 4:44:06 PM
    Author     : Saad
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    out.print("<p value=\"" + dateFormat.format(date) + "\">" + dateFormat.format(date) + "</p>");
    out.print("<input type=\"hidden\" name=\"product_date\" value=\"" + dateFormat.format(date) + "\"/>");

%>