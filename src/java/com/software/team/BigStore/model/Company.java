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
@Table(name = "CompanyUser")
public class Company extends User {

    private String company_website;
    private String address;

    @ManyToMany(cascade = CascadeType.ALL, targetEntity = NormalUser.class)
    @JoinTable(name = "companies_followers", joinColumns = {
        @JoinColumn(name = "company_id")}, inverseJoinColumns = {
        @JoinColumn(name = "normalUser_id")})
    List<NormalUser> followers = new ArrayList();

    public Company() {
    }

    public Company(String company_website, String address, String user_name, String user_password, String credit_card, String user_location, String user_phone, String user_email, int userType, byte[] profile_image) {
        super(user_name, user_password, credit_card, user_location, user_phone, user_email, userType, profile_image);
        this.company_website = company_website;
        this.address = address;
    }

    public Company(int user_id, String user_name, String user_password, int user_type, String credit_card, String user_location, byte[] profile_image, String user_phone, String user_interests, String company_website, String address) {
        super(user_id, user_name, user_password, credit_card, user_location, user_phone, user_name, user_type, profile_image);
        this.company_website = company_website;
        this.address = address;
    }

    public String getCompany_website() {
        return company_website;
    }

    public void setCompany_website(String company_website) {
        this.company_website = company_website;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<NormalUser> getFollowers() {
        return followers;
    }

    public void setFollowers(List<NormalUser> followers) {
        this.followers = followers;
    }
    
    

}
