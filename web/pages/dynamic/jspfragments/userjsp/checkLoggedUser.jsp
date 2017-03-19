<%-- 
    Document   : checkLoggedUser
    Created on : Mar 12, 2017, 4:46:16 PM
    Author     : Saad
--%>

<%@page import="com.software.team.BigStore.DBServlets.UserServlets.CheckLoggedUser"%>
<%@page import="com.software.team.BigStore.model.NormalUser"%>
<%@page import="com.software.team.BigStore.model.Company"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    CheckLoggedUser clu = new CheckLoggedUser(out, request, response);

%>