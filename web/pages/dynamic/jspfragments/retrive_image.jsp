<%-- 
    Document   : retrive_image
    Created on : Mar 13, 2017, 12:41:49 AM
    Author     : tito
--%>

<%@page import="com.software.team.BigStore.Controllers.ProductController"%>
<%@page import="java.io.OutputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    System.out.println(request.getParameter("imgId"));

    int imageId = Integer.parseInt(request.getParameter("imgId"));

    response.setContentType("image/jpeg");
    ProductController pc = new ProductController();

    OutputStream os;
    byte[] img = pc.getProudct(imageId).getProduct_image();

    os = response.getOutputStream();
    os.write(img);

    os.flush();
    os.close();

%>
