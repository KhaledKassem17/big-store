<%-- 
    Document   : retrive_image
    Created on : Mar 13, 2017, 12:41:49 AM
    Author     : tito
--%>

<%@page import="com.software.team.BigStore.Controllers.UserController"%>
<%@page import="com.software.team.BigStore.Controllers.ProductController"%>
<%@page import="java.io.OutputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    // imgId if image for prouduct id
    // userId if image for user 
    if (request.getParameter("userId") != null) {
        
         int usrId = Integer.parseInt(request.getParameter("userId"));

        response.setContentType("image/jpeg");
        UserController uc = new UserController();

        OutputStream os;
        byte[] img = uc.getUser(usrId).getProfile_image();

        os = response.getOutputStream();
        os.write(img);

        os.flush();
        os.close();

    } else if (request.getParameter("imgId") != null) {
        int imageId = Integer.parseInt(request.getParameter("imgId"));

        response.setContentType("image/jpeg");
        ProductController pc = new ProductController();

        OutputStream os;
        byte[] img = pc.getProudct(imageId).getProduct_image();

        os = response.getOutputStream();
        os.write(img);

        os.flush();
        os.close();

    } else if (request.getParameter("catId") != null) {
        int imageId = Integer.parseInt(request.getParameter("catId"));

        response.setContentType("image/jpeg");
        ProductController pc = new ProductController();

        OutputStream os;
        byte[] img = pc.getSubWithId(imageId).getCat_icon();

        os = response.getOutputStream();
        os.write(img);

        os.flush();
        os.close();

    }

%>
