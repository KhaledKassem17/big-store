package com.software.team.BigStore.DBServlets.ProductServlets;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;

/**
 *
 * @author Saad
 */
public class productdiv {

    public productdiv(JspWriter out, HttpServletRequest request, HttpServletResponse response) {
//        try {
//            out.print("<div class=\"product_div\">"
//                    + "<form action=\"SaveProduct\" method=\"post\">"
//                    + "<p class=\"con_tit_01\">Add New Product</p><br/>");
//
//            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//            Date date = new Date();
//            out.print("<p value=\"" + dateFormat.format(date) + "\">" + dateFormat.format(date) + "</p>");
//            out.print("<input type=\"hidden\" name=\"product_date\" value=\"" + dateFormat.format(date) + "\"/>");
//            out.print("<br/><input class=\"price\" type=\"text\" name=\"product_name\" placeholder=\"product name\" required=\"\"/><br/><br/>"
//                    + "<textarea rows=\"1\" cols=\"50\" class=\"post_area\" name=\"product_details\" placeholder=\"product details\" required=\"\"></textarea><br/><br/>"
//                    + "<input class=\"price\" type=\"number\" name=\"product_price\" placeholder=\"price\" required=\"\"/> $<br/><br/>"
//                    + "<input class=\"price\" type=\"date\" name=\"expiry_date\"/><br/><br/>");
//
//
//            ResultSet rs = sm.performQuery("SELECT category_name from category");
//
//            out.println("<select name=\"product_category\">");
//            while (rs.next()) {
//                out.println("<option value=\"" + rs.getString(1) + "\">" + rs.getString(1) + "</option>");
//            }
//            out.println("</select>");
//
//            out.println("  OR <input class=\"price\" type=\"text\" name=\"custom_category\" placeholder=\"Add new Category\"/>"
//                    + "<br/><br/>"
//                    + "<input type=\"submit\" value=\"Launch Product\"/>"
//                    + "</form>"
//                    + "</div>");
//        } catch (IOException ex) {
//            Logger.getLogger(productdiv.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(productdiv.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }

}
