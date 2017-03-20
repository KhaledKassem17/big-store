package com.software.team.BigStore.DBServlets.ProfileServlets;

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
public class profiledatadiv {

    public profiledatadiv(JspWriter out, HttpServletRequest request, HttpServletResponse response) {

//        HttpSession session = request.getSession();
//
//        //check if a company session is transfered
//        if (request.getSession().getAttribute("company") != null) {
//            Company company = (Company) request.getSession().getAttribute("company");
//
//            try {
//                out.println("<div class=\"con_image\"><img src=\"" + company.getProfile_image() + "\" alt=\"profile image\" class=\"image_wrapper image_fl\" /></div><br/>"
//                        + "<div class=\"con_tit_01\">" + company.getUser_name() + "</div><br/>");
//            } catch (IOException ex) {
//                Logger.getLogger(profiledatadiv.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            //transfer normal company user's data
//            session.setAttribute("company", company);
//
//            //check if a normal session is transfered
//        } else if (request.getSession().getAttribute("normal") != null) {
//            Normal normal = (Normal) request.getSession().getAttribute("normal");
//
//            try {
//                out.println("<div class=\"con_image\"><img src=\"" + normal.getProfile_image() + "\" alt=\"profile image\" class=\"image_wrapper image_fl\" /></div><br/>"
//                        + "<div class=\"con_tit_01\">" + normal.getUser_name() + "</div><br/>");
//            } catch (IOException ex) {
//                Logger.getLogger(profiledatadiv.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            //transfer normal normal user's data
//            session.setAttribute("normal", normal);
//
//            //no session transfered
//        } else {
//            try {
//                response.sendRedirect("login.html");
//            } catch (IOException ex) {
//                Logger.getLogger(profiledatadiv.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }

    }

}
