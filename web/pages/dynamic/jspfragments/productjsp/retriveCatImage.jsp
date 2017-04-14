<%-- 
    Document   : retriveCatImage
    Created on : Apr 1, 2017, 9:45:41 AM
    Author     : Saad
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
    byte[] img = pc.getSubCategory(imageId).getCat_icon();

    os = response.getOutputStream();
    os.write(img);

    os.flush();
    os.close();

%>
