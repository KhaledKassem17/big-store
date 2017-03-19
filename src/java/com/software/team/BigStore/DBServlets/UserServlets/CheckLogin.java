package com.software.team.BigStore.DBServlets.UserServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.software.team.BigStore.model.Company;
import com.software.team.BigStore.model.NormalUser;
import com.software.team.BigStore.model.User;
import com.software.team.BigStore.statics.ref;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Saad
 */
public class CheckLogin extends HttpServlet {

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
        PrintWriter out = response.getWriter();

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        HttpSession session = request.getSession();

        boolean submitted = false;

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session hibsession = sessionFactory.getCurrentSession();
        hibsession.beginTransaction();

        //search for that user
        SQLQuery query = hibsession.createSQLQuery("SELECT user_id FROM `user` WHERE `user_email` = '"+email+"' AND `user_password` = '"+password+"'");
        List<Integer> listuserid = query.list();

        if (listuserid.size() <= 0){
            response.sendRedirect("/SoftwareProject/pages/dynamic/userlogging/login.jsp");
        }

        ref.userid = listuserid.get(0);

        User user = (User) hibsession.get(User.class ,ref.userid);

        ref.username = user.getUser_name();
        ref.usertype = user.getUserType();

        if(ref.usertype == 1){
            //user is a company

            Company company = (Company) hibsession.get(Company.class ,ref.userid);

            hibsession.getTransaction().commit();

            //transfer company user data through session
            session.setAttribute("company", company);

            //redirect to home page
            response.sendRedirect("/SoftwareProject/pages/dynamic/home/index.jsp");

        }else {
            //user is normal
            NormalUser normal = (NormalUser) hibsession.get(NormalUser.class ,ref.userid);

            hibsession.getTransaction().commit();

            //transfer normal user data through session
            session.setAttribute("normal", normal);

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
