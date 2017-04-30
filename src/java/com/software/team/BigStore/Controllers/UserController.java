package com.software.team.BigStore.Controllers;

import com.software.team.BigStore.DBConnections.Connection;
import com.software.team.BigStore.model.Comment;
import com.software.team.BigStore.model.Company;
import com.software.team.BigStore.model.NormalUser;
import com.software.team.BigStore.model.Product;
import com.software.team.BigStore.model.User;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.metamodel.source.annotations.JPADotNames;

/**
 *
 * @author Saad
 */
public class UserController {

    private Connection con = null;
    private Session session = null;

    public UserController() {
        con = new Connection();
        session = con.getSession();
    }

    public int checkUserType(int user_id) {
        //search for that user
        SQLQuery query = session.createSQLQuery("SELECT `userType` FROM `user` WHERE `user_id` = " + user_id);
        List<Integer> listusertype = query.list();

        if (listusertype.size() <= 0) {
            return -1;
        } else {
            return listusertype.get(0);
        }
    }

    public int getUserId(String email, String password) {
        //search for that user
        SQLQuery query = session.createSQLQuery("SELECT user_id FROM `user` WHERE `user_email` = '" + email + "' AND `user_password` = '" + password + "'");
        List<Integer> listuserids = query.list();

        if (listuserids.size() <= 0) {
            return -1;
        } else {
            return listuserids.get(0);
        }
    }

    public ArrayList<User> getNormalUser(String name) {
        ArrayList<User> normals = new ArrayList<User>();

        Query query = session.createQuery("from User where userType=0 AND user_name LIKE '%" + name + "%'");
        normals = (ArrayList<User>) query.list();

        return normals;
    }

    public ArrayList<User> getCompanyUser(String name) {
        ArrayList<User> companies = new ArrayList<User>();

        Query query = session.createQuery("from User where userType=1 AND user_name LIKE '%" + name + "%'");
        companies = (ArrayList<User>) query.list();

        return companies;
    }

    public ArrayList<NormalUser> getAllNormals() {
        ArrayList<NormalUser> normals = new ArrayList<NormalUser>();

        Query query = session.createQuery("from NormalUser");
        normals = (ArrayList<NormalUser>) query.list();

        return normals;
    }

    public ArrayList<Company> getAllCompanies() {
        ArrayList<Company> companies = new ArrayList<Company>();

        Query query = session.createQuery("from Company");
        companies = (ArrayList<Company>) query.list();

        return companies;
    }

    public User getUser(int user_id) {
        User user = (User) session.get(User.class, user_id);
        return user;
    }

    public NormalUser getNormal(int user_id) {
        NormalUser user = (NormalUser) session.get(NormalUser.class, user_id);
        return user;
    }

    public Company getCompany(int user_id) {
        Company user = (Company) session.get(Company.class, user_id);
        return user;
    }

    public void updateSpecificNormal(int user_id ,String gender, String date, String username, String password, String phone, String email, int type){
        SQLQuery sql = session.createSQLQuery("UPDATE user SET userType = "+type+", user_email = '"+email+"',"
                + " user_name = '"+username+"', user_password = '"+password+"', user_phone = '"+phone+"' "
                + "WHERE user_id = "+user_id+"");
        sql.executeUpdate();
        SQLQuery sql2 = session.createSQLQuery("UPDATE normaluser SET birth_date = '"+date+"', normal_gender = '"+gender+"' WHERE user_id ="+user_id);
        sql2.executeUpdate();
    }

    public void updateSpecificCompany(int user_id ,String address, String website, String username, String password, String phone, String email, int type){
        SQLQuery sql = session.createSQLQuery("UPDATE user SET userType = "+type+", user_email = '"+email+"',"
                + " user_name = '"+username+"', user_password = '"+password+"', user_phone = '"+phone+"' "
                + "WHERE user_id = "+user_id+"");
        sql.executeUpdate();
        SQLQuery sql2 = session.createSQLQuery("UPDATE companyuser SET address = '"+address+"', company_website = '"+website+"' WHERE user_id ="+user_id);
        sql2.executeUpdate();
    }

//    public void updateSpecificNormal(int user_id ,String gender, String date, String username, String password, String phone, String email, int type){
//        Query sql = session.createQuery("UPDATE User SET userType = :type, user_email = :email,"
//                + " user_name = :username , user_password = :password , user_phone = :phone"
//                + "WHERE user_id = :user_id");
//
//        sql.setParameter("type", type);
//        sql.setParameter("email", email);
//        sql.setParameter("username", username);
//        sql.setParameter("password", password);
//        sql.setParameter("phone", phone);
//        sql.setParameter("user_id", user_id);
//
//        sql.executeUpdate();
//        Query sql2 = session.createQuery("UPDATE NormalUser SET birth_date = :date, normal_gender = :gender WHERE user_id = :user_id");
//
//        sql2.setParameter("birth_date", date);
//        sql2.setParameter("gender", gender);
//        sql2.setParameter("user_id", user_id);
//
//        sql2.executeUpdate();
//    }
//
//    public void updateSpecificCompany(int user_id ,String address, String website, String username, String password, String phone, String email, int type){
//        Query sql = session.createQuery("UPDATE User SET userType = :type, user_email = :email,"
//                + " user_name = :username , user_password = :password , user_phone = :phone"
//                + "WHERE user_id = :user_id");
//
//        sql.setParameter("type", type);
//        sql.setParameter("email", email);
//        sql.setParameter("username", username);
//        sql.setParameter("password", password);
//        sql.setParameter("phone", phone);
//        sql.setParameter("user_id", user_id);
//
//        sql.executeUpdate();
//        Query sql2 = session.createQuery("UPDATE Company SET address = :address, company_website = :website WHERE user_id = :user_id");
//
//        sql2.setParameter("address", address);
//        sql2.setParameter("website", website);
//        sql2.setParameter("user_id", user_id);
//
//        sql2.executeUpdate();
//    }

    public void updateNormal(NormalUser normal) {
        session.update(normal);
    }

    public void updateCompany(Company company) {
        session.update(company);
    }

    public int saveNormal(NormalUser normal) {
        session.save(normal);

        NormalUser u = (NormalUser) session.createQuery("FROM NormalUser").setMaxResults(1).uniqueResult();

        int uid = u.getUser_id();

        return uid;
    }

    public ArrayList<Comment> getCommentsforProduct(int pro){
        ArrayList<Comment> Comments = new ArrayList<Comment>();
        
        Query query = session.createQuery("from Comment where post_id ="+pro);
        Comments = (ArrayList<Comment>) query.list();

        

        return Comments;
    }

    public ArrayList<Comment> getAllComments() {
        ArrayList<Comment> Comment = new ArrayList<Comment>();
        Query query = session.createQuery("from Comment order by comment_date desc");
        Comment = (ArrayList<Comment>) query.list();
        return Comment;
    }

    public void saveComment(Comment Comment) {
        session.save(Comment);
    }

    public int saveCompany(Company company) {
        session.save(company);

        Company u = (Company) session.createQuery("FROM Company").setMaxResults(1).uniqueResult();

        int uid = u.getUser_id();

        return uid;
    }

    public void commitChanges() {
        session.getTransaction().commit();
    }

    public boolean isFollowing(int user_id, int company_id) {

        NormalUser normal = (NormalUser) session.get(NormalUser.class, user_id);
        Company company = (Company) session.get(Company.class, company_id);

        List<Company> following = normal.getFollowingCompanies();
        for (int i = 0; i < following.size(); i++) {
            if (following.get(i).getUser_id() == company.getUser_id()) {
                return true;
            }

        }
        return false;
    }

    public int saveSQLComment(Product product, User user, String commentContent, String format) {
        String sql = "INSERT INTO Comment (comment_content, comment_date, commentor_id, prouduct_id)"
                + " VALUES ( :commentContent , :format , :user_id , :product_id )";
        Query qu = session.createSQLQuery(sql);
        qu.setParameter("commentContent", commentContent);
        qu.setParameter("format", format);
        qu.setParameter("user_id",user.getUser_id());
        qu.setParameter("product_id", product.getProduct_id());

        return qu.executeUpdate();

//        String sql = "INSERT INTO `comment` (`comment_content`, `comment_date`, `commentor_id`, `prouduct_id`)"
//                + " VALUES ( '"+commentContent+"' , '"+format+"' , "
//                + user.getUser_id()+" , "+product.getProduct_id()+" )";
//        SQLQuery qu = session.createSQLQuery(sql);
//        return qu.executeUpdate();

    }

}
