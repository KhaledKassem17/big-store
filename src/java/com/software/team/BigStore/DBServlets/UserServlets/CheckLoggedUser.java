package com.software.team.BigStore.DBServlets.UserServlets;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspWriter;
import com.software.team.BigStore.model.Company;
import com.software.team.BigStore.model.NormalUser;

/**
 *
 * @author Saad
 */
public class CheckLoggedUser {

    public CheckLoggedUser(JspWriter out, HttpServletRequest request, HttpServletResponse response) {
        //check if a company session is transfered
        HttpSession session = request.getSession();
        if (request.getSession().getAttribute("company") != null) {
            Company company = (Company) request.getSession().getAttribute("company");

            try {
                out.print("<li><a href=\"#\" style=\"color:#5aed72\"> " + company.getUser_name() + " </a></li>");
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

            //transfer normal company user's data
            session.setAttribute("company", company);

            //check if a normal session is transfered
        } else if (request.getSession().getAttribute("normal") != null) {
            NormalUser normal = (NormalUser) request.getSession().getAttribute("normal");

            try {
                out.print("<li><a href=\"#\" style=\"color:#c7e4ed\"> " + normal.getUser_name() + " </a></li>");
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

            //transfer normal normal user's data
            session.setAttribute("normal", normal);

            //no session transfered
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
        }

    }

}
