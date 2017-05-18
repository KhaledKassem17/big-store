/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.software.team.BigStore.DBServlets.QuestionServlets;

import com.software.team.BigStore.Controllers.QuestionController;
import com.software.team.BigStore.model.Answer;
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
public class AnswerServlet extends HttpServlet {

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
        Date answerDate = c.getTime();

        String content = request.getParameter("answer");

        int qid = Integer.parseInt(request.getParameter("question_id"));

        QuestionController qc = new QuestionController();

        Question question =  qc.getQuestion(qid);

        Answer a = new Answer();

        a.setAnswer_content(content);
        a.setDate(answerDate);
        a.setQuestion(question);

        HttpSession session = request.getSession();

        if (session.getAttribute("normal") != null) {
            User u = (User) session.getAttribute("normal");

            a.setAnswerer(u);

            System.out.println("answer ==> "+content +" , "+ answerDate +" , "+ u.getUser_id());

            qc.saveAnswer(a);
            qc.commitChanges();
        }else if (session.getAttribute("company") != null) {
            User u = (User) session.getAttribute("company");

            a.setAnswerer(u);

            System.out.println("answer ==> "+content +" , "+ answerDate +" , "+ u.getUser_id());

            qc.saveAnswer(a);
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
