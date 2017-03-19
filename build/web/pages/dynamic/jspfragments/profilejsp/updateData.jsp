<%-- 
    Document   : updateData
    Created on : Mar 12, 2017, 10:01:02 PM
    Author     : Saad
--%>

<%@page import="com.software.team.BigStore.DBServlets.ProfileServlets.updateData"%>
<%@page import="com.software.team.BigStore.model.Company"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.software.team.BigStore.model.NormalUser"%>
<%@page import="com.software.team.BigStore.statics.ref"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="udpatedata">

    <%
        updateData ud = new updateData(out, request, response);
    %>
</div>
