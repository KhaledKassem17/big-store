package com.software.team.BigStore.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "NormalUser")
public class NormalUser extends User {

    private String normal_gender;
    private String birth_date;

    @ManyToMany(cascade = CascadeType.ALL, targetEntity = Company.class)
    @JoinTable(name = "companies_followers", joinColumns = {
        @JoinColumn(name = "normalUser_id")}, inverseJoinColumns = {
        @JoinColumn(name = "company_id")})
    List<Company> followingCompanies = new ArrayList();

    public NormalUser() {
    }

    public NormalUser(String normal_gender, String birth_date, String user_name, String user_password, String credit_card, String user_location, String user_phone, String user_email, int userType, byte[] profile_image) {
        super(user_name, user_password, credit_card, user_location, user_phone, user_email, userType, profile_image);
        this.normal_gender = normal_gender;
        this.birth_date = birth_date;
    }

    public NormalUser(int user_id, String user_name, String user_password, int user_type, String credit_card, String user_location, byte[] profile_image, String user_phone, String user_interests, String normal_gender, String normal_email, String birth_date) {
        super(user_id, user_name, user_password, credit_card, user_location, user_phone, user_name, user_type, profile_image);
        this.normal_gender = normal_gender;
        this.birth_date = birth_date;

    }

    public String getNormal_gender() {
        return normal_gender;
    }

    public void setNormal_gender(String normal_gender) {
        this.normal_gender = normal_gender;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public List<Company> getFollowingCompanies() {
        return followingCompanies;
    }

    public void setFollowingCompanies(List<Company> followingCompanies) {
        this.followingCompanies = followingCompanies;
    }
    
    

}
