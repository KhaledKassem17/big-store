


<%@page import="com.software.team.BigStore.model.Product"%>
<%@page import="com.software.team.BigStore.Controllers.ProductController"%>
<%@page import="com.software.team.BigStore.model.Comment"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.software.team.BigStore.model.User"%>
<%@page import="com.software.team.BigStore.Controllers.UserController"%>
<%@page import="com.software.team.BigStore.model.Company"%>
<%@page import="com.software.team.BigStore.model.NormalUser"%>

<%!  Integer pro_id;
    int user_id;
%>

<%
    HttpSession data = request.getSession();

    try {
        NormalUser user = (NormalUser) data.getAttribute("normal");
        user_id = user.getUser_id();
    } catch (Exception e) {
        Company user = (Company) data.getAttribute("company");
        user_id = user.getUser_id();
    }

    pro_id = Integer.parseInt(request.getParameter("pro_id"));

    UserController con = new UserController();
    ArrayList<Comment> comments = con.getCommentsforProduct(pro_id);
    if (comments.size() == 0) {
        out.print("<br>");
        out.print("No comments yet");
        return;
    }

    for (int i = 0; i < comments.size(); i++) {
        Comment com = comments.get(i);
        User user = con.getUser(comments.get(i).getCommentator().getUser_id());
        System.out.println(user.getUser_name() + " " + com.getComment_content() + " " + com.getComment_date().toString());

%>
<br><div style="width:50%">
    <div style="float: left;width:30%;">
        <%if(user.getUser_id() != user_id){%>
            <a href="/SoftwareProject/pages/dynamic/profile/profile.jsp?visited_user=<%=user.getUser_id()%>"><img style="display: block;margin-left: auto;margin-right: 5%" height="60" width="60" src="../jspfragments/retrive_image.jsp?userId=<%=user.getUser_id()%>"  alt="<%=user.getUser_name()%> photo"/></a>
        <%}else{
            %><a href="/SoftwareProject/pages/dynamic/profile/profile.jsp"><img style="display: block;margin-left: auto;margin-right: 5%" height="60" width="60" src="../jspfragments/retrive_image.jsp?userId=<%=user.getUser_id()%>"  alt="<%=user.getUser_name()%> photo"/></a><%
        }
        %>
    </div>
    <div style="float: right;width:70%;margin-left: 0%;">
        <span style="font-size:15px; font-weight:bold;"><a href="/SoftwareProject/pages/dynamic/profile/profile.jsp?visited_user=<%=user.getUser_id()%>"> <%=user.getUser_name()%></a> : </span>
        <span style=" font-size:14px"><%=com.getComment_content()%></span>
        <p style=" font-size:11px"> <%=com.getComment_date().toString()%></p>
    </div>
</div><br><br>
<hr><%
    }
%>
