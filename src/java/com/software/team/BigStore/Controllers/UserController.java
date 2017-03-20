package com.software.team.BigStore.Controllers;

import com.software.team.BigStore.DBConnections.Connection;
import com.software.team.BigStore.model.Company;
import com.software.team.BigStore.model.NormalUser;
import com.software.team.BigStore.model.Product;
import com.software.team.BigStore.model.User;
import com.software.team.BigStore.statics.ref;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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

    public int checkUserType(int user_id){
        //search for that user
        SQLQuery query = session.createSQLQuery("SELECT `userType` FROM `user` WHERE `user_id` = "+user_id);
        List<Integer> listusertype = query.list();

        if(listusertype.size() <= 0){
            return -1;
        }else{
            return listusertype.get(0);
        }
    }

    public int getUserId(String email, String password){
        //search for that user
        SQLQuery query = session.createSQLQuery("SELECT user_id FROM `user` WHERE `user_email` = '"+email+"' AND `user_password` = '"+password+"'");
        List<Integer> listuserids = query.list();

        if(listuserids.size() <= 0){
            return -1;
        }else{
            return listuserids.get(0);
        }
    }

    public ArrayList<NormalUser> getAllNormals(){
        ArrayList<NormalUser> normals = new ArrayList<NormalUser>();

        Query query = session.createQuery("from NormalUser");
        normals = (ArrayList<NormalUser>) query.list();

        return normals;
    }

    public ArrayList<Company> getAllCompanies(){
        ArrayList<Company> companies = new ArrayList<Company>();

        Query query = session.createQuery("from Company");
        companies = (ArrayList<Company>) query.list();

        return companies;
    }

    public User getUser(int user_id){
        User user = (User) session.get(User.class ,user_id);
        return user;
    }

    public NormalUser getNormal(int user_id){
        NormalUser user = (NormalUser) session.get(NormalUser.class ,user_id);
        return user;
    }

    public Company getCompany(int user_id){
        Company user = (Company) session.get(Company.class ,user_id);
        return user;
    }

    public int saveNormal(NormalUser normal){
        session.save(normal);

        NormalUser u = (NormalUser) session.createQuery("FROM NormalUser").setMaxResults(1).uniqueResult();

        int uid = u.getUser_id();

        return uid;
    }

    public int saveCompany(Company company){
        session.save(company);

        Company u = (Company) session.createQuery("FROM Company").setMaxResults(1).uniqueResult();

        int uid = u.getUser_id();

        return uid;
    }

    public void commitChanges(){
        session.getTransaction().commit();
    }
}
