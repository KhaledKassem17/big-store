/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.software.team.BigStore.Controllers;

import com.software.team.BigStore.DBConnections.Connection;
import com.software.team.BigStore.model.MainCategory;
import com.software.team.BigStore.model.Product;
import com.software.team.BigStore.model.SubCategory;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author tawfik
 */
public class ProductController {

    private Connection con = null;

    public ProductController() {
        con = new Connection();
    }

    public ArrayList<SubCategory> getCustomSubCats(String name){
        ArrayList<SubCategory> cats = new ArrayList<SubCategory>();

        Session session = con.getSession();

        Query query = session.createQuery("from SubCategory where cat_name LIKE '%"+name+"%'");
        cats = (ArrayList<SubCategory>) query.list();

        return cats;
    }

    public ArrayList<Product> getCustomProducts(String name){
        ArrayList<Product> products = new ArrayList<Product>();

        Session session = con.getSession();

        Query query = session.createQuery("from Product where product_name LIKE '%"+name+"%'");
        products = (ArrayList<Product>) query.list();

        return products;

    }

    public SubCategory getSubCategory(int cat_id) {
        SubCategory cat;
        Session session = con.getSession();

        cat = (SubCategory) session.get(SubCategory.class, cat_id);
        return cat;
    }

    public ArrayList<SubCategory> getCategories(String name){
        ArrayList<SubCategory> Categories;

        Session session = con.getSession();
        Query query = session.createQuery("from SubCategory where cat_name ='"+name+"'");
        Categories = (ArrayList<SubCategory>) query.list();

        return Categories;
    }

    public ArrayList<Product> getProducts(String product) {
        ArrayList<Product> products = new ArrayList<Product>();

        Session session = con.getSession();
        Query query = session.createQuery("from Product where product_name = '" + product + "'");
        products = (ArrayList<Product>) query.list();

        return products;
    }

    public ArrayList<Product> getLatestProducts() {

        //get current date
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date currentdate = new Date();

        System.out.println(dateFormat.format(currentdate));

        // convert date to calendar
        Calendar c = Calendar.getInstance();
        c.setTime(currentdate);

        c.add(Calendar.DATE, -7);       //substract 7 days from current date

        // convert calendar to date
        Date manipulatedDate = c.getTime();

        System.out.println(dateFormat.format(manipulatedDate));

        ArrayList<Product> latestprouducts;

        Session session = con.getSession();
        //select products whose date posted a week ago
        Query query = session.createQuery("from Product where post_date >= '" + dateFormat.format(manipulatedDate) + "'");
        latestprouducts = (ArrayList<Product>) query.list();

        return latestprouducts;
    }

    public ArrayList<Product> getUserProducts(int user_id) {
        ArrayList<Product> userprouducts;

        Session session = con.getSession();
        Query query = session.createQuery("from Product where owner = " + user_id);
        userprouducts = (ArrayList<Product>) query.list();

        return userprouducts;
    }

    public ArrayList<Product> getRecommendedProducts() {
        ArrayList<Product> recommendedprouducts;

        Session session = con.getSession();
        Query query = session.createQuery("from Product where product_rate > 3");
        recommendedprouducts = (ArrayList<Product>) query.list();

        return recommendedprouducts;
    }

    public ArrayList<Product> getAllProuducts() {
        ArrayList<Product> all_prouducts;

        Session session = con.getSession();
        Query query = session.createQuery("from Product");
        all_prouducts = (ArrayList<Product>) query.list();

        return all_prouducts;
    }

    public ArrayList<Product> getProuductsWithSubCategory(int sub_cat_id) {
        ArrayList<Product> prouducts;

        Session session = con.getSession();
        Query query = session.createQuery("from Product where prouduct_category = " + sub_cat_id);
        prouducts = (ArrayList<Product>) query.list();

        return prouducts;
    }

    public ArrayList<Product> getProuductsWithMainCategory(int cat_id) {
        ArrayList<Product> prouducts;

        ArrayList<SubCategory> subcats = getCategorySubs(cat_id);

        String q = "from Product where ";

        for (int i = 0; i < subcats.size(); i++) {
            q += "product_category = " + subcats.get(i).getSub_cat_id();
            if (i != subcats.size() - 1) {
                q += " OR ";
            }
        }
        System.out.println(q);

        Session session = con.getSession();
        Query query = session.createQuery(q);

        prouducts = (ArrayList<Product>) query.list();

        return prouducts;
    }

    public Product getProudct(int pr_id) {
        Product pr;
        Session session = con.getSession();

        pr = (Product) session.get(Product.class, pr_id);
        return pr;
    }

    public ArrayList<MainCategory> getMainCategories() {
        ArrayList<MainCategory> all_Categoryies;

        Session session = con.getSession();
        Query query = session.createQuery("from MainCategory");
        all_Categoryies = (ArrayList<MainCategory>) query.list();

        return all_Categoryies;
    }

    public ArrayList<SubCategory> getSubCategories() {
        ArrayList<SubCategory> Categoryies;

        Session session = con.getSession();
        Query query = session.createQuery("from SubCategory");
        Categoryies = (ArrayList<SubCategory>) query.list();

        return Categoryies;
    }

    public ArrayList<SubCategory> getCategorySubs(int cat_id) {
        ArrayList<SubCategory> Categoryies;

        Session session = con.getSession();
        Query query = session.createQuery("from SubCategory where parent_category_id = " + cat_id);
        Categoryies = (ArrayList<SubCategory>) query.list();
        session.close();
        return Categoryies;
    }

    public static void main(String[] args) {
        ProductController cn = new ProductController();
//        ArrayList<Product> prs = cn.getAllProuducts();
//        for (int i = 0; i < prs.size(); i++) {
//            System.out.println(prs.get(i).getProduct_name());
//        }

//        ArrayList<MainCategory> cats = cn.getMainCategories();
//
//        for (int i = 0; i < cats.size(); i++) {
//            System.out.println(cats.get(i).getCategory_name());
//            ArrayList<SubCategory> cats2 = cn.getCategorySubs(cats.get(i).getCategory_id());
//            for (int l = 0; l < cats2.size(); l++) {
//                System.out.println("\t" + cats2.get(l).getCat_name());
//            }
//        }
//        ArrayList<SubCategory> cats2 = cn.getCategorySubs(1);
//
//        for (int i = 0; i < cats.size(); i++) {
//            System.out.println(cats2.get(i).getCat_name());
//        }
//        ArrayList<Product> prs = cn.getProuductsWithMainCategory(2);
//
//        for (int i = 0; i < prs.size(); i++) {
//            System.out.println(prs.get(i).getProduct_name());
//        }
        ArrayList<Product> prs = cn.getProuductsWithSubCategory(2);

        for (int i = 0; i < prs.size(); i++) {
            System.out.println(prs.get(i).getProduct_name());
        }

    }

}
