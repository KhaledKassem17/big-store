<%-- 
    Document   : indexloadingproducts
    Created on : Mar 12, 2017, 4:51:48 PM
    Author     : Saad
--%>

<%@page import="com.software.team.BigStore.DBServlets.ProductServlets.indexLoadingProducts"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.software.team.BigStore.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    indexLoadingProducts ilp = new indexLoadingProducts(out, request, response);
%>