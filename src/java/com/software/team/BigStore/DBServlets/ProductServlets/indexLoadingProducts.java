package com.software.team.BigStore.DBServlets.ProductServlets;

import com.software.team.BigStore.Controllers.ProductController;
import com.software.team.BigStore.Controllers.UserController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;
import com.software.team.BigStore.model.Product;
import com.software.team.BigStore.model.User;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Saad
 */
public class indexLoadingProducts {

    public indexLoadingProducts(JspWriter out, HttpServletRequest request, HttpServletResponse response) {

        ArrayList<Product> products = new ArrayList<Product>();

        products = new ProductController().getAllProuducts();

        int col = 0;
        for (Product product : products) {
            col++;
            System.out.println(product.toString());

            try {
                out.println("<div class=\"agile_top_brands_grids\">"
                        + "<div class=\"col-md-4 top_brand_left\">"
                        + "<div class=\"hover14 column\">"
                        + "<div class=\"agile_top_brand_left_grid\">"
                        + "<div class=\"agile_top_brand_left_grid_pos\">"
                        + "<img src=\"/SoftwareProject/resources/images/offer.png\" alt=\" \" class=\"img-responsive\" />"
                        + "</div>"
                        + "<div class=\"agile_top_brand_left_grid1\">"
                        + "<figure>"
                        + "<div class=\"snipcart-item block\">"
                        + "<div class=\"snipcart-thumb\">"
//                        + "<jsp:include page=\"/SoftwareProject/pages/dynamic/jspfragments/retrive_image.jsp\" >"
//                        + "  <jsp:param name=\"image\" value=\""+product.getProduct_id()+"\" />"
//                        + "</jsp:include>"
                        + "<a href=\"#\"><img src=/SoftwareProject/pages/dynamic/jspfragments/retrive_image.jsp?imgId="+product.getProduct_id()+" alt=\"" + product.getProduct_name() + " image\" width=133 height=133 class=\"img-responsive\"/></a>"
                        + "<p>" + product.getProduct_name() + "</p>"
                        + "<div class=\"stars\">"
                        + "<i class=\"fa fa-star blue-star\" aria-hidden=\"true\"></i>"
                        + "<i class=\"fa fa-star blue-star\" aria-hidden=\"true\"></i>"
                        + "<i class=\"fa fa-star blue-star\" aria-hidden=\"true\"></i>"
                        + "<i class=\"fa fa-star blue-star\" aria-hidden=\"true\"></i>"
                        + "<i class=\"fa fa-star gray-star\" aria-hidden=\"true\"></i>"
                        + "</div>"
                        + "<h4>$" + product.getProduct_price() + " <span>$" + (product.getProduct_price() + (product.getProduct_price() / 5)) + "</span></h4>"
                        + "</div>"
                        + "<div class=\"snipcart-details top_brand_home_details\">"
                        + "<form action=\"#\" method=\"post\">"
                        + "<fieldset>"
                        + "<input type=\"hidden\" name=\"cmd\" value=\"_cart\" />"
                        + "<input type=\"hidden\" name=\"add\" value=\"1\" />"
                        + "<input type=\"hidden\" name=\"business\" value=\" \" />"
                        + "<input type=\"hidden\" name=\"item_name\" value=\"Pepsi soft drink\" />"
                        + "<input type=\"hidden\" name=\"amount\" value=\"40.00\" />"
                        + "<input type=\"hidden\" name=\"discount_amount\" value=\"1.00\" />"
                        + "<input type=\"hidden\" name=\"currency_code\" value=\"USD\" />"
                        + "<input type=\"hidden\" name=\"return\" value=\" \" />"
                        + "<input type=\"hidden\" name=\"cancel_return\" value=\" \" />"
                        + "<input type=\"submit\" name=\"submit\" value=\"Add to cart\" class=\"button\" />"
                        + "</fieldset>"
                        + "</form>"
                        + "<p style=\"font-size:16px; font-style=Times New Roman \" > <a href=\"#\">" + product.getOwner().getUser_name() + " </a> | <a href=\"#\"> " + product.getProduct_category().getCat_name() + "</a></p>"
                        + "</div>"
                        + "</div>"
                        + "</figure>"
                        + "</div>"
                        + "</div>"
                        + "</div>"
                        + "</div>");
                if (col == 3) {
                    out.println("<div class=\"clearfix\"> </div>");
                    col = 0;
                }
//                    response.getOutputStream().write(product.getProduct_image());
//                    response.getOutputStream().flush();
//                    response.getOutputStream().close();
            } catch (IOException ex) {
                Logger.getLogger(indexLoadingProducts.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        try {
            out.println("<div class=\"clearfix\"> </div>");
        } catch (IOException ex) {
            Logger.getLogger(indexLoadingProducts.class.getName()).log(Level.SEVERE, null, ex);
        }


//        try {
//            while (rs.next()) {
//                col++;
//                try {
//                    product.add(new Product(rs.getString("product_name"), rs.getInt("owner_id"), rs.getBlob("product_image"), rs.getString("product_details"), rs.getInt("product_price"), rs.getInt("product_rate"), rs.getString("expiry_date"), rs.getString("product_date"), rs.getInt("product_category"), rs.getInt("likes"), rs.getInt("comments")));
//                    out.println("<div class=\"agile_top_brands_grids\">"
//                            + "<div class=\"col-md-4 top_brand_left\">"
//                            + "<div class=\"hover14 column\">"
//                            + "<div class=\"agile_top_brand_left_grid\">"
//                            + "<div class=\"agile_top_brand_left_grid_pos\">"
//                            + "<img src=\"images/offer.png\" alt=\" \" class=\"img-responsive\" />"
//                            + "</div>"
//                            + "<div class=\"agile_top_brand_left_grid1\">"
//                            + "<figure>"
//                            + "<div class=\"snipcart-item block\">"
//                            + "<div class=\"snipcart-thumb\">"
//                            + "<a href=\"products.html\"><img src=\"" + rs.getBlob("product_image") + "\" alt=\" \" class=\"img-responsive\" /></a>"
//                            + "<p>" + rs.getString("product_name") + "</p>"
//                            + "<div class=\"stars\">"
//                            + "<i class=\"fa fa-star blue-star\" aria-hidden=\"true\"></i>"
//                            + "<i class=\"fa fa-star blue-star\" aria-hidden=\"true\"></i>"
//                            + "<i class=\"fa fa-star blue-star\" aria-hidden=\"true\"></i>"
//                            + "<i class=\"fa fa-star blue-star\" aria-hidden=\"true\"></i>"
//                            + "<i class=\"fa fa-star gray-star\" aria-hidden=\"true\"></i>"
//                            + "</div>"
//                            + "<h4>$" + rs.getInt("product_price") + " <span>$" + (rs.getInt("product_price") + (rs.getInt("product_price") / 4)) + "</span></h4>"
//                            + "</div>"
//                            + "<div class=\"snipcart-details top_brand_home_details\">"
//                            + "<form action=\"#\" method=\"post\">"
//                            + "<fieldset>"
//                            + "<input type=\"hidden\" name=\"cmd\" value=\"_cart\" />"
//                            + "<input type=\"hidden\" name=\"add\" value=\"1\" />"
//                            + "<input type=\"hidden\" name=\"business\" value=\" \" />"
//                            + "<input type=\"hidden\" name=\"item_name\" value=\"Pepsi soft drink\" />"
//                            + "<input type=\"hidden\" name=\"amount\" value=\"40.00\" />"
//                            + "<input type=\"hidden\" name=\"discount_amount\" value=\"1.00\" />"
//                            + "<input type=\"hidden\" name=\"currency_code\" value=\"USD\" />"
//                            + "<input type=\"hidden\" name=\"return\" value=\" \" />"
//                            + "<input type=\"hidden\" name=\"cancel_return\" value=\" \" />"
//                            + "<input type=\"submit\" name=\"submit\" value=\"Add to cart\" class=\"button\" />"
//                            + "</fieldset>"
//                            + "</form>"
//                            + "</div>"
//                            + "</div>"
//                            + "</figure>"
//                            + "</div>"
//                            + "</div>"
//                            + "</div>"
//                            + "</div>");
//                    if (col == 3) {
//                        out.println("<div class=\"clearfix\"> </div>");
//                        col = 0;
//                    }
//                } catch (SQLException ex) {
//                    Logger.getLogger(indexLoadingProducts.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (IOException ex) {
//                    Logger.getLogger(indexLoadingProducts.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(indexLoadingProducts.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
