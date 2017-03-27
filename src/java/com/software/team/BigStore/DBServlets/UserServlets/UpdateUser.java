/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.software.team.BigStore.DBServlets.UserServlets;

import com.software.team.BigStore.Controllers.UserController;
import com.software.team.BigStore.model.Company;
import com.software.team.BigStore.model.NormalUser;
import com.software.team.BigStore.statics.ref;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Saad
 */
public class UpdateUser extends HttpServlet {

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

        String username = request.getParameter("username");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (username.equals("") || password.equals("") || phone.equals("") || email.equals("")) {
            System.out.println("some fields are empty!");
            response.sendRedirect("/SoftwareProject/pages/dynamic/profile/settings.jsp");
        }

        int type;
        if (request.getParameter("type").equalsIgnoreCase("company")) {
            type = 1;
        } else {
            type = 0;
        }

        NormalUser normal;
        Company company;
        UserController controller = new UserController();

        HttpSession session = request.getSession();

        if (type == 0) {
            System.out.println("type ==> " + type);

            String date = request.getParameter("date");
            String gender = request.getParameter("gender");

            if (date.equals("") || gender.equals("")) {
                System.out.println("some fields are empty!");
                response.sendRedirect("/SoftwareProject/pages/dynamic/userlogging/registered.jsp");
            }

            normal = new NormalUser(gender, date, username, password, "0", "0", phone, email, type, new byte[]{});

            normal.setUser_id(ref.userid);

            //update normal user
            controller.updateNormal(normal);

            System.out.println(normal.toString());

            controller.commitChanges();

            //transfer normal user data through session
            session.setAttribute("normal", normal);

            //redirect to home page
            response.sendRedirect("/SoftwareProject/pages/dynamic/home/index.jsp");
        } else if (type == 1) {
            System.out.println("type ==> " + type);

            String website = request.getParameter("companywebsite");
            String address = request.getParameter("address");

            company = new Company(website, address, username, password, "0", "0", phone, email, type, new byte[]{});

            company.setUser_id(ref.userid);

            //update company user
            controller.updateCompany(company);

            System.out.println(company.toString());

            controller.commitChanges();

            //transfer company user data through session
            session.setAttribute("company", company);

            //redirect to home page
            response.sendRedirect("/SoftwareProject/pages/dynamic/home/index.jsp");
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
