<%-- 
    Document   : retrieveUserImage
    Created on : Apr 14, 2017, 10:41:59 PM
    Author     : Saad
--%>

<%@page import="java.io.OutputStream"%>
<%@page import="com.software.team.BigStore.Controllers.UserController"%>
<%

    System.out.println(request.getParameter("imgId"));

    int imageId = Integer.parseInt(request.getParameter("imgId"));

    response.setContentType("image/jpeg");
    UserController uc = new UserController();

    OutputStream os;
    byte[] img = uc.getUser(imageId).getProfile_image();

    os = response.getOutputStream();
    os.write(img);

    os.flush();
    os.close();

%>

