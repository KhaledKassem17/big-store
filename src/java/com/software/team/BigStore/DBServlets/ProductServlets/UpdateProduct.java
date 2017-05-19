package com.software.team.BigStore.DBServlets.ProductServlets;

import com.software.team.BigStore.Controllers.ProductController;
import com.software.team.BigStore.Controllers.UserController;
import com.software.team.BigStore.model.Product;
import com.software.team.BigStore.model.SubCategory;
import com.software.team.BigStore.model.User;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author tito
 */
@MultipartConfig
public class UpdateProduct extends HttpServlet {

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

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        System.out.println("product-name ==> "+request.getParameter("product-name"));
        System.out.println("product-desc ==> "+request.getParameter("product-desc"));
        System.out.println("product-price ==> "+request.getParameter("product-price"));
        System.out.println("product-category ==> "+request.getParameter("category"));
        System.out.println("product-userId ==> "+request.getParameter("userIdHidden"));
        System.out.println("product-date ==> "+request.getParameter("expire-date"));

        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("imgbutton");

        if(filePart == null){
            System.out.println("image not recieved!");
        }else{
            System.out.println("image recieved!");
        }

        String name = request.getParameter("product-name");
        String details = request.getParameter("product-desc");
        double price = Double.parseDouble(request.getParameter("product-price"));
        int category_id = Integer.parseInt(request.getParameter("category"));
        int userId = Integer.parseInt(request.getParameter("userIdHidden"));

        String expiry_date = request.getParameter("expire-date");

        out.print(name);

        String editid = request.getParameter("edit_id");
//        if ((!editid.matches("\\d*")) || (editid.equals("0"))) {
//            return;
//        //        if ((!editid.matches("\\d*")) || (editid.equals("0"))) {
//}
        out.println("hhhhhhhhhh : " + editid);
        int prdct_id = Integer.parseInt(editid);

        ProductController prc = new ProductController();
        UserController usc = new UserController();
        out.print(expiry_date);
        Date date = null;

        Product pr = new Product();

        pr.setProduct_name(name);
        pr.setProduct_price(price);
        pr.setPost_date(new Date());

        try {
            date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").parse(expiry_date);
            pr.setExpiry_date(date);

        } catch (ParseException ex) {
            out.print(ex.getMessage());
        }

        pr.setProduct_details(details);
        SubCategory category = prc.getSubWithId(category_id);

        pr.setProduct_category(category);

        User usr = usc.getUser(userId);
        pr.setOwner(usr);

        // insert photo to databse
        InputStream inputStream = null; // input stream of the upload file

        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());

            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();

            byte[] bytes = readFully(inputStream);
            pr.setProduct_image(bytes);
        } 
        
//        if(filePart.getSubmittedFileName().equals("")){
//         pr.setProduct_image(null);
//        }

        out.print(pr.toString());

       //  sends the statement to the database server
        prc.updateProduct(prdct_id, pr);
        response.sendRedirect("http://localhost:8080/SoftwareProject/pages/dynamic/profile/profile.jsp");

    }

}