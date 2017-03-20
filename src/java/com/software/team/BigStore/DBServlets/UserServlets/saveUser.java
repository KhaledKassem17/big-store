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
import com.software.team.BigStore.statics.ref;
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
            ref.userid = controller.saveNormal(normal);

            System.out.println(normal.toString());

            System.out.println("user_id ==> " + ref.userid);

            ref.username = username;
            ref.usertype = type;

            controller.commitChanges();

            normal.setUser_id(ref.userid);

            //transfer normal user data through session
            session.setAttribute("normal", normal);

            //redirect to home page
            response.sendRedirect("/SoftwareProject/pages/dynamic/home/index.jsp");
        } else if (type == 1) {
            System.out.println("type ==> " + type);

            String website = request.getParameter("companywebsite");
            String address = request.getParameter("address");

            company = new Company(website, address, username, password, "0", "0", phone, email, type, new byte[]{});

            //save company user
            ref.userid = controller.saveCompany(company);

            System.out.println(company.toString());

            System.out.println("user_id ==> " + ref.userid);

            ref.username = username;
            ref.usertype = type;

            controller.commitChanges();

            company.setUser_id(ref.userid);

            //transfer company user data through session
            session.setAttribute("company", company);

            //redirect to home page
            response.sendRedirect("/SoftwareProject/pages/dynamic/home/index.jsp");
        }

//
//        StorageManager sm = new StorageManager();
//
//        NormalUser normal;
//        Company company;
//
//        String[] userfields = {"User_name", "User_password", "User_type", "Credit_card", "User_location", "Profile_image", "User_phone", "User_interests"};
//        ArrayList<String> userdata = new ArrayList();
//
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String confirmedpassword = request.getParameter("confirmedpassword");
//        String phone = request.getParameter("phone");
//        String email = request.getParameter("email");
//
//        if (username.equals("") || password.equals("") || confirmedpassword.equals("") || phone.equals("")) {
//            System.out.println("some fields are empty!");
//            response.sendRedirect("registered.jsp");
//        } else if (!password.equals(confirmedpassword)) {
//            System.out.println("passwords do not match!");
//            response.sendRedirect("registered.jsp");
//        }
//
//        int type = 0;
//        if(request.getParameter("type").equalsIgnoreCase("company")){
//            type = 1;
//        }else {
//            type = 0;
//        }
//
//        userdata.add(username);     //add username
//        userdata.add(password);     //add password
//        userdata.add(type+"");      //add type
//        userdata.add("0");          //add credit card
//        userdata.add("0");          //add location
//        userdata.add("0");          //add image
//        userdata.add(phone);        //add phone
//        userdata.add("0");          //add interests
//
//        sm.insertInto("user", userfields, userdata);
//
//        int uid = sm.getLastIntValue("user","user_id");
//
//        ref.userid = uid;
//        ref.username = username;
//        ref.usertype = type;
//
//        if (type == 0) {
//            String date = request.getParameter("date");
//            String gender = request.getParameter("gender");
//
//            if (date.equals("") || gender.equals("")) {
//                System.out.println("some fields are empty!");
//                response.sendRedirect("../registered.jsp");
//            }
//
//            String[] normalfields = {"normal_id", "normal_gender", "normal_email", "birth_date", "following"};
//            ArrayList<String> normaldata = new ArrayList<String>();
//
//            normaldata.add(uid+"");        //add user_id
//            normaldata.add(gender);     //add gender
//            normaldata.add(email);      //add email
//            normaldata.add(date);       //add date
//            normaldata.add("0");        //add following
//
//            //inserting data into database
//            sm.insertInto("normal", normalfields, normaldata);
//
//            //transfering data through sessions
//            normal = new NormalUser(gender, date, username, password, "0", "0", phone, email, type, new byte[]{} );
//
//            session.setAttribute("normal", normal);
//
//            //redirect to home page
//            response.sendRedirect("index.jsp");
//        } else if (type == 1) {
//            String website = request.getParameter("companywebsite");
//            String address = request.getParameter("address");
//
//            String[] companyfields = {"company_id", "company_website", "followers"};
//            ArrayList<String> companydata = new ArrayList<String>();
//
//            companydata.add(uid+"");        //add user_id
//            companydata.add(website);     //add website
//            companydata.add("0");        //add followers
//
//            //inserting data into database
//            sm.insertInto("company", companyfields, companydata);
//
//            //transfering data through sessions
//            company = new Company(website, address, username, password, "0", "0", phone, email, 1 , new byte[]{});
//
//            session.setAttribute("company", company);
//
//            //redirect to home page
//            response.sendRedirect("index.jsp");
//        }
//
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
