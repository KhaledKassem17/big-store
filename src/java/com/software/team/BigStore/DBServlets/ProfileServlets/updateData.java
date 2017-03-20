package com.software.team.BigStore.DBServlets.ProfileServlets;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;
import com.software.team.BigStore.model.Company;
import com.software.team.BigStore.model.NormalUser;
import com.software.team.BigStore.statics.ref;

/**
 *
 * @author Saad
 */
public class updateData {

    public updateData(JspWriter out, HttpServletRequest request, HttpServletResponse response) {
//        try {
//            StorageManager sm = new StorageManager();
//            ResultSet rs1 = sm.performQuery("SELECT * FROM `user` WHERE `user_id` = '" + ref.userid + "'");
//            String user_name = null, user_password = null, user_type = null, credit_card = null, user_location = null, profile_image = null, user_phone = null, user_interests = null, normal_gender = null, normal_email = null, birth_date = null, website = null;
//            int following = 0, followers = 0;
//            out.print("<p>ID : " + ref.userid + "<p>");
//            while (rs1.next()) {
//                user_name = rs1.getString(2);
//                user_password = rs1.getString(3);
//                user_type = rs1.getString(4);
//                credit_card = rs1.getString(5);
//                user_location = rs1.getString(6);
//                profile_image = rs1.getString(7);
//                user_phone = rs1.getString(8);
//                user_interests = rs1.getString(9);
//            }   out.println("<form action=\"UpdateUser\" method=\"post\">");
//            if (ref.usertype.equals("normal")) {
//                
//                ResultSet rs2 = sm.performQuery("SELECT * FROM `normal` WHERE `normal_id` = '" + ref.userid + "'");
//                NormalUser normalUser;
//                
//                String[] normalfields = {"Name", "Password", "Type", "Credit Card", "Location", "Profile Image", "Phone Number", "Interests", "Gender", "E-Mail", "Birth Date", "Following"};
//                
//                ArrayList<String> Data = new ArrayList();
//                
//                while (rs2.next()) {
//                    normal_gender = rs1.getString(2);
//                    normal_email = rs1.getString(3);
//                    birth_date = rs1.getString(4);
//                    following = rs1.getInt(5);
//                }
//                
//                normalUser = new NormalUser(user_name, user_password, user_type, credit_card, user_location, profile_image, user_phone, user_interests, normal_gender, normal_email, birth_date, following);
//                
//                Data.add(user_name);
//                Data.add(user_password);
//                Data.add(user_type);
//                Data.add(credit_card);
//                Data.add(user_location);
//                Data.add(profile_image);
//                Data.add(user_phone);
//                Data.add(user_interests);
//                Data.add(normal_gender);
//                Data.add(normal_email);
//                Data.add(birth_date);
//                Data.add(following + "");
//                
//                for (int i = 0; i < normalfields.length; i++) {
//                    if (normalfields[i].equals("Gender")) {
//                        out.println(normalfields[i] + "<select name=\"" + normalfields[i] + "\"><option>Male<option><option>Female<option></select>");
//                    } else if (normalfields[i].equals("Birth Data")) {
//                        out.println(normalfields[i] + "<input name=\"" + normalfields[i] + "\" type=\"date\" value=" + Data.get(i) + ">");
//                    } else {
//                        out.println(normalfields[i] + "<input name=\"" + normalfields[i] + "\" type=\"text\" value=\"" + Data.get(i) + "\" />");
//                    }
//                }
//                
//            } else {
//                
//                ResultSet rs2 = sm.performQuery("SELECT * FROM `company` WHERE `company_id` = '" + ref.userid + "'");
//                Company companyUser;
//                
//                String[] companyfields = {"Name", "Password", "Type", "Credit Card", "Location", "Profile Image", "Phone Number", "Interests", "Website", "Followers"};
//                
//                ArrayList<String> Data = new ArrayList();
//                
//                while (rs2.next()) {
//                    website = rs1.getString(2);
//                    followers = rs1.getInt(3);
//                }
//                
//                companyUser = new Company(website, followers, user_name, user_password, user_type, credit_card, user_location, profile_image, user_phone, user_interests);
//                
//                Data.add(user_name);
//                Data.add(user_password);
//                Data.add(user_type);
//                Data.add(credit_card);
//                Data.add(user_location);
//                Data.add(profile_image);
//                Data.add(user_phone);
//                Data.add(user_interests);
//                Data.add(website);
//                Data.add(followers + "");
//                
//                for (int i = 0; i < companyfields.length; i++) {
//                    out.println(companyfields[i] + "<input name=\"" + companyfields[i] + "\" type=\"text\" value=\"" + Data.get(i) + "\" />");
//                }
//                
//            }   out.println("</form>");
//        } catch (IOException ex) {
//            Logger.getLogger(updateData.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(updateData.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
