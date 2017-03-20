package com.software.team.BigStore.Controllers;

import com.software.team.BigStore.DBConnections.Connection;
import com.software.team.BigStore.model.MainCategory;
import com.software.team.BigStore.model.Product;
import com.software.team.BigStore.model.SubCategory;
import com.software.team.BigStore.model.User;
import java.util.Date;
import org.hibernate.Session;



public class testController {

    Connection con;

    public testController() {
        con = new Connection();
    }

    public void insertMainCategory(MainCategory mc) {
        if (con == null) {
            con = new Connection();
        }
        Session session = con.getSession();
        session.save(mc);
        session.getTransaction().commit();
        session.close();

    }

    public void insertSubCategory(SubCategory sc) {
        if (con == null) {
            con = new Connection();
        }
        Session session = con.getSession();
        session.save(sc);
        session.getTransaction().commit();
        session.close();

    }

    public void insertProudct(Product pr) {
        if (con == null) {
            con = new Connection();
        }
        Session session = con.getSession();
        session.save(pr);
        session.getTransaction().commit();
        session.close();

    }

    public void insertUser(User usr) {
        if (con == null) {
            con = new Connection();
        }
        Session session = con.getSession();
        session.save(usr);
        session.getTransaction().commit();
        session.close();

    }

    public static void main(String[] args) {

        testController catCon = new testController();
//
//        MainCategory mcc = new MainCategory();
//        mcc.setCategory_name("clothes");
//        mcc.setCategory_icon(new byte[]{});
//        catCon.insertMainCategory(mcc);
//
//        SubCategory sub = new SubCategory();
//        sub.setCat_name("shirts");
//        sub.setCat_icon(new byte[]{});
//        sub.setCat_parent_id(mcc);
//        catCon.insertSubCategory(sub);
//
//        User usr = new User();
//        usr.setUser_name("Tawfik");
//        usr.setUser_email("titoelbadry6@gmail.com");
//        usr.setCredit_card("54545645645646");
//        usr.setUser_location("Egypt");
//        usr.setUser_password("123000");
//        usr.setUser_phone("01021617708");
//        usr.setUserType(1);
//        catCon.insertUser(usr);
//
//        for (int i = 0; i < 15; i++) {
//            Product prd = new Product();
//            prd.setProduct_id(1);
//            prd.setProduct_name("laptop" + (i * 9));
//            prd.setProduct_category(sub);
//            prd.setExpiry_date(new Date());
//            prd.setSelled(false);
//            prd.setPost_date(new Date());
//            prd.setProduct_details("fghjk bnmk ghjk tyuio bnm,");
//            prd.setProduct_image(new byte[]{});
//            prd.setProduct_price(1200.5);
//            prd.setProduct_rate(6);
//            prd.setOwner(usr);
//            catCon.insertProudct(prd);
//        }

        catCon.con.closeFactory();

    }

}
