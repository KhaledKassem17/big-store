package com.software.team.BigStore.DBServlets.UserServlets;

import com.software.team.BigStore.Controllers.UserController;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.software.team.BigStore.model.*;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Saad
 */
public class saveUser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        HttpSession session = request.getSession();

        session.setMaxInactiveInterval(24*60*60);

        NormalUser normal;
        Company company;
        UserController controller = new UserController();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String confirmedpassword = request.getParameter("confirmedpassword");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");

        if (username.equals("") || password.equals("") || confirmedpassword.equals("") || phone.equals("") || email.equals("")) {
            System.out.println("some fields are empty!");
            response.sendRedirect("/SoftwareProject/pages/dynamic/userlogging/registered.jsp");
        } else if (!password.equals(confirmedpassword)) {
            System.out.println("passwords do not match!");
            response.sendRedirect("/SoftwareProject/pages/dynamic/userlogging/registered.jsp");
        }

        int type;
        if (request.getParameter("type").equalsIgnoreCase("company")) {
            type = 1;
        } else {
            type = 0;
        }

        if (type == 0) {
            System.out.println("type ==> " + type);

            String date = request.getParameter("date");
            String gender = request.getParameter("gender");

            if (date.equals("") || gender.equals("")) {
                System.out.println("some fields are empty!");
                response.sendRedirect("/SoftwareProject/pages/dynamic/userlogging/registered.jsp");
            }

            normal = new NormalUser(gender, date, username, password, "0", "0", phone, email, type, new byte[]{});

            //save normal User
            controller.saveNormal(normal);

            //transfer normal user data through session
            session.setAttribute("normal", normal);

            //redirect to home page
            response.sendRedirect("/SoftwareProject/pages/dynamic/home/index.jsp");

            controller.commitChanges();
        } else if (type == 1) {
            System.out.println("type ==> " + type);

            String website = request.getParameter("companywebsite");
            String address = request.getParameter("address");

            company = new Company(website, address, username, password, "0", "0", phone, email, type, new byte[]{});

            //save company user
            controller.saveCompany(company);

            System.out.println(company.toString());

            //transfer company user data through session
            session.setAttribute("company", company);

            //redirect to home page
            response.sendRedirect("/SoftwareProject/pages/dynamic/home/index.jsp");

            controller.commitChanges();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
