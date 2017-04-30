package com.software.team.BigStore.DBServlets.UserServlets;

import com.software.team.BigStore.Controllers.UserController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;
import com.software.team.BigStore.model.Company;
import com.software.team.BigStore.model.NormalUser;
import com.software.team.BigStore.model.User;

/**
 *
 * @author Saad
 */
public class CheckLoggedUser {

//    public Integer uid;

    public CheckLoggedUser(JspWriter out, HttpServletRequest request, HttpServletResponse response) {
        //check if a company session is transfered
        HttpSession session = request.getSession();
//        session.setMaxInactiveInterval(24*60*60);

        Company company;
        NormalUser normal;
        if (session.getAttribute("normal") != null) {
            normal = (NormalUser) session.getAttribute("normal");

            try {
                out.print("<li><a href=\"/SoftwareProject/pages/dynamic/activities/chat/chat.jsp\" style=\"color:#c7e4ed\"> Messages </a></li>");
                out.print("<li><a href=\"/SoftwareProject/pages/dynamic/profile/profile.jsp\"><img height=\"30\" width=\"30\" src=\"../jspfragments/retrive_image.jsp?userId="+normal.getUser_id()+"\"  alt=\""+normal.getUser_name()+" photo\"/></a> <a href=\"/SoftwareProject/pages/dynamic/profile/profile.jsp\" style=\"color:#c7e4ed\"> " + normal.getUser_name() + " </a></li>");
                out.println("<li class=\"dropdown menu__item menu__dropDown\" >"
                        + "    <button class=\"btn btn-default dropdown-toggle\" type=\"button\" id=\"dropdownMenu1\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\">"
                        + "        <i class=\"fa fa-cog fa-spin\"></i>"
                        + "    </button>"
                        + "    <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenu1\">"
                        + "        <li><a href=\"/SoftwareProject/pages/dynamic/activities/questions/faq.jsp\" style=\"color:black\" >Ask Question</a></li>"
                        //                        + "        <li role=\"separator\" class=\"divider\"></li>"
                        + "        <li><a href=\"/SoftwareProject/pages/dynamic/products/cart/checkout.jsp\" style=\"color:black\">My Chart</a></li>"
                        + "        <li><a href=\"/SoftwareProject/pages/dynamic/payment/index.jsp\" style=\"color:black\">Pay Now</a></li>"
                        + "        <li><a href=\"/SoftwareProject/pages/static/contact.jsp\" style=\"color:black\">Help</a></li>"
                        //                        + "        <li role=\"separator\" class=\"divider\"></li>"
                        + "        <li><a style=\"color:black\" href=\"/SoftwareProject/pages/dynamic/profile/settings.jsp\">Setting</a></li>"
                        + "        <li><a style=\"color:black\" href=\"http://localhost:8080/SoftwareProject/Logout\">Logout</a></li>"
                        + "    </ul>"
                        + "</li>");

            } catch (IOException ex) {
                Logger.getLogger(CheckLoggedUser.class.getName()).log(Level.SEVERE, null, ex);
            }

            session.setAttribute("normal", normal);
//            session.setAttribute("user_id", normal.getUser_id());

//            uid = normal.getUser_id();

        } else if (session.getAttribute("company") != null) {
            company = (Company) session.getAttribute("company");

            try {
                out.print("<li><a href=\"/SoftwareProject/pages/dynamic/activities/chat/chat.jsp\" style=\"color:#5aed72\"> Messages </a></li>");
                out.print("<li><a href=\"/SoftwareProject/pages/dynamic/profile/profile.jsp\"><img height=\"30\" width=\"30\" src=\"../jspfragments/retrive_image.jsp?userId="+company.getUser_id()+"\"  alt=\""+company.getUser_name()+" photo\"/></a> <a href=\"/SoftwareProject/pages/dynamic/profile/profile.jsp\" style=\"color:#5aed72\"> " + company.getUser_name() + " </a></li>");
                out.println("<li class=\"dropdown menu__item menu__dropDown\" >"
                        + "    <button class=\"btn btn-default dropdown-toggle\" type=\"button\" id=\"dropdownMenu1\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\">"
                        + "        <i class=\"fa fa-cog fa-spin\"></i>"
                        + "    </button>"
                        + "    <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenu1\">"
                        + "        <li><a href=\"/SoftwareProject/pages/dynamic/activities/questions/faq.jsp\" style=\"color:black\">Ask Question</a></li>"
                        //                        + "        <li role=\"separator\" class=\"divider\"></li>"
                        + "        <li><a href=\"/SoftwareProject/pages/dynamic/products/cart/checkout.jsp\" style=\"color:black\">My Chart</a></li>"
                        + "        <li><a href=\"/SoftwareProject/pages/dynamic/payment/index.jsp\" style=\"color:black\">Pay Now</a></li>"
                        + "        <li><a href=\"/SoftwareProject/pages/static/contact.jsp\" style=\"color:black\">Help</a></li>"
                        //                        + "        <li role=\"separator\" class=\"divider\"></li>"
                        + "        <li><a style=\"color:black\" href=\"/SoftwareProject/pages/dynamic/profile/settings.jsp\">Setting</a></li>"
                        + "        <li><a style=\"color:black\" href=\"http://localhost:8080/SoftwareProject/Logout\">Logout</a></li>"
                        + "    </ul>"
                        + "</li>");

            } catch (IOException ex) {
                Logger.getLogger(CheckLoggedUser.class.getName()).log(Level.SEVERE, null, ex);
            }

            session.setAttribute("company", company);
//            session.setAttribute("user_id", company.getUser_id());

//            uid = company.getUser_id();

        } else {
            try {
                out.println("<li class=\"dropdown menu__item menu__dropDown\" >"
                        + "    <button class=\"btn btn-default dropdown-toggle\" type=\"button\" id=\"dropdownMenu1\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\">"
                        + "        <i class=\"fa fa-cog fa-spin\"></i>"
                        + "    </button>"
                        + "    <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenu1\">"
                        + "        <li><a href=\"/SoftwareProject/pages/dynamic/activities/questions/faq.jsp\" style=\"color:black\" >Ask Question</a></li>"
                        + "        <li><a href=\"/SoftwareProject/pages/dynamic/userlogging/login.jsp\" style=\"color:black\" >Login</a></li>"
                        + "        <li><a href=\"/SoftwareProject/pages/dynamic/userlogging/registered.jsp\" style=\"color:black\" >Register</a></li>"
                        + "        <li><a href=\"/SoftwareProject/pages/static/contact.jsp\" style=\"color:black\" >Help</a></li>"
                        + "    </ul>"
                        + "</li>");
            } catch (IOException ex) {
                Logger.getLogger(CheckLoggedUser.class.getName()).log(Level.SEVERE, null, ex);
            }
//            session.setAttribute("user_id", -1);
//            uid = -1;

        }
    }
}
