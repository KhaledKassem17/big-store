package com.software.team.BigStore.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author tito
 */
@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;

    private String user_name, user_password, credit_card, user_location, user_phone, user_email;

    /*
    - 0 if normal user
    - 1 if company user
     */
    private int userType;

    @Lob
    byte[] profile_image;

    @ManyToMany(cascade = CascadeType.ALL, targetEntity = SubCategory.class)
    @JoinTable(name = "user_intersts", joinColumns = {
        @JoinColumn(name = "user_id")}, inverseJoinColumns = {
        @JoinColumn(name = "interst_id")
    })
    List<SubCategory> intersts = new ArrayList();

    public User() {
    }

    public User(String user_name, String user_password, String credit_card, String user_location, String user_phone, String user_email, int userType, byte[] profile_image) {
        this.user_name = user_name;
        this.user_password = user_password;
        this.credit_card = credit_card;
        this.user_location = user_location;
        this.user_phone = user_phone;
        this.user_email = user_email;
        this.userType = userType;
        this.profile_image = profile_image;
    }

    public User(int user_id, String user_name, String user_password, String credit_card, String user_location, String user_phone, String user_email, int userType, byte[] profile_image) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.credit_card = credit_card;
        this.user_location = user_location;
        this.user_phone = user_phone;
        this.user_email = user_email;
        this.userType = userType;
        this.profile_image = profile_image;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(String credit_card) {
        this.credit_card = credit_card;
    }

    public String getUser_location() {
        return user_location;
    }

    public void setUser_location(String user_location) {
        this.user_location = user_location;
    }

    public byte[] getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(byte[] profile_image) {
        this.profile_image = profile_image;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public List<SubCategory> getIntersts() {
        return intersts;
    }

    public void setIntersts(List<SubCategory> intersts) {
        this.intersts = intersts;
    }

}
