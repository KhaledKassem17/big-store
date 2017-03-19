/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.software.team.BigStore.DBServlets.ProductServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.software.team.BigStore.statics.ref;

/**
 *
 * @author Saad
 */
public class SaveProduct extends HttpServlet {

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
//        response.setContentType("text/html;charset=UTF-8");
//
//        StorageManager sm = new StorageManager();
//
//        int price = 0;
//        int product_rate;
//        String product_image;
//
//        String name = request.getParameter("product_name");
//        String details = request.getParameter("product_details");
//        String expiry_date = request.getParameter("expiry_date");
//        String product_date = request.getParameter("product_date");
//        String product_category = request.getParameter("product_category");
//        String custom_category = request.getParameter("custom_category");
//
//        if (!custom_category.equals("")) {
//            String[] fields1 = {"category_name", "category_icon"};
//            ArrayList<String> DataFields1 = new ArrayList();
//
//            DataFields1.add(custom_category);
//            DataFields1.add("0");
//
//            //insert new category
//            sm.insertInto("category", fields1, DataFields1);
//
//            int category_id = 0;
//            ResultSet rs = sm.performQuery("SELECT category_id from category");
//            try {
//                while (rs.next()) {
//                    category_id = rs.getInt(1);
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(SaveProduct.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            price = Integer.parseInt(request.getParameter("product_price"));
//
//            String[] fields = {"product_name", "owner_id", "product_image", "product_details", "product_price", "product_rate", "product_date", "expiry_date", "product_category", "likes", "comments"};
//            ArrayList<String> DataFields = new ArrayList();
//
//            DataFields.add(name);
//            DataFields.add(ref.userid + "");
//            DataFields.add("0");
//            DataFields.add(details);
//            DataFields.add(price + "");
//            DataFields.add("0");
//            DataFields.add(product_date);
//            DataFields.add(expiry_date);
//            DataFields.add(category_id + "");
//            DataFields.add("0");
//            DataFields.add("0");
//
//            //insert new product
//            sm.insertInto("product", fields, DataFields);
//
//            //redirect to home page
//            response.sendRedirect("index.jsp");
//
//        } else {
//            price = Integer.parseInt(request.getParameter("product_price"));
//
//            int category_id = 0;
//            ResultSet rs = sm.performQuery("SELECT category_id from category WHERE category_name = '" + product_category + "'");
//            try {
//                while (rs.next()) {
//                    category_id = rs.getInt(1);
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(SaveProduct.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            String[] fields = {"product_name", "owner_id", "product_image", "product_details", "product_price", "product_rate", "product_date", "expiry_date", "product_category"};
//            ArrayList<String> DataFields = new ArrayList();
//
//            DataFields.add(name);
//            DataFields.add(ref.userid + "");
//            DataFields.add("0");
//            DataFields.add(details);
//            DataFields.add(price + "");
//            DataFields.add("0");
//            DataFields.add(product_date);
//            DataFields.add(expiry_date);
//            DataFields.add(category_id + "");
//
//            //insert new product
//            sm.insertInto("product", fields, DataFields);
//
//            //redirect to home page
//            response.sendRedirect("index.jsp");
//
//        }

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
