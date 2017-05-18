/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.software.team.BigStore.DBServlets.QuestionServlets;

import com.software.team.BigStore.Controllers.QuestionController;
import com.software.team.BigStore.model.Question;
import com.software.team.BigStore.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Saad
 */
public class QuestionServlet extends HttpServlet {

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

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date currentdate = new Date();

        // convert date to calendar
        Calendar c = Calendar.getInstance();
        c.setTime(currentdate);

        // convert calendar to date
        Date questionDate = c.getTime();

        String content = request.getParameter("question");

        Question q = new Question();
        q.setQuestion_content(content);
        q.setQuestion_date(questionDate);

        HttpSession session = request.getSession();

        if (session.getAttribute("normal") != null) {
            User u = (User) session.getAttribute("normal");

            q.setOwner(u);

            System.out.println("question ==> "+content +" , "+ questionDate +" , "+ u.getUser_id());

            QuestionController qc = new QuestionController();
            qc.saveQuestion(q);
            qc.commitChanges();
        }else if (session.getAttribute("company") != null) {
            User u = (User) session.getAttribute("company");

            q.setOwner(u);

            System.out.println("question ==> "+content +" , "+ questionDate +" , "+ u.getUser_id());

            QuestionController qc = new QuestionController();
            qc.saveQuestion(q);
            qc.commitChanges();
        }else{
            System.out.println("user is null");
        }

        response.sendRedirect("/SoftwareProject/pages/dynamic/activities/questions/faq.jsp");

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
