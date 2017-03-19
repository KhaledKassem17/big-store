<%-- 
    Document   : productdiv
    Created on : Mar 12, 2017, 4:40:54 PM
    Author     : Saad
--%>

<%@page import="com.software.team.BigStore.DBServlets.ProductServlets.productdiv"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.software.team.BigStore.statics.ref"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    productdiv pd = new productdiv(out, request, response);
%>