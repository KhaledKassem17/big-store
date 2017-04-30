/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.software.team.BigStore.DBServlets.ProductServlets;

import com.software.team.BigStore.Controllers.ProductController;
import com.software.team.BigStore.Controllers.UserController;
import com.software.team.BigStore.model.Product;
import com.software.team.BigStore.model.SubCategory;
import com.software.team.BigStore.model.User;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Saad
 */

public class SaveProduct extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        ProductController prc = new ProductController();
        UserController usc = new UserController();

        System.out.println(request.getParameter("product-name"));
        System.out.println(request.getParameter("product-desc"));
        System.out.println(request.getParameter("product-price"));
        System.out.println(request.getParameter("category"));
        System.out.println(request.getParameter("userIdHidden"));
        System.out.println(request.getParameter("expire-date"));

        String name = request.getParameter("product-name");
        String details = request.getParameter("product-desc");
        double price = Double.parseDouble(request.getParameter("product-price"));
        int category_id = Integer.parseInt(request.getParameter("category"));
        int userId = Integer.parseInt(request.getParameter("userIdHidden"));

        String expiry_date = request.getParameter("expire-date");
        Date date = null;

        Product pr = new Product();

        pr.setProduct_name(name);
        pr.setProduct_price(price);
        pr.setPost_date(new Date());

        try {
            date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(expiry_date);
            pr.setExpiry_date(date);

        } catch (ParseException ex) {
            Logger.getLogger(SaveProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

        pr.setProduct_details(details);
        SubCategory category = prc.getSubWithId(category_id);

        pr.setProduct_category(category);

        User usr = usc.getUser(userId);
        pr.setOwner(usr);

        // insert photo to databse
        InputStream inputStream = null; // input stream of the upload file

        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("imgbutton");
        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());

            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }

        byte[] bytes = readFully(inputStream);
        pr.setProduct_image(bytes);

        // sends the statement to the database server
        prc.insertProudct(pr);

        response.sendRedirect("http://localhost:8080/SoftwareProject/pages/dynamic/profile/profile.jsp");

    }

    public static byte[] readFully(InputStream input) throws IOException {
        byte[] buffer = new byte[50000];
        int bytesRead;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        while ((bytesRead = input.read(buffer)) != -1) {
            output.write(buffer, 0, bytesRead);
        }
        return output.toByteArray();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
