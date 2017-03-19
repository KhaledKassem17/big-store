<%-- 
    Document   : retrive_image
    Created on : Mar 13, 2017, 12:41:49 AM
    Author     : tito
--%>

<%@page import="java.io.OutputStream"%>
<%@page import="com.software.team.BigStore.controller.ProuductController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    
    int imageId = Integer.parseInt(request.getParameter("imgId"));
    
    response.setContentType("image/jpeg");
    ProuductController pc = new ProuductController();
    
    OutputStream os;
    byte[] img = pc.getProudct(imageId).getProduct_image();
    
    os = response.getOutputStream();
    os.write(img);
    
    os.flush();
    os.close();
    

%>
